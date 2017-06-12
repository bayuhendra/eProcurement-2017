package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataBankDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataBankService {

    void SaveOrUpdate(DataBankDTO dataBank);

    void deleteData(DataBankDTO dataBank);

    DataBankDTO getDummyData();

    DataBankDTO findByID(String idDataBank);

    List<DataBankDTO> findAll();

    List<DataBankDTO> findByParams(Map map);

}
