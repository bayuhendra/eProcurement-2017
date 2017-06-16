package com.agit.eProcure.core.infrastructure.persistance.hibernate;

import com.agit.eProcure.core.domain.vendor.DataSegmentasi;
import com.agit.eProcure.core.domain.vendor.DataSegmentasiRepository;
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
public class DataSegmentasiHibernateRepository extends HibernateRepository implements DataSegmentasiRepository {

    @Override
    public void SaveOrUpdate(DataSegmentasi dataSegmentasi) {
        getSession().saveOrUpdate(dataSegmentasi);
    }

    @Override
    public void deleteData(DataSegmentasi dataSegmentasi) {
        Query query = getSession().createQuery("delete from com.agit.eProcure.core.domain.vendor.DataSegmentasi where idDataSegmentasi = :tid");
        query.setParameter("tid", dataSegmentasi.getIdDataSegmentasi());
        query.executeUpdate();
    }

    @Override
    public DataSegmentasi findByID(String idDataSegmentasi) {
        return (DataSegmentasi) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataSegmentasi where idDataSegmentasi= :tid")
                .setParameter("tid", idDataSegmentasi)
                .uniqueResult();
    }

    @Override
    public List<DataSegmentasi> findAll() {
        return (List<DataSegmentasi>) getSession()
                .createQuery("from com.agit.eProcure.core.domain.vendor.DataSegmentasi")
                .list();
    }

    @Override
    public List<DataSegmentasi> findByParams(Map map) {
        Criteria criteria = getSession().createCriteria(DataSegmentasi.class);
        if (StringUtil.hasValue(map.get("idDataSegmentasi"))) {
            criteria.add(Restrictions.like("idDataSegmentasi", "%" + map.get("idDataSegmentasi") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("nomorAssosiasi"))) {
            criteria.add(Restrictions.like("nomorAssosiasi", "%" + map.get("nomorAssosiasi") + "%").ignoreCase());
        }
        if (StringUtil.hasValue(map.get("bidangUsahaSelect"))) {
            criteria.add(Restrictions.eq("bidangUsahaType", map.get("bidangUsahaSelect")));
        }
        if (StringUtil.hasValue(map.get("tanggalMulai"))) {
            criteria.add(Restrictions.eq("tanggalMulai", map.get("tanggalMulai")));
        }
        return criteria.list();
    }
}
