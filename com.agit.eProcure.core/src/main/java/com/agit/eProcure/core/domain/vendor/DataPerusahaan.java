package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.type.JabatanType;
import com.agit.eProcure.shared.type.KualifikasiType;
import com.agit.eProcure.shared.type.PKPType;
import com.agit.eProcure.shared.type.PerusahaanType;
import com.agit.eProcure.shared.type.UnitType;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataPerusahaan implements EntityObject<DataPerusahaan> {

    long id;
    private String idPerusahaan;
    private PKPType pKPType;
    private KualifikasiType kualifikasiType;
    private UnitType unitType;
    private String namaPerusahaan;
    private PerusahaanType perusahaanType;
    private String npwp;
    private String namaSingkatan;
    private String jumlahKaryawan;
    private Date tanggalBerdiri;
    private String deskripsi;
    private String alamatPerusahaan;
    private String propinsi;
    private String kota;
    private String poBox;
    private String kodePos;
    private String telpPerusahaan;
    private String noFax;
    private String emailPerusahaan;
    private String website;
    private String namaCp;
    private String noHP;
    private String emailCp;
    private String noKtp;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPerusahaan() {
    }

    public DataPerusahaan(long id, String idPerusahaan, PKPType pKPType, KualifikasiType kualifikasiType, UnitType unitType, String namaPerusahaan, PerusahaanType perusahaanType, String npwp, String namaSingkatan, String jumlahKaryawan, Date tanggalBerdiri, String deskripsi, String alamatPerusahaan, String propinsi, String kota, String poBox, String kodePos, String telpPerusahaan, String noFax, String emailPerusahaan, String website, String namaCp, String noHP, String emailCp, String noKtp, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
        this.idPerusahaan = idPerusahaan;
        this.pKPType = pKPType;
        this.kualifikasiType = kualifikasiType;
        this.unitType = unitType;
        this.namaPerusahaan = namaPerusahaan;
        this.perusahaanType = perusahaanType;
        this.npwp = npwp;
        this.namaSingkatan = namaSingkatan;
        this.jumlahKaryawan = jumlahKaryawan;
        this.tanggalBerdiri = tanggalBerdiri;
        this.deskripsi = deskripsi;
        this.alamatPerusahaan = alamatPerusahaan;
        this.propinsi = propinsi;
        this.kota = kota;
        this.poBox = poBox;
        this.kodePos = kodePos;
        this.telpPerusahaan = telpPerusahaan;
        this.noFax = noFax;
        this.emailPerusahaan = emailPerusahaan;
        this.website = website;
        this.namaCp = namaCp;
        this.noHP = noHP;
        this.emailCp = emailCp;
        this.noKtp = noKtp;
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

    public String getIdPerusahaan() {
        return idPerusahaan;
    }

    public void setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }

    public PKPType getpKPType() {
        return pKPType;
    }

    public void setpKPType(PKPType pKPType) {
        this.pKPType = pKPType;
    }

    public KualifikasiType getKualifikasiType() {
        return kualifikasiType;
    }

    public void setKualifikasiType(KualifikasiType kualifikasiType) {
        this.kualifikasiType = kualifikasiType;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public PerusahaanType getPerusahaanType() {
        return perusahaanType;
    }

    public void setPerusahaanType(PerusahaanType perusahaanType) {
        this.perusahaanType = perusahaanType;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNamaSingkatan() {
        return namaSingkatan;
    }

    public void setNamaSingkatan(String namaSingkatan) {
        this.namaSingkatan = namaSingkatan;
    }

    public String getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    public void setJumlahKaryawan(String jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
    }

    public Date getTanggalBerdiri() {
        return tanggalBerdiri;
    }

    public void setTanggalBerdiri(Date tanggalBerdiri) {
        this.tanggalBerdiri = tanggalBerdiri;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getTelpPerusahaan() {
        return telpPerusahaan;
    }

    public void setTelpPerusahaan(String telpPerusahaan) {
        this.telpPerusahaan = telpPerusahaan;
    }

    public String getNoFax() {
        return noFax;
    }

    public void setNoFax(String noFax) {
        this.noFax = noFax;
    }

    public String getEmailPerusahaan() {
        return emailPerusahaan;
    }

    public void setEmailPerusahaan(String emailPerusahaan) {
        this.emailPerusahaan = emailPerusahaan;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNamaCp() {
        return namaCp;
    }

    public void setNamaCp(String namaCp) {
        this.namaCp = namaCp;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getEmailCp() {
        return emailCp;
    }

    public void setEmailCp(String emailCp) {
        this.emailCp = emailCp;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
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
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.idPerusahaan);
        hash = 31 * hash + Objects.hashCode(this.pKPType);
        hash = 31 * hash + Objects.hashCode(this.kualifikasiType);
        hash = 31 * hash + Objects.hashCode(this.unitType);
        hash = 31 * hash + Objects.hashCode(this.namaPerusahaan);
        hash = 31 * hash + Objects.hashCode(this.perusahaanType);
        hash = 31 * hash + Objects.hashCode(this.npwp);
        hash = 31 * hash + Objects.hashCode(this.namaSingkatan);
        hash = 31 * hash + Objects.hashCode(this.jumlahKaryawan);
        hash = 31 * hash + Objects.hashCode(this.tanggalBerdiri);
        hash = 31 * hash + Objects.hashCode(this.deskripsi);
        hash = 31 * hash + Objects.hashCode(this.alamatPerusahaan);
        hash = 31 * hash + Objects.hashCode(this.propinsi);
        hash = 31 * hash + Objects.hashCode(this.kota);
        hash = 31 * hash + Objects.hashCode(this.poBox);
        hash = 31 * hash + Objects.hashCode(this.kodePos);
        hash = 31 * hash + Objects.hashCode(this.telpPerusahaan);
        hash = 31 * hash + Objects.hashCode(this.noFax);
        hash = 31 * hash + Objects.hashCode(this.emailPerusahaan);
        hash = 31 * hash + Objects.hashCode(this.website);
        hash = 31 * hash + Objects.hashCode(this.namaCp);
        hash = 31 * hash + Objects.hashCode(this.noHP);
        hash = 31 * hash + Objects.hashCode(this.emailCp);
        hash = 31 * hash + Objects.hashCode(this.noKtp);
        hash = 31 * hash + Objects.hashCode(this.createdBy);
        hash = 31 * hash + Objects.hashCode(this.createdDate);
        hash = 31 * hash + Objects.hashCode(this.modifiedBy);
        hash = 31 * hash + Objects.hashCode(this.modifiedDate);
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
        final DataPerusahaan other = (DataPerusahaan) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void assignNewDataPerusahaan(DataPerusahaan dataPerusahaan) {
        this.idPerusahaan = dataPerusahaan.idPerusahaan;
        this.pKPType = dataPerusahaan.pKPType;
        this.kualifikasiType = dataPerusahaan.kualifikasiType;
        this.unitType = dataPerusahaan.unitType;
        this.namaPerusahaan = dataPerusahaan.namaPerusahaan;
        this.perusahaanType = dataPerusahaan.perusahaanType;
        this.npwp = dataPerusahaan.npwp;
        this.namaSingkatan = dataPerusahaan.namaSingkatan;
        this.jumlahKaryawan = dataPerusahaan.jumlahKaryawan;
        this.tanggalBerdiri = dataPerusahaan.tanggalBerdiri;
        this.deskripsi = dataPerusahaan.deskripsi;
        this.alamatPerusahaan = dataPerusahaan.alamatPerusahaan;
        this.propinsi = dataPerusahaan.propinsi;
        this.kota = dataPerusahaan.kota;
        this.poBox = dataPerusahaan.poBox;
        this.kodePos = dataPerusahaan.kodePos;
        this.telpPerusahaan = dataPerusahaan.telpPerusahaan;
        this.noFax = dataPerusahaan.noFax;
        this.emailPerusahaan = dataPerusahaan.emailPerusahaan;
        this.website = dataPerusahaan.website;
        this.namaCp = dataPerusahaan.namaCp;
        this.noHP = dataPerusahaan.noHP;
        this.emailCp = dataPerusahaan.emailCp;
        this.noKtp = dataPerusahaan.noKtp;
        this.createdBy = dataPerusahaan.createdBy;
        this.createdDate = dataPerusahaan.createdDate;
        this.modifiedBy = dataPerusahaan.modifiedBy;
        this.modifiedDate = dataPerusahaan.modifiedDate;
    }

    @Override
    public boolean sameIdentityAs(DataPerusahaan other) {
        return this.equals(other);
    }

}
