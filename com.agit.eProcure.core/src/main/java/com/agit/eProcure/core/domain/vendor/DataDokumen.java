package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 3AD
 */
public class DataDokumen implements EntityObject<DataDokumen> {

    long id;
    private String dokumenID;
    private String subject;
    private String noDokumen;
    private Date tglTerbit;
    private Date tglAkhir;
    private String uploadFile;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataDokumen() {
    }

    public DataDokumen(String dokumenID, String subject, String noDokumen, Date tglTerbit, Date tglAkhir, String uploadFile, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
        this.dokumenID = dokumenID;
        this.subject = subject;
        this.noDokumen = noDokumen;
        this.tglTerbit = tglTerbit;
        this.tglAkhir = tglAkhir;
        this.uploadFile = uploadFile;
        this.createBy = createBy;
        this.createDate = createDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public void assignNewDokumen(DataDokumen dataDokumen) {
        this.dokumenID = dataDokumen.dokumenID;
        this.subject = dataDokumen.subject;
        this.noDokumen = dataDokumen.noDokumen;
        this.tglTerbit = dataDokumen.tglTerbit;
        this.tglAkhir = dataDokumen.tglAkhir;
        this.uploadFile = dataDokumen.uploadFile;
        this.createBy = dataDokumen.createBy;
        this.createDate = dataDokumen.createDate;
        this.modifiedBy = dataDokumen.modifiedBy;
        this.modifiedDate = dataDokumen.modifiedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDokumenID() {
        return dokumenID;
    }

    public void setDokumenID(String dokumenID) {
        this.dokumenID = dokumenID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNoDokumen() {
        return noDokumen;
    }

    public void setNoDokumen(String noDokumen) {
        this.noDokumen = noDokumen;
    }

    public Date getTglTerbit() {
        return tglTerbit;
    }

    public void setTglTerbit(Date tglTerbit) {
        this.tglTerbit = tglTerbit;
    }

    public Date getTglAkhir() {
        return tglAkhir;
    }

    public void setTglAkhir(Date tglAkhir) {
        this.tglAkhir = tglAkhir;
    }

    public String getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
        hash = 67 * hash + Objects.hashCode(this.dokumenID);
        hash = 67 * hash + Objects.hashCode(this.subject);
        hash = 67 * hash + Objects.hashCode(this.noDokumen);
        hash = 67 * hash + Objects.hashCode(this.tglTerbit);
        hash = 67 * hash + Objects.hashCode(this.tglAkhir);
        hash = 67 * hash + Objects.hashCode(this.uploadFile);
        hash = 67 * hash + Objects.hashCode(this.createBy);
        hash = 67 * hash + Objects.hashCode(this.createDate);
        hash = 67 * hash + Objects.hashCode(this.modifiedBy);
        hash = 67 * hash + Objects.hashCode(this.modifiedDate);
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
        final DataDokumen other = (DataDokumen) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(DataDokumen other) {
        return this.equals(other);
    }

}
