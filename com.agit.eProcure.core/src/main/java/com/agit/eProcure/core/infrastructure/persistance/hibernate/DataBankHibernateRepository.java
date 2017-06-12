package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataBank;
import com.agit.eProcure.core.domain.vendor.DataBankRepository;
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
public class DataBankHibernateRepository extends HibernateRepository implements DataBankRepository {

    @Override
    public void SaveOrUpdate(DataBank dataBank) {
        getSession().saveOrUpdate(dataBank);
    }

    @Override
    public void deleteData(DataBank dataBank) {
        Query query = getSession().createQuery("delete from com.agit.eProcure.core.domain.vendor.DataBank where idDataBank = :tid");
        query.setParameter("tid", dataBank.getIdDataBank());
        query.executeUpdate();
    }

    @Override
    public DataBank findByID(String idDataBank) {
        return (DataBank) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataBank where idDataBank= :tid")
                .setParameter("tid", idDataBank)
                .uniqueResult();
    }

    @Override
    public List<DataBank> findAll() {
        return (List<DataBank>) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataBank")
                .list();
    }

    @Override
    public List<DataBank> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(DataBank.class);
        if (StringUtil.hasValue(map.get("idDataBank"))) {
            criteria.add(Restrictions.like("idDataBank", "%" + map.get("idDataBank") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("namaBank"))) {
            criteria.add(Restrictions.like("namaBank", "%" + map.get("namaBank") + "%").ignoreCase());
        }
        return criteria.list();
    }
}
