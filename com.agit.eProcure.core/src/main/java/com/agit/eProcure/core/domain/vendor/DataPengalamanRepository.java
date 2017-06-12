package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface DataPengalamanRepository {

    void SaveOrUpdate(DataPengalaman dataPengalaman);

    void deleteData(DataPengalaman dataPengalaman);

    DataPengalaman findByID(String idDataPengalaman);

    List<DataPengalaman> findAll();

    List<DataPengalaman> findByParam(Map map);
}
