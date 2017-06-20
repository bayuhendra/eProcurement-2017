package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataPenanggungJawabDTO;
import com.agit.eProcure.common.dto.vendor.DataPenanggungJawabDTOBuilder;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawab;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawabBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Zaky
 */
public class DataPenanggungJawabDTOAssembler implements IObjectAssembler<DataPenanggungJawab, DataPenanggungJawabDTO> {

    @Override
    public DataPenanggungJawabDTO toDTO(DataPenanggungJawab domainObject) {
        return new DataPenanggungJawabDTOBuilder()
                .setIdPerusahaan(domainObject.getIdPerusahaan())
                .setIdPenanggungJawab(domainObject.getIdPenanggungJawab())
                .setNamaPenanggungJawab(domainObject.getNamaPenanggungJawab())
                .setJabatanType(domainObject.getJabatanType())
                .setEmailPenanggungJawab(domainObject.getEmailPenanggungJawab())
                .setCreatedBy(domainObject.getCreatedBy())
                .setCreatedDate(domainObject.getCreatedDate())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .createDataPenanggungJawabDTO();
    }

    @Override
    public DataPenanggungJawab toDomain(DataPenanggungJawabDTO dtoObject) {
        return new DataPenanggungJawabBuilder()
                .setIdPerusahaan(dtoObject.getIdPerusahaan())
                .setIdPenanggungJawab(dtoObject.getIdPenanggungJawab())
                .setNamaPenanggungJawab(dtoObject.getNamaPenanggungJawab())
                .setJabatanType(dtoObject.getJabatanType())
                .setEmailPenanggungJawab(dtoObject.getEmailPenanggungJawab())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setCreatedDate(dtoObject.getCreatedDate())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .createDataPenanggungJawab();
    }

    public List<DataPenanggungJawab> toDomain(List<DataPenanggungJawabDTO> arg0) {
        List<DataPenanggungJawab> res = new ArrayList<>();
        for (DataPenanggungJawabDTO t : arg0) {
            res.add(new DataPenanggungJawabDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataPenanggungJawabDTO> toDTO(List<DataPenanggungJawab> arg0) {
        List<DataPenanggungJawabDTO> res = new ArrayList<>();
        for (DataPenanggungJawab t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

    public Set<DataPenanggungJawab> toDomains(Set<DataPenanggungJawabDTO> arg0) {
        Set<DataPenanggungJawab> res = new HashSet<>();
        for (DataPenanggungJawabDTO t : arg0) {
            res.add(new DataPenanggungJawabDTOAssembler().toDomain(t));
        }
        return res;
    }

    public Set<DataPenanggungJawabDTO> toDTOs(Set<DataPenanggungJawab> arg0) {
        Set<DataPenanggungJawabDTO> res = new HashSet<>();
        for (DataPenanggungJawab t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }
}
