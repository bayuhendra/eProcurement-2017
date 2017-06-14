package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.JabatanType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zaky
 */
public class DataPenanggungJawabDTO implements Serializable {
    
    private String idPerusahaan;
    private String idPenanggungJawab;
    private String namaPenanggungJawab;
    private JabatanType jabatanType;
    private String emailPenanggungJawab;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPenanggungJawabDTO() {
    }

    public DataPenanggungJawabDTO(String idPerusahaan, String idPenanggungJawab, String namaPenanggungJawab, JabatanType jabatanType, String emailPenanggungJawab, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.idPerusahaan = idPerusahaan;
        this.idPenanggungJawab = idPenanggungJawab;
        this.namaPenanggungJawab = namaPenanggungJawab;
        this.jabatanType = jabatanType;
        this.emailPenanggungJawab = emailPenanggungJawab;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public String getIdPerusahaan() {
        return idPerusahaan;
    }

    public void setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }

    public String getIdPenanggungJawab() {
        return idPenanggungJawab;
    }

    public void setIdPenanggungJawab(String idPenanggungJawab) {
        this.idPenanggungJawab = idPenanggungJawab;
    }

    public String getNamaPenanggungJawab() {
        return namaPenanggungJawab;
    }

    public void setNamaPenanggungJawab(String namaPenanggungJawab) {
        this.namaPenanggungJawab = namaPenanggungJawab;
    }

    public JabatanType getJabatanType() {
        return jabatanType;
    }

    public void setJabatanType(JabatanType jabatanType) {
        this.jabatanType = jabatanType;
    }

    public String getEmailPenanggungJawab() {
        return emailPenanggungJawab;
    }

    public void setEmailPenanggungJawab(String emailPenanggungJawab) {
        this.emailPenanggungJawab = emailPenanggungJawab;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "DataPenanggungJawabDTO{" + "idPerusahaan=" + idPerusahaan + ", idPenanggungJawab=" + idPenanggungJawab + ", namaPenanggungJawab=" + namaPenanggungJawab + ", jabatanType=" + jabatanType + ", emailPenanggungJawab=" + emailPenanggungJawab + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }
    
    
}
