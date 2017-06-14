/*
 */
package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataPeralatanDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Zaky
 */
public interface DataPeralatanService {

    void SaveOrUpdate(DataPeralatanDTO dataPeralatan);

    void deleteData(DataPeralatanDTO dataPeralatan);

    DataPeralatanDTO getDummyData();

    DataPeralatanDTO findByID(String idDataPeralatan);

    List<DataPeralatanDTO> findAll();

    List<DataPeralatanDTO> findByParams(Map map);
    
}
