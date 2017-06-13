package com.agit.eProcure.common.dto.vendor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 3AD
 */
public class DataDokumenDTO implements Serializable {

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

    public DataDokumenDTO() {
    }

    public DataDokumenDTO(String dokumenID, String subject, String noDokumen, Date tglTerbit, Date tglAkhir, String uploadFile, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
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
    public String toString() {
        return "DataDokumenDTO{" + "dokumenID=" + dokumenID + ", subject=" + subject + ", noDokumen=" + noDokumen + ", tglTerbit=" + tglTerbit + ", tglAkhir=" + tglAkhir + ", uploadFile=" + uploadFile + ", createBy=" + createBy + ", createDate=" + createDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
