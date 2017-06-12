package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 3AD
 */
public class PengalamanMitra implements EntityObject<PengalamanMitra> {

    long id;
    private String mitraID;
    private String namaMitra;
    private String lokasiKerja;
    private BidangUsahaType bidangUsahaType;
    private Date mulaiKerjasama;
    private Double nilai;
    private String buktiKerjasama;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;

    public PengalamanMitra() {
    }

    public PengalamanMitra(long id, String mitraID, String namaMitra, String lokasiKerja, BidangUsahaType bidangUsahaType, Date mulaiKerjasama, Double nilai, String buktiKerjasama, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
        this.mitraID = mitraID;
        this.namaMitra = namaMitra;
        this.lokasiKerja = lokasiKerja;
        this.bidangUsahaType = bidangUsahaType;
        this.mulaiKerjasama = mulaiKerjasama;
        this.nilai = nilai;
        this.buktiKerjasama = buktiKerjasama;
        this.createBy = createBy;
        this.createDate = createDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public void assignNewPengalamanMitra(PengalamanMitra pengalamanMitra) {
        this.mitraID = pengalamanMitra.mitraID;
        this.namaMitra = pengalamanMitra.namaMitra;
        this.lokasiKerja = pengalamanMitra.lokasiKerja;
        this.bidangUsahaType = pengalamanMitra.bidangUsahaType;
        this.mulaiKerjasama = pengalamanMitra.mulaiKerjasama;
        this.nilai = pengalamanMitra.nilai;
        this.buktiKerjasama = pengalamanMitra.buktiKerjasama;
        this.createBy = pengalamanMitra.createBy;
        this.createDate = pengalamanMitra.createDate;
        this.modifiedBy = pengalamanMitra.modifiedBy;
        this.modifiedDate = pengalamanMitra.modifiedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMitraID() {
        return mitraID;
    }

    public void setMitraID(String mitraID) {
        this.mitraID = mitraID;
    }

    public String getNamaMitra() {
        return namaMitra;
    }

    public void setNamaMitra(String namaMitra) {
        this.namaMitra = namaMitra;
    }

    public String getLokasiKerja() {
        return lokasiKerja;
    }

    public void setLokasiKerja(String lokasiKerja) {
        this.lokasiKerja = lokasiKerja;
    }

    public BidangUsahaType getBidangUsahaType() {
        return bidangUsahaType;
    }

    public void setBidangUsahaType(BidangUsahaType bidangUsahaType) {
        this.bidangUsahaType = bidangUsahaType;
    }

    public Date getMulaiKerjasama() {
        return mulaiKerjasama;
    }

    public void setMulaiKerjasama(Date mulaiKerjasama) {
        this.mulaiKerjasama = mulaiKerjasama;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }

    public String getBuktiKerjasama() {
        return buktiKerjasama;
    }

    public void setBuktiKerjasama(String buktiKerjasama) {
        this.buktiKerjasama = buktiKerjasama;
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
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.mitraID);
        hash = 23 * hash + Objects.hashCode(this.namaMitra);
        hash = 23 * hash + Objects.hashCode(this.lokasiKerja);
        hash = 23 * hash + Objects.hashCode(this.bidangUsahaType);
        hash = 23 * hash + Objects.hashCode(this.mulaiKerjasama);
        hash = 23 * hash + Objects.hashCode(this.nilai);
        hash = 23 * hash + Objects.hashCode(this.buktiKerjasama);
        hash = 23 * hash + Objects.hashCode(this.createBy);
        hash = 23 * hash + Objects.hashCode(this.createDate);
        hash = 23 * hash + Objects.hashCode(this.modifiedBy);
        hash = 23 * hash + Objects.hashCode(this.modifiedDate);
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
        final PengalamanMitra other = (PengalamanMitra) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(PengalamanMitra other) {
        return this.equals(other);
    }

}
