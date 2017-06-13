package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.PengalamanBerjalanDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface PengalamanBerjalanService {

    void saveOrUpdate(PengalamanBerjalanDTO pengalamanBerjalan);

    void delete(PengalamanBerjalanDTO pengalamanBerjalan);

    PengalamanBerjalanDTO findByID(String idPengalamanBerjalan);

    List<PengalamanBerjalanDTO> findAll();

    List<PengalamanBerjalanDTO> findByParams(Map map);

    PengalamanBerjalanDTO getDummy();
}
