package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 3AD
 */
public class PengalamanBerjalan implements EntityObject<PengalamanBerjalan> {

    long id;
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

    public PengalamanBerjalan() {
    }

    public PengalamanBerjalan(String idPengalamanBerjalan, String namaPekerjaan, String lokasiPekerjaan, BidangUsahaType bidangUsaha, Date mulaiKerja, Double nilaiKontrak, String buktiKerja, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
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

    public void assignNewBerjalan(PengalamanBerjalan pengalamanBerjalan) {
        this.idPengalamanBerjalan = pengalamanBerjalan.idPengalamanBerjalan;
        this.namaPekerjaan = pengalamanBerjalan.namaPekerjaan;
        this.lokasiPekerjaan = pengalamanBerjalan.lokasiPekerjaan;
        this.bidangUsaha = pengalamanBerjalan.bidangUsaha;
        this.mulaiKerja = pengalamanBerjalan.mulaiKerja;
        this.nilaiKontrak = pengalamanBerjalan.nilaiKontrak;
        this.buktiKerja = pengalamanBerjalan.buktiKerja;
        this.createBy = pengalamanBerjalan.createBy;
        this.createDate = pengalamanBerjalan.createDate;
        this.modifiedBy = pengalamanBerjalan.modifiedBy;
        this.modifiedDate = pengalamanBerjalan.modifiedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.idPengalamanBerjalan);
        hash = 59 * hash + Objects.hashCode(this.namaPekerjaan);
        hash = 59 * hash + Objects.hashCode(this.lokasiPekerjaan);
        hash = 59 * hash + Objects.hashCode(this.bidangUsaha);
        hash = 59 * hash + Objects.hashCode(this.mulaiKerja);
        hash = 59 * hash + Objects.hashCode(this.nilaiKontrak);
        hash = 59 * hash + Objects.hashCode(this.buktiKerja);
        hash = 59 * hash + Objects.hashCode(this.createBy);
        hash = 59 * hash + Objects.hashCode(this.createDate);
        hash = 59 * hash + Objects.hashCode(this.modifiedBy);
        hash = 59 * hash + Objects.hashCode(this.modifiedDate);
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
        final PengalamanBerjalan other = (PengalamanBerjalan) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(PengalamanBerjalan other) {
        return this.equals(other);
    }

}
