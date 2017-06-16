package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface DataKeuanganRepository {

    void SaveOrUpdate(DataKeuangan dataKeuangan);

    void deleteData(DataKeuangan dataKeuangan);

    DataKeuangan findByID(String idDataKeuangan);

    List<DataKeuangan> findAll();

    List<DataKeuangan> findByParam(Map map);
}
