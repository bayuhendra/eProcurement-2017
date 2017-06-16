package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataPeralatan;
import com.agit.eProcure.core.domain.vendor.DataPeralatanRepository;
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
public class DataPeralatanHibernateRepository extends HibernateRepository implements DataPeralatanRepository {

    @Override
    public void SaveOrUpdate(DataPeralatan dataPeralatan) {
        getSession().saveOrUpdate(dataPeralatan);
    }

    @Override
    public void deleteData(DataPeralatan dataPeralatan) {
        Query query = getSession().createQuery("delete from com.agit.eProcure.core.domain.vendor.DataPeralatan where idDataPeralatan = :tid");
        query.setParameter("tid", dataPeralatan.getIdDataPeralatan());
        query.executeUpdate();
    }

    @Override
    public DataPeralatan findByID(String idDataPeralatan) {
        return (DataPeralatan) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataPeralatan where idDataPeralatan= :tid")
                .setParameter("tid", idDataPeralatan)
                .uniqueResult();
    }

    @Override
    public List<DataPeralatan> findAll() {
        return (List<DataPeralatan>) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataPeralatan")
                .list();
    }

    @Override
    public List<DataPeralatan> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(DataPeralatan.class);
        if (StringUtil.hasValue(map.get("idDataPeralatan"))) {
            criteria.add(Restrictions.like("idDataPeralatan", "%" + map.get("idDataPeralatan") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("jenis"))) {
            criteria.add(Restrictions.like("jenis", "%" + map.get("jenis") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("tahunPembuatan"))) {
            criteria.add(Restrictions.like("tahunPembuatan", "%" + map.get("tahunPembuatan") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("kondisiPeralatanSelect"))) {
            criteria.add(Restrictions.eq("kondisiPeralatan", map.get("kondisiPeralatanSelect")));
        }
        return criteria.list();
    }

}
