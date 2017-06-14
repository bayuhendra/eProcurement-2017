package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.JabatanType;
import java.util.Date;


public class DataPenanggungJawabDTOBuilder {
    private String idPerusahaan;
    private String idPenanggungJawab;
    private String namaPenanggungJawab;
    private JabatanType jabatanType;
    private String emailPenanggungJawab;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPenanggungJawabDTOBuilder() {
    }

    public DataPenanggungJawabDTOBuilder setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setIdPenanggungJawab(String idPenanggungJawab) {
        this.idPenanggungJawab = idPenanggungJawab;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setNamaPenanggungJawab(String namaPenanggungJawab) {
        this.namaPenanggungJawab = namaPenanggungJawab;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setJabatanType(JabatanType jabatanType) {
        this.jabatanType = jabatanType;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setEmailPenanggungJawab(String emailPenanggungJawab) {
        this.emailPenanggungJawab = emailPenanggungJawab;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPenanggungJawabDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPenanggungJawabDTO createDataPenanggungJawabDTO() {
        return new DataPenanggungJawabDTO(idPerusahaan, idPenanggungJawab, namaPenanggungJawab, jabatanType, emailPenanggungJawab, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
