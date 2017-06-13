/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import java.util.Date;

public class DataDokumenBuilder {

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

    public DataDokumenBuilder() {
    }

    public DataDokumenBuilder setDokumenID(String dokumenID) {
        this.dokumenID = dokumenID;
        return this;
    }

    public DataDokumenBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public DataDokumenBuilder setNoDokumen(String noDokumen) {
        this.noDokumen = noDokumen;
        return this;
    }

    public DataDokumenBuilder setTglTerbit(Date tglTerbit) {
        this.tglTerbit = tglTerbit;
        return this;
    }

    public DataDokumenBuilder setTglAkhir(Date tglAkhir) {
        this.tglAkhir = tglAkhir;
        return this;
    }

    public DataDokumenBuilder setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
        return this;
    }

    public DataDokumenBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public DataDokumenBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public DataDokumenBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataDokumenBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataDokumen createDataDokumen() {
        return new DataDokumen(dokumenID, subject, noDokumen, tglTerbit, tglAkhir, uploadFile, createBy, createDate, modifiedBy, modifiedDate);
    }

}
