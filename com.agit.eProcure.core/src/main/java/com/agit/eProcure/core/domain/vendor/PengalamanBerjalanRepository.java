package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface PengalamanBerjalanRepository {

    void saveOrUpdate(PengalamanBerjalan pengalamanBerjalan);

    void delete(PengalamanBerjalan pengalamanBerjalan);

    PengalamanBerjalan findByID(String idPengalamanBerjalan);

    List<PengalamanBerjalan> findAll();

    List<PengalamanBerjalan> findByParam(Map map);
}
