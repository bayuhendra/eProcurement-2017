package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataPenanggungJawab;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawabRepository;
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
 * @author Zaky
 */
@Repository
@Transactional
public class DataPenanggungJawabHibernateRepository extends HibernateRepository implements DataPenanggungJawabRepository{

    @Override
    public void SaveOrUpdate(DataPenanggungJawab dataPenanggungJawab) {
        getSession().saveOrUpdate(dataPenanggungJawab);
    }

    @Override
    public void deleteData(DataPenanggungJawab dataPenanggungJawab) {
        Query query = getSession().createQuery("delete from com.agit.eProcure.core.domain.vendor.DataPenanggungJawab where idPenanggungJawab = :tid");
        query.setParameter("tid", dataPenanggungJawab.getIdPenanggungJawab());
        query.executeUpdate();
    }

    @Override
    public DataPenanggungJawab findByID(String idDataPenanggungJawab) {
        return (DataPenanggungJawab) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataPenanggungJawab where idPenanggungJawab= :tid")
                .setParameter("tid", idDataPenanggungJawab)
                .uniqueResult();
    }

    @Override
    public List<DataPenanggungJawab> findAll() {
        return (List<DataPenanggungJawab>) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataPenanggungJawab")
                .list();
    }

    @Override
    public List<DataPenanggungJawab> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(DataPenanggungJawab.class);
        if (StringUtil.hasValue(map.get("idDataPenanggungJawab"))) {
            criteria.add(Restrictions.like("idPenanggungJawab", "%" + map.get("idPenanggungJawab") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("namaPenanggungJawab"))) {
            criteria.add(Restrictions.like("namaPenanggungJawab", "%" + map.get("namaPenanggungJawab") + "%").ignoreCase());
        }
        return criteria.list();
    }
    
}
