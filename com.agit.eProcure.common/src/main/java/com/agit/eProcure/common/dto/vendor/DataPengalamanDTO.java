package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 3AD
 */
public class DataPengalamanDTO implements Serializable {

    private String idDataPengalaman;
    private String namaPekerjaan;
    private String lokasiPekerjaan;
    private BidangUsahaType bidangUsaha;
    private Date mulaiKerja;
    private Double nilaiKontrak;
    private String buktiKerjasama;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPengalamanDTO(String idDataPengalaman, String namaPekerjaan, String lokasiPekerjaan, BidangUsahaType bidangUsaha, Date mulaiKerja, Double nilaiKontrak, String buktiKerjasama, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
        this.idDataPengalaman = idDataPengalaman;
        this.namaPekerjaan = namaPekerjaan;
        this.lokasiPekerjaan = lokasiPekerjaan;
        this.bidangUsaha = bidangUsaha;
        this.mulaiKerja = mulaiKerja;
        this.nilaiKontrak = nilaiKontrak;
        this.buktiKerjasama = buktiKerjasama;
        this.createBy = createBy;
        this.createDate = createDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public String getIdDataPengalaman() {
        return idDataPengalaman;
    }

    public void setIdDataPengalaman(String idDataPengalaman) {
        this.idDataPengalaman = idDataPengalaman;
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
        return "DataPengalamanDTO{" + "idDataPengalaman=" + idDataPengalaman + ", namaPekerjaan=" + namaPekerjaan + ", lokasiPekerjaan=" + lokasiPekerjaan + ", bidangUsaha=" + bidangUsaha + ", mulaiKerja=" + mulaiKerja + ", nilaiKontrak=" + nilaiKontrak + ", buktiKerjasama=" + buktiKerjasama + ", createBy=" + createBy + ", createDate=" + createDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
