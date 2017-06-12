package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.type.AssosiasiType;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataSegmentasi implements EntityObject<DataSegmentasi> {

    long id;
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

    public DataSegmentasi() {
    }

    public DataSegmentasi(long id, String idDataSegmentasi, BidangUsahaType bidangUsahaType, AssosiasiType assosiasiType, String nomorAssosiasi, Date tanggalMulai, Date tanggalBerakhir, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.idDataSegmentasi);
        hash = 41 * hash + Objects.hashCode(this.bidangUsahaType);
        hash = 41 * hash + Objects.hashCode(this.assosiasiType);
        hash = 41 * hash + Objects.hashCode(this.nomorAssosiasi);
        hash = 41 * hash + Objects.hashCode(this.tanggalMulai);
        hash = 41 * hash + Objects.hashCode(this.tanggalBerakhir);
        hash = 41 * hash + Objects.hashCode(this.createdBy);
        hash = 41 * hash + Objects.hashCode(this.createdDate);
        hash = 41 * hash + Objects.hashCode(this.modifiedBy);
        hash = 41 * hash + Objects.hashCode(this.modifiedDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataSegmentasi other = (DataSegmentasi) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void assignNewDataSegmentasi(DataSegmentasi dataSegmentasi) {
        this.idDataSegmentasi = dataSegmentasi.idDataSegmentasi;
        this.bidangUsahaType = dataSegmentasi.bidangUsahaType;
        this.assosiasiType = dataSegmentasi.assosiasiType;
        this.nomorAssosiasi = dataSegmentasi.nomorAssosiasi;
        this.tanggalMulai = dataSegmentasi.tanggalMulai;
        this.tanggalBerakhir = dataSegmentasi.tanggalBerakhir;
        this.createdBy = dataSegmentasi.createdBy;
        this.createdDate = dataSegmentasi.createdDate;
        this.modifiedBy = dataSegmentasi.modifiedBy;
        this.modifiedDate = dataSegmentasi.modifiedDate;
    }

    @Override
    public boolean sameIdentityAs(DataSegmentasi other) {
        return this.equals(other);
    }

}
