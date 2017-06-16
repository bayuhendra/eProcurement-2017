/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import java.util.Date;


public class DataKeuanganBuilder {

    private long id;
    private String idDataKeuangan;
    private String auditID;
    private Date tglAudit;
    private String namaAudit;
    private String tahunKeuangan;
    private Double kas;
    private Double bank;
    private Double totalPiutang;
    private Double persediaanBarang;
    private Double pekerjaanDP;
    private Double totalAktivaLancar;
    private Double peralatan;
    private Double inventaris;
    private Double gedung;
    private Double totalAktivaTetap;
    private Double aktivaLainnya;
    private Double totalAktivaLainnya;
    private Double hutangDagang;
    private Double hutangPajak;
    private Double hutangLainnya;
    private Double totalHutangJangkaPendek;
    private Double hutangJangkaPanjang;
    private Double kekayaanBerih;
    private Double total;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataKeuanganBuilder() {
    }

    public DataKeuanganBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataKeuanganBuilder setIdDataKeuangan(String idDataKeuangan) {
        this.idDataKeuangan = idDataKeuangan;
        return this;
    }

    public DataKeuanganBuilder setAuditID(String auditID) {
        this.auditID = auditID;
        return this;
    }

    public DataKeuanganBuilder setTglAudit(Date tglAudit) {
        this.tglAudit = tglAudit;
        return this;
    }

    public DataKeuanganBuilder setNamaAudit(String namaAudit) {
        this.namaAudit = namaAudit;
        return this;
    }

    public DataKeuanganBuilder setTahunKeuangan(String tahunKeuangan) {
        this.tahunKeuangan = tahunKeuangan;
        return this;
    }

    public DataKeuanganBuilder setKas(Double kas) {
        this.kas = kas;
        return this;
    }

    public DataKeuanganBuilder setBank(Double bank) {
        this.bank = bank;
        return this;
    }

    public DataKeuanganBuilder setTotalPiutang(Double totalPiutang) {
        this.totalPiutang = totalPiutang;
        return this;
    }

    public DataKeuanganBuilder setPersediaanBarang(Double persediaanBarang) {
        this.persediaanBarang = persediaanBarang;
        return this;
    }

    public DataKeuanganBuilder setPekerjaanDP(Double pekerjaanDP) {
        this.pekerjaanDP = pekerjaanDP;
        return this;
    }

    public DataKeuanganBuilder setTotalAktivaLancar(Double totalAktivaLancar) {
        this.totalAktivaLancar = totalAktivaLancar;
        return this;
    }

    public DataKeuanganBuilder setPeralatan(Double peralatan) {
        this.peralatan = peralatan;
        return this;
    }

    public DataKeuanganBuilder setInventaris(Double inventaris) {
        this.inventaris = inventaris;
        return this;
    }

    public DataKeuanganBuilder setGedung(Double gedung) {
        this.gedung = gedung;
        return this;
    }

    public DataKeuanganBuilder setTotalAktivaTetap(Double totalAktivaTetap) {
        this.totalAktivaTetap = totalAktivaTetap;
        return this;
    }

    public DataKeuanganBuilder setAktivaLainnya(Double aktivaLainnya) {
        this.aktivaLainnya = aktivaLainnya;
        return this;
    }

    public DataKeuanganBuilder setTotalAktivaLainnya(Double totalAktivaLainnya) {
        this.totalAktivaLainnya = totalAktivaLainnya;
        return this;
    }

    public DataKeuanganBuilder setHutangDagang(Double hutangDagang) {
        this.hutangDagang = hutangDagang;
        return this;
    }

    public DataKeuanganBuilder setHutangPajak(Double hutangPajak) {
        this.hutangPajak = hutangPajak;
        return this;
    }

    public DataKeuanganBuilder setHutangLainnya(Double hutangLainnya) {
        this.hutangLainnya = hutangLainnya;
        return this;
    }

    public DataKeuanganBuilder setTotalHutangJangkaPendek(Double totalHutangJangkaPendek) {
        this.totalHutangJangkaPendek = totalHutangJangkaPendek;
        return this;
    }

    public DataKeuanganBuilder setHutangJangkaPanjang(Double hutangJangkaPanjang) {
        this.hutangJangkaPanjang = hutangJangkaPanjang;
        return this;
    }

    public DataKeuanganBuilder setKekayaanBerih(Double kekayaanBerih) {
        this.kekayaanBerih = kekayaanBerih;
        return this;
    }

    public DataKeuanganBuilder setTotal(Double total) {
        this.total = total;
        return this;
    }

    public DataKeuanganBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataKeuanganBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataKeuanganBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataKeuanganBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataKeuangan createDataKeuangan() {
        return new DataKeuangan(id, idDataKeuangan, auditID, tglAudit, namaAudit, tahunKeuangan, kas, bank, totalPiutang, persediaanBarang, pekerjaanDP, totalAktivaLancar, peralatan, inventaris, gedung, totalAktivaTetap, aktivaLainnya, totalAktivaLainnya, hutangDagang, hutangPajak, hutangLainnya, totalHutangJangkaPendek, hutangJangkaPanjang, kekayaanBerih, total, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
