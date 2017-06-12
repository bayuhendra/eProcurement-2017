package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 3AD
 */
public class PengalamanMitraDTO implements Serializable {

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

    public PengalamanMitraDTO() {
    }

    public PengalamanMitraDTO(String mitraID, String namaMitra, String lokasiKerja, BidangUsahaType bidangUsahaType, Date mulaiKerjasama, Double nilai, String buktiKerjasama, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
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
    public String toString() {
        return "PengalamanMitraDTO{" + "mitraID=" + mitraID + ", namaMitra=" + namaMitra + ", lokasiKerja=" + lokasiKerja + ", bidangUsahaType=" + bidangUsahaType + ", mulaiKerjasama=" + mulaiKerjasama + ", nilai=" + nilai + ", buktiKerjasama=" + buktiKerjasama + ", createBy=" + createBy + ", createDate=" + createDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
