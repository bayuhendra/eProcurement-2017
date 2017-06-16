package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataLogin;
import com.agit.eProcure.core.domain.vendor.DataLoginRepository;
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
public class DataLoginHibernateRepository extends HibernateRepository implements DataLoginRepository {

    @Override
    public void SaveOrUpdate(DataLogin dataLogin) {
        getSession().saveOrUpdate(dataLogin);
    }

    @Override
    public void deleteData(DataLogin dataLogin) {
        Query query = getSession().createQuery("delete from com.agit.eProcure.core.domain.vendor.DataLogin where idDataLogin = :tid");
        query.setParameter("tid", dataLogin.getIdDataLogin());
        query.executeUpdate();
    }

    @Override
    public DataLogin findByID(String idDataLogin) {
        return (DataLogin) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataLogin where idDataLogin= :tid")
                .setParameter("tid", idDataLogin)
                .uniqueResult();
    }

    @Override
    public List<DataLogin> findAll() {
        return (List<DataLogin>) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataLogin")
                .list();
    }

    @Override
    public List<DataLogin> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(DataLogin.class);
        if (StringUtil.hasValue(map.get("idDatalogin"))) {
            criteria.add(Restrictions.like("idDatalogin", "%" + map.get("idDatalogin") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("namaPengguna"))) {
            criteria.add(Restrictions.like("namaPengguna", "%" + map.get("namaPengguna") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("idUser"))) {
            criteria.add(Restrictions.eq("idUser", map.get("idUser")));
        }
        return criteria.list();
    }
}
