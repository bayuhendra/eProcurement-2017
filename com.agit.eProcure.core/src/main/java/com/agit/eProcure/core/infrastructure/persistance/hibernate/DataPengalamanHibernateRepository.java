package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataPengalaman;
import com.agit.eProcure.core.domain.vendor.DataPengalamanRepository;
import com.agit.eProcure.util.StringUtil;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 3AD
 */
@Transactional
public class DataPengalamanHibernateRepository extends HibernateRepository implements DataPengalamanRepository {

    @Override
    public void SaveOrUpdate(DataPengalaman dataPengalaman) {
        getSession().saveOrUpdate(dataPengalaman);
    }

    @Override
    public void deleteData(DataPengalaman dataPengalaman) {
        Query query = getSession().createQuery("DELETE FROM com.agit.eProcure.core.domain.vendor.DataPengalaman WHERE idDataPengalaman = :idp");
        query.setParameter("idp", dataPengalaman.getIdDataPengalaman());
        query.executeUpdate();
    }

    @Override
    public DataPengalaman findByID(String idDataPengalaman) {
        return (DataPengalaman) getSession()
                .createQuery("FROM com.agit.eProcure.core.domain.vendor.DataPengalaman WHERE idDataPengalaman = :idp")
                .setParameter("idp", idDataPengalaman)
                .uniqueResult();
    }

    @Override
    public List<DataPengalaman> findAll() {
        return (List<DataPengalaman>) getSession()
                .createQuery("FROM com.agit.eProcure.core.domain.vendor.DataPengalaman")
                .list();
    }

    @Override
    public List<DataPengalaman> findByParam(Map map) {
        Criteria criteria = getSession().createCriteria(DataPengalaman.class);
        if (StringUtil.hasValue(map.get("idDataPengalaman"))) {
            criteria.add(Restrictions.like("idDataPengalaman", "%" + map.get("idDataPengalaman") + "%").ignoreCase());
        }
        return criteria.list();
    }

}
