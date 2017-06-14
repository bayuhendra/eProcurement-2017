/*
 */
package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Zaky
 */
public interface DataPeralatanRepository {
    
    void SaveOrUpdate(DataPeralatan dataPeralatan);

    void deleteData(DataPeralatan dataPeralatan);

    DataPeralatan findByID(String idDataPeralatan);

    List<DataPeralatan> findAll();

    List<DataPeralatan> findByParams(Map map);
}
