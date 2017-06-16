package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataKeuangan;
import com.agit.eProcure.core.domain.vendor.DataKeuanganRepository;
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
public class DataKeuanganHibernateRepository extends HibernateRepository implements DataKeuanganRepository {

    @Override
    public void SaveOrUpdate(DataKeuangan dataKeuangan) {
        getSession().saveOrUpdate(dataKeuangan);
    }

    @Override
    public void deleteData(DataKeuangan dataKeuangan) {
        Query query = getSession().createQuery("DELETE FROM com.agit.eProcure.core.domain.vendor.DataKeuangan WHERE idDataKeuangan = :ida");
        query.setParameter("ida", dataKeuangan.getIdDataKeuangan());
        query.executeUpdate();
    }

    @Override
    public DataKeuangan findByID(String idDataKeuangan) {
        return (DataKeuangan) getSession()
                .createQuery("FROM com.agit.eProcure.core.domain.vendor.DataKeuangan WHERE idDataKeuangan = :ida")
                .setParameter("ida", idDataKeuangan)
                .uniqueResult();
    }

    @Override
    public List<DataKeuangan> findAll() {
        return (List<DataKeuangan>) getSession().createQuery("FROM com.agit.eProcure.core.domain.vendor.DataKeuangan")
                .list();
    }

    @Override
    public List<DataKeuangan> findByParam(Map map) {
        Criteria criteria = getSession().createCriteria(DataKeuangan.class);
        if (StringUtil.hasValue(map.get("auditID"))) {
            criteria.add(Restrictions.like("auditID", "%" + map.get("auditID") + "%").ignoreCase());
        }
        return criteria.list();
    }

}
