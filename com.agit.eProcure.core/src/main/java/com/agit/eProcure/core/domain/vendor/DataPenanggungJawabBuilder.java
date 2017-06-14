package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.JabatanType;
import java.util.Date;


public class DataPenanggungJawabBuilder {
    private long id;
    private String idPerusahaan;
    private String idPenanggungJawab;
    private String namaPenanggungJawab;
    private JabatanType jabatanType;
    private String emailPenanggungJawab;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPenanggungJawabBuilder() {
    }

    public DataPenanggungJawabBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataPenanggungJawabBuilder setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
        return this;
    }

    public DataPenanggungJawabBuilder setIdPenanggungJawab(String idPenanggungJawab) {
        this.idPenanggungJawab = idPenanggungJawab;
        return this;
    }

    public DataPenanggungJawabBuilder setNamaPenanggungJawab(String namaPenanggungJawab) {
        this.namaPenanggungJawab = namaPenanggungJawab;
        return this;
    }

    public DataPenanggungJawabBuilder setJabatanType(JabatanType jabatanType) {
        this.jabatanType = jabatanType;
        return this;
    }

    public DataPenanggungJawabBuilder setEmailPenanggungJawab(String emailPenanggungJawab) {
        this.emailPenanggungJawab = emailPenanggungJawab;
        return this;
    }

    public DataPenanggungJawabBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataPenanggungJawabBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataPenanggungJawabBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPenanggungJawabBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPenanggungJawab createDataPenanggungJawab() {
        return new DataPenanggungJawab(id, idPerusahaan, idPenanggungJawab, namaPenanggungJawab, jabatanType, emailPenanggungJawab, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
