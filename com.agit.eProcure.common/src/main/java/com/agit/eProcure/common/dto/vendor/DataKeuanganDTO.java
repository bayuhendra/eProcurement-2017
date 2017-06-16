package com.agit.eProcure.common.dto.vendor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 3AD
 */
public class DataKeuanganDTO implements Serializable {

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

    public DataKeuanganDTO() {
    }

    public DataKeuanganDTO(String idDataKeuangan, String auditID, Date tglAudit, String namaAudit, String tahunKeuangan, Double kas, Double bank, Double totalPiutang, Double persediaanBarang, Double pekerjaanDP, Double totalAktivaLancar, Double peralatan, Double inventaris, Double gedung, Double totalAktivaTetap, Double aktivaLainnya, Double totalAktivaLainnya, Double hutangDagang, Double hutangPajak, Double hutangLainnya, Double totalHutangJangkaPendek, Double hutangJangkaPanjang, Double kekayaanBerih, Double total, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.idDataKeuangan = idDataKeuangan;
        this.auditID = auditID;
        this.tglAudit = tglAudit;
        this.namaAudit = namaAudit;
        this.tahunKeuangan = tahunKeuangan;
        this.kas = kas;
        this.bank = bank;
        this.totalPiutang = totalPiutang;
        this.persediaanBarang = persediaanBarang;
        this.pekerjaanDP = pekerjaanDP;
        this.totalAktivaLancar = totalAktivaLancar;
        this.peralatan = peralatan;
        this.inventaris = inventaris;
        this.gedung = gedung;
        this.totalAktivaTetap = totalAktivaTetap;
        this.aktivaLainnya = aktivaLainnya;
        this.totalAktivaLainnya = totalAktivaLainnya;
        this.hutangDagang = hutangDagang;
        this.hutangPajak = hutangPajak;
        this.hutangLainnya = hutangLainnya;
        this.totalHutangJangkaPendek = totalHutangJangkaPendek;
        this.hutangJangkaPanjang = hutangJangkaPanjang;
        this.kekayaanBerih = kekayaanBerih;
        this.total = total;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public String getIdDataKeuangan() {
        return idDataKeuangan;
    }

    public void setIdDataKeuangan(String idDataKeuangan) {
        this.idDataKeuangan = idDataKeuangan;
    }

    public String getAuditID() {
        return auditID;
    }

    public void setAuditID(String auditID) {
        this.auditID = auditID;
    }

    public Date getTglAudit() {
        return tglAudit;
    }

    public void setTglAudit(Date tglAudit) {
        this.tglAudit = tglAudit;
    }

    public String getNamaAudit() {
        return namaAudit;
    }

    public void setNamaAudit(String namaAudit) {
        this.namaAudit = namaAudit;
    }

    public String getTahunKeuangan() {
        return tahunKeuangan;
    }

    public void setTahunKeuangan(String tahunKeuangan) {
        this.tahunKeuangan = tahunKeuangan;
    }

    public Double getKas() {
        return kas;
    }

    public void setKas(Double kas) {
        this.kas = kas;
    }

    public Double getBank() {
        return bank;
    }

    public void setBank(Double bank) {
        this.bank = bank;
    }

    public Double getTotalPiutang() {
        return totalPiutang;
    }

    public void setTotalPiutang(Double totalPiutang) {
        this.totalPiutang = totalPiutang;
    }

    public Double getPersediaanBarang() {
        return persediaanBarang;
    }

    public void setPersediaanBarang(Double persediaanBarang) {
        this.persediaanBarang = persediaanBarang;
    }

    public Double getPekerjaanDP() {
        return pekerjaanDP;
    }

    public void setPekerjaanDP(Double pekerjaanDP) {
        this.pekerjaanDP = pekerjaanDP;
    }

    public Double getTotalAktivaLancar() {
        return totalAktivaLancar;
    }

    public void setTotalAktivaLancar(Double totalAktivaLancar) {
        this.totalAktivaLancar = totalAktivaLancar;
    }

    public Double getPeralatan() {
        return peralatan;
    }

    public void setPeralatan(Double peralatan) {
        this.peralatan = peralatan;
    }

    public Double getInventaris() {
        return inventaris;
    }

    public void setInventaris(Double inventaris) {
        this.inventaris = inventaris;
    }

    public Double getGedung() {
        return gedung;
    }

    public void setGedung(Double gedung) {
        this.gedung = gedung;
    }

    public Double getTotalAktivaTetap() {
        return totalAktivaTetap;
    }

    public void setTotalAktivaTetap(Double totalAktivaTetap) {
        this.totalAktivaTetap = totalAktivaTetap;
    }

    public Double getAktivaLainnya() {
        return aktivaLainnya;
    }

    public void setAktivaLainnya(Double aktivaLainnya) {
        this.aktivaLainnya = aktivaLainnya;
    }

    public Double getTotalAktivaLainnya() {
        return totalAktivaLainnya;
    }

    public void setTotalAktivaLainnya(Double totalAktivaLainnya) {
        this.totalAktivaLainnya = totalAktivaLainnya;
    }

    public Double getHutangDagang() {
        return hutangDagang;
    }

    public void setHutangDagang(Double hutangDagang) {
        this.hutangDagang = hutangDagang;
    }

    public Double getHutangPajak() {
        return hutangPajak;
    }

    public void setHutangPajak(Double hutangPajak) {
        this.hutangPajak = hutangPajak;
    }

    public Double getHutangLainnya() {
        return hutangLainnya;
    }

    public void setHutangLainnya(Double hutangLainnya) {
        this.hutangLainnya = hutangLainnya;
    }

    public Double getTotalHutangJangkaPendek() {
        return totalHutangJangkaPendek;
    }

    public void setTotalHutangJangkaPendek(Double totalHutangJangkaPendek) {
        this.totalHutangJangkaPendek = totalHutangJangkaPendek;
    }

    public Double getHutangJangkaPanjang() {
        return hutangJangkaPanjang;
    }

    public void setHutangJangkaPanjang(Double hutangJangkaPanjang) {
        this.hutangJangkaPanjang = hutangJangkaPanjang;
    }

    public Double getKekayaanBerih() {
        return kekayaanBerih;
    }

    public void setKekayaanBerih(Double kekayaanBerih) {
        this.kekayaanBerih = kekayaanBerih;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
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
        return "DataKeuanganDTO{" + "idDataKeuangan=" + idDataKeuangan + ", auditID=" + auditID + ", tglAudit=" + tglAudit + ", namaAudit=" + namaAudit + ", tahunKeuangan=" + tahunKeuangan + ", kas=" + kas + ", bank=" + bank + ", totalPiutang=" + totalPiutang + ", persediaanBarang=" + persediaanBarang + ", pekerjaanDP=" + pekerjaanDP + ", totalAktivaLancar=" + totalAktivaLancar + ", peralatan=" + peralatan + ", inventaris=" + inventaris + ", gedung=" + gedung + ", totalAktivaTetap=" + totalAktivaTetap + ", aktivaLainnya=" + aktivaLainnya + ", totalAktivaLainnya=" + totalAktivaLainnya + ", hutangDagang=" + hutangDagang + ", hutangPajak=" + hutangPajak + ", hutangLainnya=" + hutangLainnya + ", totalHutangJangkaPendek=" + totalHutangJangkaPendek + ", hutangJangkaPanjang=" + hutangJangkaPanjang + ", kekayaanBerih=" + kekayaanBerih + ", total=" + total + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
