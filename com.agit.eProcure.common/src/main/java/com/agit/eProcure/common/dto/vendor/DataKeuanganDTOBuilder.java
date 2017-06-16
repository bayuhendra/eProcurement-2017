/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.common.dto.vendor;

import java.util.Date;


public class DataKeuanganDTOBuilder {

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

    public DataKeuanganDTOBuilder() {
    }

    public DataKeuanganDTOBuilder setIdDataKeuangan(String idDataKeuangan) {
        this.idDataKeuangan = idDataKeuangan;
        return this;
    }

    public DataKeuanganDTOBuilder setAuditID(String auditID) {
        this.auditID = auditID;
        return this;
    }

    public DataKeuanganDTOBuilder setTglAudit(Date tglAudit) {
        this.tglAudit = tglAudit;
        return this;
    }

    public DataKeuanganDTOBuilder setNamaAudit(String namaAudit) {
        this.namaAudit = namaAudit;
        return this;
    }

    public DataKeuanganDTOBuilder setTahunKeuangan(String tahunKeuangan) {
        this.tahunKeuangan = tahunKeuangan;
        return this;
    }

    public DataKeuanganDTOBuilder setKas(Double kas) {
        this.kas = kas;
        return this;
    }

    public DataKeuanganDTOBuilder setBank(Double bank) {
        this.bank = bank;
        return this;
    }

    public DataKeuanganDTOBuilder setTotalPiutang(Double totalPiutang) {
        this.totalPiutang = totalPiutang;
        return this;
    }

    public DataKeuanganDTOBuilder setPersediaanBarang(Double persediaanBarang) {
        this.persediaanBarang = persediaanBarang;
        return this;
    }

    public DataKeuanganDTOBuilder setPekerjaanDP(Double pekerjaanDP) {
        this.pekerjaanDP = pekerjaanDP;
        return this;
    }

    public DataKeuanganDTOBuilder setTotalAktivaLancar(Double totalAktivaLancar) {
        this.totalAktivaLancar = totalAktivaLancar;
        return this;
    }

    public DataKeuanganDTOBuilder setPeralatan(Double peralatan) {
        this.peralatan = peralatan;
        return this;
    }

    public DataKeuanganDTOBuilder setInventaris(Double inventaris) {
        this.inventaris = inventaris;
        return this;
    }

    public DataKeuanganDTOBuilder setGedung(Double gedung) {
        this.gedung = gedung;
        return this;
    }

    public DataKeuanganDTOBuilder setTotalAktivaTetap(Double totalAktivaTetap) {
        this.totalAktivaTetap = totalAktivaTetap;
        return this;
    }

    public DataKeuanganDTOBuilder setAktivaLainnya(Double aktivaLainnya) {
        this.aktivaLainnya = aktivaLainnya;
        return this;
    }

    public DataKeuanganDTOBuilder setTotalAktivaLainnya(Double totalAktivaLainnya) {
        this.totalAktivaLainnya = totalAktivaLainnya;
        return this;
    }

    public DataKeuanganDTOBuilder setHutangDagang(Double hutangDagang) {
        this.hutangDagang = hutangDagang;
        return this;
    }

    public DataKeuanganDTOBuilder setHutangPajak(Double hutangPajak) {
        this.hutangPajak = hutangPajak;
        return this;
    }

    public DataKeuanganDTOBuilder setHutangLainnya(Double hutangLainnya) {
        this.hutangLainnya = hutangLainnya;
        return this;
    }

    public DataKeuanganDTOBuilder setTotalHutangJangkaPendek(Double totalHutangJangkaPendek) {
        this.totalHutangJangkaPendek = totalHutangJangkaPendek;
        return this;
    }

    public DataKeuanganDTOBuilder setHutangJangkaPanjang(Double hutangJangkaPanjang) {
        this.hutangJangkaPanjang = hutangJangkaPanjang;
        return this;
    }

    public DataKeuanganDTOBuilder setKekayaanBerih(Double kekayaanBerih) {
        this.kekayaanBerih = kekayaanBerih;
        return this;
    }

    public DataKeuanganDTOBuilder setTotal(Double total) {
        this.total = total;
        return this;
    }

    public DataKeuanganDTOBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataKeuanganDTOBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataKeuanganDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataKeuanganDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataKeuanganDTO createDataKeuanganDTO() {
        return new DataKeuanganDTO(idDataKeuangan, auditID, tglAudit, namaAudit, tahunKeuangan, kas, bank, totalPiutang, persediaanBarang, pekerjaanDP, totalAktivaLancar, peralatan, inventaris, gedung, totalAktivaTetap, aktivaLainnya, totalAktivaLainnya, hutangDagang, hutangPajak, hutangLainnya, totalHutangJangkaPendek, hutangJangkaPanjang, kekayaanBerih, total, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
