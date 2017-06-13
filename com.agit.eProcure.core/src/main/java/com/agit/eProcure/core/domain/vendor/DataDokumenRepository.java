package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author 3AD
 */
public interface DataDokumenRepository {

    void SaveOrUpdate(DataDokumen dataDokumen);

    void deleteData(DataDokumen dataDokumen);

    DataDokumen findByID(String dokumenID);

    List<DataDokumen> findAll();

    List<DataDokumen> findByParam(Map map);
}
