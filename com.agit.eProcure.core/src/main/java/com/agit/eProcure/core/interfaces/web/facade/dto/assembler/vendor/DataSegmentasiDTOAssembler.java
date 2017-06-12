package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTOBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;
import com.agit.eProcure.core.domain.vendor.DataSegmentasi;
import com.agit.eProcure.core.domain.vendor.DataSegmentasiBuilder;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataSegmentasiDTOAssembler implements IObjectAssembler<DataSegmentasi, DataSegmentasiDTO> {

    @Override
    public DataSegmentasiDTO toDTO(DataSegmentasi domainObject) {
        return new DataSegmentasiDTOBuilder()
                .setIdDataSegmentasi(domainObject.getIdDataSegmentasi())
                .setBidangUsahaType(domainObject.getBidangUsahaType())
                .setAssosiasiType(domainObject.getAssosiasiType())
                .setNomorAssosiasi(domainObject.getNomorAssosiasi())
                .setTanggalMulai(domainObject.getTanggalMulai())
                .setTanggalBerakhir(domainObject.getTanggalBerakhir())
                .setCreatedBy(domainObject.getCreatedBy())
                .setCreatedDate(domainObject.getCreatedDate())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .createDataSegmentasiDTO();
    }

    @Override
    public DataSegmentasi toDomain(DataSegmentasiDTO dtoObject) {
        return new DataSegmentasiBuilder()
                .setIdDataSegmentasi(dtoObject.getIdDataSegmentasi())
                .setBidangUsahaType(dtoObject.getBidangUsahaType())
                .setAssosiasiType(dtoObject.getAssosiasiType())
                .setNomorAssosiasi(dtoObject.getNomorAssosiasi())
                .setTanggalMulai(dtoObject.getTanggalMulai())
                .setTanggalBerakhir(dtoObject.getTanggalBerakhir())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setCreatedDate(dtoObject.getCreatedDate())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .createDataSegmentasi();
    }

    public List<DataSegmentasi> toDomain(List<DataSegmentasiDTO> arg0) {
        List<DataSegmentasi> res = new ArrayList<>();
        for (DataSegmentasiDTO t : arg0) {
            res.add(new DataSegmentasiDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataSegmentasiDTO> toDTO(List<DataSegmentasi> arg0) {
        List<DataSegmentasiDTO> res = new ArrayList<>();
        for (DataSegmentasi t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
