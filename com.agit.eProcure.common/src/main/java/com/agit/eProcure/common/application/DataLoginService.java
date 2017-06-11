package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataLoginService {

    void SaveOrUpdate(DataLoginDTO dataLogin);

    void deleteData(DataLoginDTO dataLogin);

    DataLoginDTO getDummyData();

    DataLoginDTO findByID(String idDataLogin);

    List<DataLoginDTO> findAll();

    List<DataLoginDTO> findByParams(Map map);

}
