package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataBankRepository {

    void SaveOrUpdate(DataBank dataBank);

    void deleteData(DataBank dataBank);

    DataBank findByID(String idDataBank);

    List<DataBank> findAll();

    List<DataBank> findByParams(Map map);

}
