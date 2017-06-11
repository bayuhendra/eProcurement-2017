package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataLoginRepository {

    void SaveOrUpdate(DataLogin dataLogin);

    void deleteData(DataLogin dataLogin);

    DataLogin findByID(String idDataLogin);

    List<DataLogin> findAll();

    List<DataLogin> findByParams(Map map);

}
