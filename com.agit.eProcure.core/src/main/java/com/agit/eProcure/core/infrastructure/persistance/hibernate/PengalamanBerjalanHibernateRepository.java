package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.PengalamanBerjalan;
import com.agit.eProcure.core.domain.vendor.PengalamanBerjalanRepository;
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
public class PengalamanBerjalanHibernateRepository extends HibernateRepository implements PengalamanBerjalanRepository {

    @Override
    public void saveOrUpdate(PengalamanBerjalan pengalamanBerjalan) {
        getSession().saveOrUpdate(pengalamanBerjalan);
    }

    @Override
    public void delete(PengalamanBerjalan pengalamanBerjalan) {
        Query query = getSession().createQuery("DELETE FROM com.agit.eProcure.core.domain.vendor.PengalamanBerjalan WHERE idPengalamanBerjalan = :idp");
        query.setParameter("idp", pengalamanBerjalan.getIdPengalamanBerjalan());
        query.executeUpdate();
    }

    @Override
    public PengalamanBerjalan findByID(String idPengalamanBerjalan) {
        return (PengalamanBerjalan) getSession()
                .createQuery("FROM com.agit.eProcure.core.domain.vendor.PengalamanBerjalan WHERE idPengalamanBerjalan = :idp")
                .setParameter("idp", idPengalamanBerjalan)
                .uniqueResult();
    }

    @Override
    public List<PengalamanBerjalan> findAll() {
        return (List<PengalamanBerjalan>) getSession().createQuery("FROM com.agit.eProcure.core.domain.vendor.PengalamanBerjalan")
                .list();
    }

    @Override
    public List<PengalamanBerjalan> findByParam(Map map) {
        Criteria criteria = getSession().createCriteria(PengalamanBerjalan.class);
        if (StringUtil.hasValue(map.get("idPengalamanBerjalan"))) {
            criteria.add(Restrictions.like("idPengalamanBerjalan", "%" + map.get("idPengalamanBerjalan") + "%").ignoreCase());
        }
        return criteria.list();
    }
}
