package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.JabatanType;
import com.agit.eProcure.shared.type.KotaType;
import com.agit.eProcure.shared.type.KualifikasiType;
import com.agit.eProcure.shared.type.PKPType;
import com.agit.eProcure.shared.type.PerusahaanType;
import com.agit.eProcure.shared.type.PropinsiType;
import com.agit.eProcure.shared.type.UnitType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataPerusahaanDTO implements Serializable {

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
    private String namaPenanggungJawab;
    private JabatanType jabatanType;
    private String emailPenanggungJawab;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPerusahaanDTO() {
    }

    public DataPerusahaanDTO(String idPerusahaan, PKPType pKPType, KualifikasiType kualifikasiType, UnitType unitType, String namaPerusahaan, PerusahaanType perusahaanType, String npwp, String namaSingkatan, String jumlahKaryawan, Date tanggalBerdiri, String deskripsi, String alamatPerusahaan, String propinsi, String kota, String poBox, String kodePos, String telpPerusahaan, String noFax, String emailPerusahaan, String website, String namaCp, String noHP, String emailCp, String noKtp, String namaPenanggungJawab, JabatanType jabatanType, String emailPenanggungJawab, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
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
        this.namaPenanggungJawab = namaPenanggungJawab;
        this.jabatanType = jabatanType;
        this.emailPenanggungJawab = emailPenanggungJawab;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
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

    public String getNamaPenanggungJawab() {
        return namaPenanggungJawab;
    }

    public void setNamaPenanggungJawab(String namaPenanggungJawab) {
        this.namaPenanggungJawab = namaPenanggungJawab;
    }

    public JabatanType getJabatanType() {
        return jabatanType;
    }

    public void setJabatanType(JabatanType jabatanType) {
        this.jabatanType = jabatanType;
    }

    public String getEmailPenanggungJawab() {
        return emailPenanggungJawab;
    }

    public void setEmailPenanggungJawab(String emailPenanggungJawab) {
        this.emailPenanggungJawab = emailPenanggungJawab;
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
        return "DataPerusahaanDTO{" + "idPerusahaan=" + idPerusahaan + ", pKPType=" + pKPType + ", kualifikasiType=" + kualifikasiType + ", unitType=" + unitType + ", namaPerusahaan=" + namaPerusahaan + ", perusahaanType=" + perusahaanType + ", npwp=" + npwp + ", namaSingkatan=" + namaSingkatan + ", jumlahKaryawan=" + jumlahKaryawan + ", tanggalBerdiri=" + tanggalBerdiri + ", deskripsi=" + deskripsi + ", alamatPerusahaan=" + alamatPerusahaan + ", propinsi=" + propinsi + ", kota=" + kota + ", poBox=" + poBox + ", kodePos=" + kodePos + ", telpPerusahaan=" + telpPerusahaan + ", noFax=" + noFax + ", emailPerusahaan=" + emailPerusahaan + ", website=" + website + ", namaCp=" + namaCp + ", noHP=" + noHP + ", emailCp=" + emailCp + ", noKtp=" + noKtp + ", namaPenanggungJawab=" + namaPenanggungJawab + ", jabatanType=" + jabatanType + ", emailPenanggungJawab=" + emailPenanggungJawab + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
