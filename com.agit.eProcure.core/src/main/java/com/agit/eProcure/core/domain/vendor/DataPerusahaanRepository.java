package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataPerusahaanRepository {

    void SaveOrUpdate(DataPerusahaan dataPerusahaan);

    void deleteData(DataPerusahaan dataPerusahaan);

    DataPerusahaan findByID(String idPerusahaan);

    List<DataPerusahaan> findAll();

    List<DataPerusahaan> findByParams(Map map);

}
