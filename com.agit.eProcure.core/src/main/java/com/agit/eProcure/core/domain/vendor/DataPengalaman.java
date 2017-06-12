package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import com.agit.eProcure.shared.object.EntityObject;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 3AD
 */
public class DataPengalaman implements EntityObject<DataPengalaman> {

    long id;
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

    public DataPengalaman() {
    }

    public DataPengalaman(long id, String idDataPengalaman, String namaPekerjaan, String lokasiPekerjaan, BidangUsahaType bidangUsaha, Date mulaiKerja, Double nilaiKontrak, String buktiKerjasama, String createBy, Date createDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
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

    public void assignNewDatapengalaman(DataPengalaman dataPengalaman) {
        this.idDataPengalaman = dataPengalaman.idDataPengalaman;
        this.namaPekerjaan = dataPengalaman.namaPekerjaan;
        this.lokasiPekerjaan = dataPengalaman.lokasiPekerjaan;
        this.bidangUsaha = dataPengalaman.bidangUsaha;
        this.mulaiKerja = dataPengalaman.mulaiKerja;
        this.nilaiKontrak = dataPengalaman.nilaiKontrak;
        this.buktiKerjasama = dataPengalaman.buktiKerjasama;
        this.createBy = dataPengalaman.createBy;
        this.createDate = dataPengalaman.createDate;
        this.modifiedBy = dataPengalaman.modifiedBy;
        this.modifiedDate = dataPengalaman.modifiedDate;
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
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idDataPengalaman);
        hash = 97 * hash + Objects.hashCode(this.namaPekerjaan);
        hash = 97 * hash + Objects.hashCode(this.lokasiPekerjaan);
        hash = 97 * hash + Objects.hashCode(this.bidangUsaha);
        hash = 97 * hash + Objects.hashCode(this.mulaiKerja);
        hash = 97 * hash + Objects.hashCode(this.nilaiKontrak);
        hash = 97 * hash + Objects.hashCode(this.buktiKerjasama);
        hash = 97 * hash + Objects.hashCode(this.createBy);
        hash = 97 * hash + Objects.hashCode(this.createDate);
        hash = 97 * hash + Objects.hashCode(this.modifiedBy);
        hash = 97 * hash + Objects.hashCode(this.modifiedDate);
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
        final DataPengalaman other = (DataPengalaman) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(DataPengalaman other) {
        return this.equals(other);
    }

}
