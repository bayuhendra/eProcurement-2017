package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTOBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;
import com.agit.eProcure.core.domain.vendor.DataPerusahaan;
import com.agit.eProcure.core.domain.vendor.DataPerusahaanBuilder;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataPerusahaanDTOAssembler implements IObjectAssembler<DataPerusahaan, DataPerusahaanDTO> {

    @Override
    public DataPerusahaanDTO toDTO(DataPerusahaan domainObject) {
        return new DataPerusahaanDTOBuilder()
                .setIdPerusahaan(domainObject.getIdPerusahaan())
                .setPKPType(domainObject.getpKPType())
                .setKualifikasiType(domainObject.getKualifikasiType())
                .setUnitType(domainObject.getUnitType())
                .setNamaPerusahaan(domainObject.getNamaPenanggungJawab())
                .setNpwp(domainObject.getNpwp())
                .setNamaSingkatan(domainObject.getNamaSingkatan())
                .setJumlahKaryawan(domainObject.getJumlahKaryawan())
                .setTanggalBerdiri(domainObject.getTanggalBerdiri())
                .setDeskripsi(domainObject.getDeskripsi())
                .setAlamatPerusahaan(domainObject.getAlamatPerusahaan())
                .setPropinsiType(domainObject.getPropinsiType())
                .setKotaType(domainObject.getKotaType())
                .setPoBox(domainObject.getPoBox())
                .setTelpPerusahaan(domainObject.getTelpPerusahaan())
                .setNoFax(domainObject.getNoFax())
                .setEmailPerusahaan(domainObject.getEmailPerusahaan())
                .setWebsite(domainObject.getWebsite())
                .setNamaCp(domainObject.getNamaCp())
                .setNoHP(domainObject.getNoHP())
                .setNoKtp(domainObject.getNoKtp())
                .setNamaPenanggungJawab(domainObject.getNamaPenanggungJawab())
                .setJabatanType(domainObject.getJabatanType())
                .setPerusahaanType(domainObject.getPerusahaanType())
                .setKodePos(domainObject.getKodePos())
                .setEmailCp(domainObject.getEmailCp())
                .setEmailPenanggungJawab(domainObject.getEmailPenanggungJawab())
                .setCreatedBy(domainObject.getCreatedBy())
                .setCreatedDate(domainObject.getCreatedDate())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .createDataPerusahaanDTO();
    }

    @Override
    public DataPerusahaan toDomain(DataPerusahaanDTO dtoObject) {
        return new DataPerusahaanBuilder()
                .setIdPerusahaan(dtoObject.getIdPerusahaan())
                .setPKPType(dtoObject.getpKPType())
                .setKualifikasiType(dtoObject.getKualifikasiType())
                .setUnitType(dtoObject.getUnitType())
                .setNamaPerusahaan(dtoObject.getNamaPenanggungJawab())
                .setNpwp(dtoObject.getNpwp())
                .setNamaSingkatan(dtoObject.getNamaSingkatan())
                .setJumlahKaryawan(dtoObject.getJumlahKaryawan())
                .setTanggalBerdiri(dtoObject.getTanggalBerdiri())
                .setDeskripsi(dtoObject.getDeskripsi())
                .setAlamatPerusahaan(dtoObject.getAlamatPerusahaan())
                .setPropinsiType(dtoObject.getPropinsiType())
                .setKotaType(dtoObject.getKotaType())
                .setPoBox(dtoObject.getPoBox())
                .setTelpPerusahaan(dtoObject.getTelpPerusahaan())
                .setNoFax(dtoObject.getNoFax())
                .setEmailPerusahaan(dtoObject.getEmailPerusahaan())
                .setWebsite(dtoObject.getWebsite())
                .setNamaCp(dtoObject.getNamaCp())
                .setNoHP(dtoObject.getNoHP())
                .setNoKtp(dtoObject.getNoKtp())
                .setNamaPenanggungJawab(dtoObject.getNamaPenanggungJawab())
                .setJabatanType(dtoObject.getJabatanType())
                .setPerusahaanType(dtoObject.getPerusahaanType())
                .setKodePos(dtoObject.getKodePos())
                .setEmailCp(dtoObject.getEmailCp())
                .setEmailPenanggungJawab(dtoObject.getEmailPenanggungJawab())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setCreatedDate(dtoObject.getCreatedDate())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .createDataPerusahaan();
    }

    public List<DataPerusahaan> toDomain(List<DataPerusahaanDTO> arg0) {
        List<DataPerusahaan> res = new ArrayList<>();
        for (DataPerusahaanDTO t : arg0) {
            res.add(new DataPerusahaanDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataPerusahaanDTO> toDTO(List<DataPerusahaan> arg0) {
        List<DataPerusahaanDTO> res = new ArrayList<>();
        for (DataPerusahaan t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}