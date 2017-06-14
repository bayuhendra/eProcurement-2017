package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.type.JabatanType;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Zaky
 */
public class DataPenanggungJawab implements EntityObject<DataPenanggungJawab>{
    long id;
    private String idPerusahaan;
    private String idPenanggungJawab;
    private String namaPenanggungJawab;
    private JabatanType jabatanType;
    private String emailPenanggungJawab;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPenanggungJawab() {
    }

    public DataPenanggungJawab(long id, String idPerusahaan, String idPenanggungJawab, String namaPenanggungJawab, JabatanType jabatanType, String emailPenanggungJawab, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.idPerusahaan);
        hash = 47 * hash + Objects.hashCode(this.idPenanggungJawab);
        hash = 47 * hash + Objects.hashCode(this.namaPenanggungJawab);
        hash = 47 * hash + Objects.hashCode(this.jabatanType);
        hash = 47 * hash + Objects.hashCode(this.emailPenanggungJawab);
        hash = 47 * hash + Objects.hashCode(this.createdBy);
        hash = 47 * hash + Objects.hashCode(this.createdDate);
        hash = 47 * hash + Objects.hashCode(this.modifiedBy);
        hash = 47 * hash + Objects.hashCode(this.modifiedDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataPenanggungJawab other = (DataPenanggungJawab) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public void assignNewDataPenanggungJawab (DataPenanggungJawab dataPenanggungJawab){
        
        this.idPerusahaan = dataPenanggungJawab.idPerusahaan;
        this.idPenanggungJawab = dataPenanggungJawab.idPenanggungJawab;
        this.namaPenanggungJawab = dataPenanggungJawab.namaPenanggungJawab;
        this.jabatanType = dataPenanggungJawab.jabatanType;
        this.emailPenanggungJawab = dataPenanggungJawab.emailPenanggungJawab;
        this.createdBy = dataPenanggungJawab.createdBy;
        this.createdDate = dataPenanggungJawab.createdDate;
        this.modifiedBy = dataPenanggungJawab.modifiedBy;
        this.modifiedDate = dataPenanggungJawab.modifiedDate;
    }
    
    @Override
    public boolean sameIdentityAs(DataPenanggungJawab other) {
        return this.equals(other);
    }
    
}
