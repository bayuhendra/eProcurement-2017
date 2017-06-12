/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.AssosiasiType;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;


public class DataSegmentasiDTOBuilder {

    private String idDataSegmentasi;
    private BidangUsahaType bidangUsahaType;
    private AssosiasiType assosiasiType;
    private String nomorAssosiasi;
    private Date tanggalMulai;
    private Date tanggalBerakhir;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataSegmentasiDTOBuilder() {
    }

    public DataSegmentasiDTOBuilder setIdDataSegmentasi(String idDataSegmentasi) {
        this.idDataSegmentasi = idDataSegmentasi;
        return this;
    }

    public DataSegmentasiDTOBuilder setBidangUsahaType(BidangUsahaType bidangUsahaType) {
        this.bidangUsahaType = bidangUsahaType;
        return this;
    }

    public DataSegmentasiDTOBuilder setAssosiasiType(AssosiasiType assosiasiType) {
        this.assosiasiType = assosiasiType;
        return this;
    }

    public DataSegmentasiDTOBuilder setNomorAssosiasi(String nomorAssosiasi) {
        this.nomorAssosiasi = nomorAssosiasi;
        return this;
    }

    public DataSegmentasiDTOBuilder setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
        return this;
    }

    public DataSegmentasiDTOBuilder setTanggalBerakhir(Date tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
        return this;
    }

    public DataSegmentasiDTOBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataSegmentasiDTOBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataSegmentasiDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataSegmentasiDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataSegmentasiDTO createDataSegmentasiDTO() {
        return new DataSegmentasiDTO(idDataSegmentasi, bidangUsahaType, assosiasiType, nomorAssosiasi, tanggalMulai, tanggalBerakhir, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
