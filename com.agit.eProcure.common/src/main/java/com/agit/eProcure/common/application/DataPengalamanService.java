package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataPengalamanDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface DataPengalamanService {

    void SaveOrUpdate(DataPengalamanDTO dataPengalaman);

    void deleteData(DataPengalamanDTO dataPengalaman);

    DataPengalamanDTO getDummyData();

    DataPengalamanDTO findByID(String idDataPengalaman);

    List<DataPengalamanDTO> findAll();

    List<DataPengalamanDTO> findByParams(Map map);
}
