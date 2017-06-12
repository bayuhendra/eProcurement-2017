package com.agit.eProcure.core.domain.vendor;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataSegmentasiRepository {

    void SaveOrUpdate(DataSegmentasi dataSegmentasi);

    void deleteData(DataSegmentasi dataSegmentasi);

    DataSegmentasi findByID(String idDataSegmentasi);

    List<DataSegmentasi> findAll();

    List<DataSegmentasi> findByParams(Map map);

}
