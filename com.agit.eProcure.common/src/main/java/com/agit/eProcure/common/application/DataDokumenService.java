package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataDokumenDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface DataDokumenService {

    void saveOrUpdate(DataDokumenDTO dataDokumen);

    void delete(DataDokumenDTO dataDokumen);

    DataDokumenDTO findByID(String dokumenID);

    List<DataDokumenDTO> findAll();

    List<DataDokumenDTO> findByParams(Map map);

    DataDokumenDTO getDummy();
}
