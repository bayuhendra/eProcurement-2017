package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataPenanggungJawabDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Zaky
 */
public interface DataPenanggungJawabService {

    void SaveOrUpdate(DataPenanggungJawabDTO dataPenanggungJawab);

    void deleteData(DataPenanggungJawabDTO dataPenanggungJawab);

    DataPenanggungJawabDTO getDummyData();

    DataPenanggungJawabDTO findByID(String idPenanggungJawab);

    List<DataPenanggungJawabDTO> findAll();

    List<DataPenanggungJawabDTO> findByParams(Map map);
    
}
