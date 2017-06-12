package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.JabatanType;
import com.agit.eProcure.shared.type.KotaType;
import com.agit.eProcure.shared.type.KualifikasiType;
import com.agit.eProcure.shared.type.PKPType;
import com.agit.eProcure.shared.type.PerusahaanType;
import com.agit.eProcure.shared.type.PropinsiType;
import com.agit.eProcure.shared.type.UnitType;
import java.util.Date;


public class DataPerusahaanDTOBuilder {

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
    private PropinsiType propinsiType;
    private KotaType kotaType;
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

    public DataPerusahaanDTOBuilder() {
    }

    public DataPerusahaanDTOBuilder setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
        return this;
    }

    public DataPerusahaanDTOBuilder setPKPType(PKPType pKPType) {
        this.pKPType = pKPType;
        return this;
    }

    public DataPerusahaanDTOBuilder setKualifikasiType(KualifikasiType kualifikasiType) {
        this.kualifikasiType = kualifikasiType;
        return this;
    }

    public DataPerusahaanDTOBuilder setUnitType(UnitType unitType) {
        this.unitType = unitType;
        return this;
    }

    public DataPerusahaanDTOBuilder setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
        return this;
    }

    public DataPerusahaanDTOBuilder setPerusahaanType(PerusahaanType perusahaanType) {
        this.perusahaanType = perusahaanType;
        return this;
    }

    public DataPerusahaanDTOBuilder setNpwp(String npwp) {
        this.npwp = npwp;
        return this;
    }

    public DataPerusahaanDTOBuilder setNamaSingkatan(String namaSingkatan) {
        this.namaSingkatan = namaSingkatan;
        return this;
    }

    public DataPerusahaanDTOBuilder setJumlahKaryawan(String jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
        return this;
    }

    public DataPerusahaanDTOBuilder setTanggalBerdiri(Date tanggalBerdiri) {
        this.tanggalBerdiri = tanggalBerdiri;
        return this;
    }

    public DataPerusahaanDTOBuilder setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
        return this;
    }

    public DataPerusahaanDTOBuilder setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
        return this;
    }

    public DataPerusahaanDTOBuilder setPropinsiType(PropinsiType propinsiType) {
        this.propinsiType = propinsiType;
        return this;
    }

    public DataPerusahaanDTOBuilder setKotaType(KotaType kotaType) {
        this.kotaType = kotaType;
        return this;
    }

    public DataPerusahaanDTOBuilder setPoBox(String poBox) {
        this.poBox = poBox;
        return this;
    }

    public DataPerusahaanDTOBuilder setKodePos(String kodePos) {
        this.kodePos = kodePos;
        return this;
    }

    public DataPerusahaanDTOBuilder setTelpPerusahaan(String telpPerusahaan) {
        this.telpPerusahaan = telpPerusahaan;
        return this;
    }

    public DataPerusahaanDTOBuilder setNoFax(String noFax) {
        this.noFax = noFax;
        return this;
    }

    public DataPerusahaanDTOBuilder setEmailPerusahaan(String emailPerusahaan) {
        this.emailPerusahaan = emailPerusahaan;
        return this;
    }

    public DataPerusahaanDTOBuilder setWebsite(String website) {
        this.website = website;
        return this;
    }

    public DataPerusahaanDTOBuilder setNamaCp(String namaCp) {
        this.namaCp = namaCp;
        return this;
    }

    public DataPerusahaanDTOBuilder setNoHP(String noHP) {
        this.noHP = noHP;
        return this;
    }

    public DataPerusahaanDTOBuilder setEmailCp(String emailCp) {
        this.emailCp = emailCp;
        return this;
    }

    public DataPerusahaanDTOBuilder setNoKtp(String noKtp) {
        this.noKtp = noKtp;
        return this;
    }

    public DataPerusahaanDTOBuilder setNamaPenanggungJawab(String namaPenanggungJawab) {
        this.namaPenanggungJawab = namaPenanggungJawab;
        return this;
    }

    public DataPerusahaanDTOBuilder setJabatanType(JabatanType jabatanType) {
        this.jabatanType = jabatanType;
        return this;
    }

    public DataPerusahaanDTOBuilder setEmailPenanggungJawab(String emailPenanggungJawab) {
        this.emailPenanggungJawab = emailPenanggungJawab;
        return this;
    }

    public DataPerusahaanDTOBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataPerusahaanDTOBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataPerusahaanDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPerusahaanDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPerusahaanDTO createDataPerusahaanDTO() {
        return new DataPerusahaanDTO(idPerusahaan, pKPType, kualifikasiType, unitType, namaPerusahaan, perusahaanType, npwp, namaSingkatan, jumlahKaryawan, tanggalBerdiri, deskripsi, alamatPerusahaan, propinsiType, kotaType, poBox, kodePos, telpPerusahaan, noFax, emailPerusahaan, website, namaCp, noHP, emailCp, noKtp, namaPenanggungJawab, jabatanType, emailPenanggungJawab, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
