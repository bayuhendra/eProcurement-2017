package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Zaky
 */
public interface DataPenanggungJawabRepository {
    
    void SaveOrUpdate(DataPenanggungJawab dataPenanggungJawab);

    void deleteData(DataPenanggungJawab dataPenanggungJawab);

    DataPenanggungJawab findByID(String idDataPenanggungJawab);

    List<DataPenanggungJawab> findAll();

    List<DataPenanggungJawab> findByParams(Map map);
    
}
