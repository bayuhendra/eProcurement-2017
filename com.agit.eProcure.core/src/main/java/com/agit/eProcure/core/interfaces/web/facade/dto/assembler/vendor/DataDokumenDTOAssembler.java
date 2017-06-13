package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataDokumenDTO;
import com.agit.eProcure.common.dto.vendor.DataDokumenDTOBuilder;
import com.agit.eProcure.core.domain.vendor.DataDokumen;
import com.agit.eProcure.core.domain.vendor.DataDokumenBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3AD
 */
public class DataDokumenDTOAssembler implements IObjectAssembler<DataDokumen, DataDokumenDTO> {

    @Override
    public DataDokumenDTO toDTO(DataDokumen domainObject) {
        return new DataDokumenDTOBuilder()
                .setCreateBy(domainObject.getCreateBy())
                .setCreateDate(domainObject.getCreateDate())
                .setDokumenID(domainObject.getDokumenID())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .setNoDokumen(domainObject.getNoDokumen())
                .setSubject(domainObject.getSubject())
                .setTglAkhir(domainObject.getTglAkhir())
                .setTglTerbit(domainObject.getTglTerbit())
                .setUploadFile(domainObject.getUploadFile())
                .createDataDokumenDTO();
    }

    @Override
    public DataDokumen toDomain(DataDokumenDTO dtoObject) {
        return new DataDokumenBuilder()
                .setCreateBy(dtoObject.getCreateBy())
                .setCreateDate(dtoObject.getCreateDate())
                .setDokumenID(dtoObject.getDokumenID())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .setNoDokumen(dtoObject.getNoDokumen())
                .setSubject(dtoObject.getSubject())
                .setTglAkhir(dtoObject.getTglAkhir())
                .setTglTerbit(dtoObject.getTglTerbit())
                .setUploadFile(dtoObject.getUploadFile())
                .createDataDokumen();
    }

    public List<DataDokumen> toDomains(List<DataDokumenDTO> arg0) {
        List<DataDokumen> res = new ArrayList<>();
        for (DataDokumenDTO t : arg0) {
            res.add(new DataDokumenDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataDokumenDTO> toDTOs(List<DataDokumen> arg0) {
        List<DataDokumenDTO> res = new ArrayList<>();
        for (DataDokumen t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }
}
