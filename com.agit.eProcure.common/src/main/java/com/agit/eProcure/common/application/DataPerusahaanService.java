package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataPerusahaanService {

    void SaveOrUpdate(DataPerusahaanDTO dataPerusahaan);

    void deleteData(DataPerusahaanDTO dataPerusahaan);

    DataPerusahaanDTO getDummyData();

    DataPerusahaanDTO findByID(String idPerusahaan);

    List<DataPerusahaanDTO> findAll();

    List<DataPerusahaanDTO> findByParams(Map map);

}
