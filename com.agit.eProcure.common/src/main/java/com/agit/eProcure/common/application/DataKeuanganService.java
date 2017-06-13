package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataKeuanganDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface DataKeuanganService {

    void saveOrUpdate(DataKeuanganDTO dataKeuangan);

    void delete(DataKeuanganDTO dataKeuangan);

    DataKeuanganDTO findByID(String auditID);

    List<DataKeuanganDTO> findAll();

    List<DataKeuanganDTO> findByParams(Map map);

    DataKeuanganDTO getDummy();
}
