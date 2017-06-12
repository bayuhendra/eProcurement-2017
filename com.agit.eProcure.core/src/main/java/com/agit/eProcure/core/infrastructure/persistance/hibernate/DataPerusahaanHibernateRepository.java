package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataLogin;
import com.agit.eProcure.core.domain.vendor.DataPerusahaan;
import com.agit.eProcure.core.domain.vendor.DataPerusahaanRepository;
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
 * @author Bayu Hendra Setiawan
 */
@Repository
@Transactional
public class DataPerusahaanHibernateRepository extends HibernateRepository implements DataPerusahaanRepository {

    @Override
    public void SaveOrUpdate(DataPerusahaan dataPerusahaan) {
        getSession().saveOrUpdate(dataPerusahaan);
    }

    @Override
    public void deleteData(DataPerusahaan dataPerusahaan) {
        Query query = getSession().createQuery("delete from com.agit.eProcure.core.domain.vendor.DataPerusahaan where idPerusahaan = :tid");
        query.setParameter("tid", dataPerusahaan.getIdPerusahaan());
        query.executeUpdate();
    }

    @Override
    public DataPerusahaan findByID(String idPerusahaan) {
        return (DataPerusahaan) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataPerusahaan where idPerusahaan= :tid")
                .setParameter("tid", idPerusahaan)
                .uniqueResult();
    }

    @Override
    public List<DataPerusahaan> findAll() {
        return (List<DataPerusahaan>) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataPerusahaan")
                .list();
    }

    @Override
    public List<DataPerusahaan> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(DataPerusahaan.class);
        if (StringUtil.hasValue(map.get("idPerusahaan"))) {
            criteria.add(Restrictions.like("idPerusahaan", "%" + map.get("idPerusahaan") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("namaPerusahaan"))) {
            criteria.add(Restrictions.like("namaPerusahaan", "%" + map.get("namaPerusahaan") + "%").ignoreCase());
        }
        return criteria.list();
    }
}
