package com.agit.eProcure.common.application;

import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public interface DataSegmentasiService {

    void SaveOrUpdate(DataSegmentasiDTO dataSegmentasi);

    void deleteData(DataSegmentasiDTO dataSegmentasi);

    DataSegmentasiDTO getDummyData();

    DataSegmentasiDTO findByID(String idDataSegmentasi);

    List<DataSegmentasiDTO> findAll();

    List<DataSegmentasiDTO> findByParams(Map map);

}
