/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataDokumen;
import com.agit.eProcure.core.domain.vendor.DataDokumenRepository;
import com.agit.eProcure.util.StringUtil;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 3AD
 */
@Repository
@Transactional
public class DataDokumenHibernateRepository extends HibernateRepository implements DataDokumenRepository {

    @Override
    public void SaveOrUpdate(DataDokumen dataDokumen) {
        getSession().saveOrUpdate(dataDokumen);
    }

    @Override
    public void deleteData(DataDokumen dataDokumen) {
        Query query = getSession().createQuery("DELETE FROM com.agit.eProcure.core.domain.vendor.DataDokumen WHERE dokumenID = :ida");
        query.setParameter("ida", dataDokumen.getDokumenID());
        query.executeUpdate();
    }

    @Override
    public DataDokumen findByID(String dokumenID) {
        return (DataDokumen) getSession()
                .createQuery("FROM com.agit.eProcure.core.domain.vendor.DataDokumen WHERE dokumenID = :ida")
                .setParameter("ida", dokumenID)
                .uniqueResult();
    }

    @Override
    public List<DataDokumen> findAll() {
        return (List<DataDokumen>) getSession().createQuery("FROM com.agit.eProcure.core.domain.vendor.DataDokumen")
                .list();
    }

    @Override
    public List<DataDokumen> findByParam(Map map) {
        Criteria criteria = getSession().createCriteria(DataDokumen.class);
        if (StringUtil.hasValue(map.get("dokumenID"))) {
            criteria.add(Restrictions.like("dokumenID", "%" + map.get("dokumenID") + "%").ignoreCase());
        }
        return criteria.list();
    }

}
