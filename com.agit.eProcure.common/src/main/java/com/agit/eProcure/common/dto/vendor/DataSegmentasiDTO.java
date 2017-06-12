package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.AssosiasiType;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataSegmentasiDTO implements Serializable {

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

    public DataSegmentasiDTO() {
    }

    public DataSegmentasiDTO(String idDataSegmentasi, BidangUsahaType bidangUsahaType, AssosiasiType assosiasiType, String nomorAssosiasi, Date tanggalMulai, Date tanggalBerakhir, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.idDataSegmentasi = idDataSegmentasi;
        this.bidangUsahaType = bidangUsahaType;
        this.assosiasiType = assosiasiType;
        this.nomorAssosiasi = nomorAssosiasi;
        this.tanggalMulai = tanggalMulai;
        this.tanggalBerakhir = tanggalBerakhir;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public String getIdDataSegmentasi() {
        return idDataSegmentasi;
    }

    public void setIdDataSegmentasi(String idDataSegmentasi) {
        this.idDataSegmentasi = idDataSegmentasi;
    }

    public BidangUsahaType getBidangUsahaType() {
        return bidangUsahaType;
    }

    public void setBidangUsahaType(BidangUsahaType bidangUsahaType) {
        this.bidangUsahaType = bidangUsahaType;
    }

    public AssosiasiType getAssosiasiType() {
        return assosiasiType;
    }

    public void setAssosiasiType(AssosiasiType assosiasiType) {
        this.assosiasiType = assosiasiType;
    }

    public String getNomorAssosiasi() {
        return nomorAssosiasi;
    }

    public void setNomorAssosiasi(String nomorAssosiasi) {
        this.nomorAssosiasi = nomorAssosiasi;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setTanggalBerakhir(Date tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
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
        return "DataSegmentasiDTO{" + "idDataSegmentasi=" + idDataSegmentasi + ", bidangUsahaType=" + bidangUsahaType + ", assosiasiType=" + assosiasiType + ", nomorAssosiasi=" + nomorAssosiasi + ", tanggalMulai=" + tanggalMulai + ", tanggalBerakhir=" + tanggalBerakhir + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
