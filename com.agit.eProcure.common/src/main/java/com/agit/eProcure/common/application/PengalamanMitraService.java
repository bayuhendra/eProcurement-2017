package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.PengalamanMitraDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface PengalamanMitraService {

    void saveOrUpdate(PengalamanMitraDTO pengalamanMitra);

    void delete(PengalamanMitraDTO pengalamanMitra);

    PengalamanMitraDTO findByID(String mitraID);

    List<PengalamanMitraDTO> findAll();

    List<PengalamanMitraDTO> findByParams(Map map);

    PengalamanMitraDTO getDummy();
}
