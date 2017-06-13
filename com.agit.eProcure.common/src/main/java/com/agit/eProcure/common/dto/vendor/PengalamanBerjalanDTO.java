package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 3AD
 */
public class PengalamanBerjalanDTO implements Serializable{

    private String idPengalamanBerjalan;
    private String namaPekerjaan;
    private String lokasiPekerjaan;
    private BidangUsahaType bidangUsaha;
    private Date mulaiKerja;
    private Double nilaiKontrak;
    private String buktiKerja;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;

    public PengalamanBerjalanDTO() {
    }

    public PengalamanBerjalanDTO(String idPengalamanBerjalan, String namaPekerjaan, String lokasiPekerjaan, BidangUsahaType bidangUsaha, Date mulaiKerja, Double nilaiKontrak, String buktiKerja, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
        this.idPengalamanBerjalan = idPengalamanBerjalan;
        this.namaPekerjaan = namaPekerjaan;
        this.lokasiPekerjaan = lokasiPekerjaan;
        this.bidangUsaha = bidangUsaha;
        this.mulaiKerja = mulaiKerja;
        this.nilaiKontrak = nilaiKontrak;
        this.buktiKerja = buktiKerja;
        this.createBy = createBy;
        this.createDate = createDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public String getIdPengalamanBerjalan() {
        return idPengalamanBerjalan;
    }

    public void setIdPengalamanBerjalan(String idPengalamanBerjalan) {
        this.idPengalamanBerjalan = idPengalamanBerjalan;
    }

    public String getNamaPekerjaan() {
        return namaPekerjaan;
    }

    public void setNamaPekerjaan(String namaPekerjaan) {
        this.namaPekerjaan = namaPekerjaan;
    }

    public String getLokasiPekerjaan() {
        return lokasiPekerjaan;
    }

    public void setLokasiPekerjaan(String lokasiPekerjaan) {
        this.lokasiPekerjaan = lokasiPekerjaan;
    }

    public BidangUsahaType getBidangUsaha() {
        return bidangUsaha;
    }

    public void setBidangUsaha(BidangUsahaType bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
    }

    public Date getMulaiKerja() {
        return mulaiKerja;
    }

    public void setMulaiKerja(Date mulaiKerja) {
        this.mulaiKerja = mulaiKerja;
    }

    public Double getNilaiKontrak() {
        return nilaiKontrak;
    }

    public void setNilaiKontrak(Double nilaiKontrak) {
        this.nilaiKontrak = nilaiKontrak;
    }

    public String getBuktiKerja() {
        return buktiKerja;
    }

    public void setBuktiKerja(String buktiKerja) {
        this.buktiKerja = buktiKerja;
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
        return "PengalamanBerjalanDTO{" + "idPengalamanBerjalan=" + idPengalamanBerjalan + ", namaPekerjaan=" + namaPekerjaan + ", lokasiPekerjaan=" + lokasiPekerjaan + ", bidangUsaha=" + bidangUsaha + ", mulaiKerja=" + mulaiKerja + ", nilaiKontrak=" + nilaiKontrak + ", buktiKerja=" + buktiKerja + ", createBy=" + createBy + ", createDate=" + createDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
