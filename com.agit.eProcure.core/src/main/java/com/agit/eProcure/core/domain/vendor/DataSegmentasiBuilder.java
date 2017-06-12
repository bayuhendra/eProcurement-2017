package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.AssosiasiType;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;


public class DataSegmentasiBuilder {

    private long id;
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

    public DataSegmentasiBuilder() {
    }

    public DataSegmentasiBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataSegmentasiBuilder setIdDataSegmentasi(String idDataSegmentasi) {
        this.idDataSegmentasi = idDataSegmentasi;
        return this;
    }

    public DataSegmentasiBuilder setBidangUsahaType(BidangUsahaType bidangUsahaType) {
        this.bidangUsahaType = bidangUsahaType;
        return this;
    }

    public DataSegmentasiBuilder setAssosiasiType(AssosiasiType assosiasiType) {
        this.assosiasiType = assosiasiType;
        return this;
    }

    public DataSegmentasiBuilder setNomorAssosiasi(String nomorAssosiasi) {
        this.nomorAssosiasi = nomorAssosiasi;
        return this;
    }

    public DataSegmentasiBuilder setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
        return this;
    }

    public DataSegmentasiBuilder setTanggalBerakhir(Date tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
        return this;
    }

    public DataSegmentasiBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataSegmentasiBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataSegmentasiBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataSegmentasiBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataSegmentasi createDataSegmentasi() {
        return new DataSegmentasi(id, idDataSegmentasi, bidangUsahaType, assosiasiType, nomorAssosiasi, tanggalMulai, tanggalBerakhir, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
