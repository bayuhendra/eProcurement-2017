/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.common.dto.vendor;

import java.util.Date;

public class DataDokumenDTOBuilder {

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

    public DataDokumenDTOBuilder() {
    }

    public DataDokumenDTOBuilder setDokumenID(String dokumenID) {
        this.dokumenID = dokumenID;
        return this;
    }

    public DataDokumenDTOBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public DataDokumenDTOBuilder setNoDokumen(String noDokumen) {
        this.noDokumen = noDokumen;
        return this;
    }

    public DataDokumenDTOBuilder setTglTerbit(Date tglTerbit) {
        this.tglTerbit = tglTerbit;
        return this;
    }

    public DataDokumenDTOBuilder setTglAkhir(Date tglAkhir) {
        this.tglAkhir = tglAkhir;
        return this;
    }

    public DataDokumenDTOBuilder setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
        return this;
    }

    public DataDokumenDTOBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public DataDokumenDTOBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public DataDokumenDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataDokumenDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataDokumenDTO createDataDokumenDTO() {
        return new DataDokumenDTO(dokumenID, subject, noDokumen, tglTerbit, tglAkhir, uploadFile, createBy, createDate, modifiedBy, modifiedDate);
    }

}
