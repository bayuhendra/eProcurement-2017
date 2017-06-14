/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.JabatanType;
import com.agit.eProcure.shared.type.KualifikasiType;
import com.agit.eProcure.shared.type.PKPType;
import com.agit.eProcure.shared.type.PerusahaanType;
import com.agit.eProcure.shared.type.UnitType;
import java.util.Date;


public class DataPerusahaanBuilder {

    private long id;
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

    public DataPerusahaanBuilder() {
    }

    
    public DataPerusahaanBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataPerusahaanBuilder setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
        return this;
    }

    public DataPerusahaanBuilder setPKPType(PKPType pKPType) {
        this.pKPType = pKPType;
        return this;
    }

    public DataPerusahaanBuilder setKualifikasiType(KualifikasiType kualifikasiType) {
        this.kualifikasiType = kualifikasiType;
        return this;
    }

    public DataPerusahaanBuilder setUnitType(UnitType unitType) {
        this.unitType = unitType;
        return this;
    }

    public DataPerusahaanBuilder setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
        return this;
    }

    public DataPerusahaanBuilder setPerusahaanType(PerusahaanType perusahaanType) {
        this.perusahaanType = perusahaanType;
        return this;
    }

    public DataPerusahaanBuilder setNpwp(String npwp) {
        this.npwp = npwp;
        return this;
    }

    public DataPerusahaanBuilder setNamaSingkatan(String namaSingkatan) {
        this.namaSingkatan = namaSingkatan;
        return this;
    }

    public DataPerusahaanBuilder setJumlahKaryawan(String jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
        return this;
    }

    public DataPerusahaanBuilder setTanggalBerdiri(Date tanggalBerdiri) {
        this.tanggalBerdiri = tanggalBerdiri;
        return this;
    }

    public DataPerusahaanBuilder setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
        return this;
    }

    public DataPerusahaanBuilder setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
        return this;
    }

    public DataPerusahaanBuilder setPropinsi(String propinsi) {
        this.propinsi = propinsi;
        return this;
    }

    public DataPerusahaanBuilder setKota(String kota) {
        this.kota = kota;
        return this;
    }

    public DataPerusahaanBuilder setPoBox(String poBox) {
        this.poBox = poBox;
        return this;
    }

    public DataPerusahaanBuilder setKodePos(String kodePos) {
        this.kodePos = kodePos;
        return this;
    }

    public DataPerusahaanBuilder setTelpPerusahaan(String telpPerusahaan) {
        this.telpPerusahaan = telpPerusahaan;
        return this;
    }

    public DataPerusahaanBuilder setNoFax(String noFax) {
        this.noFax = noFax;
        return this;
    }

    public DataPerusahaanBuilder setEmailPerusahaan(String emailPerusahaan) {
        this.emailPerusahaan = emailPerusahaan;
        return this;
    }

    public DataPerusahaanBuilder setWebsite(String website) {
        this.website = website;
        return this;
    }

    public DataPerusahaanBuilder setNamaCp(String namaCp) {
        this.namaCp = namaCp;
        return this;
    }

    public DataPerusahaanBuilder setNoHP(String noHP) {
        this.noHP = noHP;
        return this;
    }

    public DataPerusahaanBuilder setEmailCp(String emailCp) {
        this.emailCp = emailCp;
        return this;
    }

    public DataPerusahaanBuilder setNoKtp(String noKtp) {
        this.noKtp = noKtp;
        return this;
    }

    public DataPerusahaanBuilder setNamaPenanggungJawab(String namaPenanggungJawab) {
        this.namaPenanggungJawab = namaPenanggungJawab;
        return this;
    }

    public DataPerusahaanBuilder setJabatanType(JabatanType jabatanType) {
        this.jabatanType = jabatanType;
        return this;
    }

    public DataPerusahaanBuilder setEmailPenanggungJawab(String emailPenanggungJawab) {
        this.emailPenanggungJawab = emailPenanggungJawab;
        return this;
    }

    public DataPerusahaanBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataPerusahaanBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataPerusahaanBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPerusahaanBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPerusahaan createDataPerusahaan() {
        return new DataPerusahaan(id, idPerusahaan, pKPType, kualifikasiType, unitType, namaPerusahaan, perusahaanType, npwp, namaSingkatan, jumlahKaryawan, tanggalBerdiri, deskripsi, alamatPerusahaan, propinsi, kota, poBox, kodePos, telpPerusahaan, noFax, emailPerusahaan, website, namaCp, noHP, emailCp, noKtp, namaPenanggungJawab, jabatanType, emailPenanggungJawab, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
