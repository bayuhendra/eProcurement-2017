package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.PengalamanMitra;
import com.agit.eProcure.core.domain.vendor.PengalamanMitraRepository;
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
public class PengalamanMitraHibernateRepository extends HibernateRepository implements PengalamanMitraRepository {

    @Override
    public void saveOrUpdate(PengalamanMitra pengalamanMitra) {
        getSession().saveOrUpdate(pengalamanMitra);
    }

    @Override
    public void delete(PengalamanMitra pengalamanMitra) {
        Query query = getSession().createQuery("DELETE FROM com.agit.eProcure.core.domain.vendor.PengalamanMitra WHERE mitraID = :idm");
        query.setParameter("idm", pengalamanMitra.getMitraID());
        query.executeUpdate();

    }

    @Override
    public PengalamanMitra findByID(String mitraID) {
        return (PengalamanMitra) getSession()
                .createQuery("FROM com.agit.eProcure.core.domain.vendor.PengalamanMitra WHERE mitraID = :idm")
                .setParameter("idm", mitraID)
                .uniqueResult();

    }

    @Override
    public List<PengalamanMitra> findAll() {
        return (List<PengalamanMitra>) getSession().createQuery("FROM com.agit.eProcure.core.domain.vendor.PengalamanMitra")
                .list();
    }

    @Override
    public List<PengalamanMitra> findByParam(Map map) {
        Criteria criteria = getSession().createCriteria(PengalamanMitra.class);
        if (StringUtil.hasValue(map.get("mitraID"))) {
            criteria.add(Restrictions.like("mitraID", "%" + map.get("mitraID") + "%").ignoreCase());
        }
        return criteria.list();
    }

}
