package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 3AD
 */
public class DataKeuangan implements EntityObject<DataKeuangan> {

    long id;
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

    public DataKeuangan() {
    }

    public DataKeuangan(long id, String idDataKeuangan, String auditID, Date tglAudit, String namaAudit, String tahunKeuangan, Double kas, Double bank, Double totalPiutang, Double persediaanBarang, Double pekerjaanDP, Double totalAktivaLancar, Double peralatan, Double inventaris, Double gedung, Double totalAktivaTetap, Double aktivaLainnya, Double totalAktivaLainnya, Double hutangDagang, Double hutangPajak, Double hutangLainnya, Double totalHutangJangkaPendek, Double hutangJangkaPanjang, Double kekayaanBerih, Double total, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
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

    public void assignNewKeuangan(DataKeuangan dataKeuangan) {
        this.idDataKeuangan = dataKeuangan.idDataKeuangan;
        this.auditID = dataKeuangan.auditID;
        this.tglAudit = dataKeuangan.tglAudit;
        this.namaAudit = dataKeuangan.namaAudit;
        this.tahunKeuangan = dataKeuangan.tahunKeuangan;
        this.kas = dataKeuangan.kas;
        this.bank = dataKeuangan.bank;
        this.totalPiutang = dataKeuangan.totalPiutang;
        this.persediaanBarang = dataKeuangan.persediaanBarang;
        this.pekerjaanDP = dataKeuangan.pekerjaanDP;
        this.totalAktivaLancar = dataKeuangan.totalAktivaLancar;
        this.peralatan = dataKeuangan.peralatan;
        this.inventaris = dataKeuangan.inventaris;
        this.gedung = dataKeuangan.gedung;
        this.totalAktivaTetap = dataKeuangan.totalAktivaTetap;
        this.aktivaLainnya = dataKeuangan.aktivaLainnya;
        this.totalAktivaLainnya = dataKeuangan.totalAktivaLainnya;
        this.hutangDagang = dataKeuangan.hutangDagang;
        this.hutangPajak = dataKeuangan.hutangPajak;
        this.hutangLainnya = dataKeuangan.hutangLainnya;
        this.totalHutangJangkaPendek = dataKeuangan.totalHutangJangkaPendek;
        this.hutangJangkaPanjang = dataKeuangan.hutangJangkaPanjang;
        this.kekayaanBerih = dataKeuangan.kekayaanBerih;
        this.total = dataKeuangan.total;
        this.createdBy = dataKeuangan.createdBy;
        this.createdDate = dataKeuangan.createdDate;
        this.modifiedBy = dataKeuangan.modifiedBy;
        this.modifiedDate = dataKeuangan.modifiedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getIdDataKeuangan() {
        return idDataKeuangan;
    }

    public void setIdDataKeuangan(String idDataKeuangan) {
        this.idDataKeuangan = idDataKeuangan;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.idDataKeuangan);
        hash = 83 * hash + Objects.hashCode(this.auditID);
        hash = 83 * hash + Objects.hashCode(this.tglAudit);
        hash = 83 * hash + Objects.hashCode(this.namaAudit);
        hash = 83 * hash + Objects.hashCode(this.tahunKeuangan);
        hash = 83 * hash + Objects.hashCode(this.kas);
        hash = 83 * hash + Objects.hashCode(this.bank);
        hash = 83 * hash + Objects.hashCode(this.totalPiutang);
        hash = 83 * hash + Objects.hashCode(this.persediaanBarang);
        hash = 83 * hash + Objects.hashCode(this.pekerjaanDP);
        hash = 83 * hash + Objects.hashCode(this.totalAktivaLancar);
        hash = 83 * hash + Objects.hashCode(this.peralatan);
        hash = 83 * hash + Objects.hashCode(this.inventaris);
        hash = 83 * hash + Objects.hashCode(this.gedung);
        hash = 83 * hash + Objects.hashCode(this.totalAktivaTetap);
        hash = 83 * hash + Objects.hashCode(this.aktivaLainnya);
        hash = 83 * hash + Objects.hashCode(this.totalAktivaLainnya);
        hash = 83 * hash + Objects.hashCode(this.hutangDagang);
        hash = 83 * hash + Objects.hashCode(this.hutangPajak);
        hash = 83 * hash + Objects.hashCode(this.hutangLainnya);
        hash = 83 * hash + Objects.hashCode(this.totalHutangJangkaPendek);
        hash = 83 * hash + Objects.hashCode(this.hutangJangkaPanjang);
        hash = 83 * hash + Objects.hashCode(this.kekayaanBerih);
        hash = 83 * hash + Objects.hashCode(this.total);
        hash = 83 * hash + Objects.hashCode(this.createdBy);
        hash = 83 * hash + Objects.hashCode(this.createdDate);
        hash = 83 * hash + Objects.hashCode(this.modifiedBy);
        hash = 83 * hash + Objects.hashCode(this.modifiedDate);
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
        final DataKeuangan other = (DataKeuangan) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public boolean sameIdentityAs(DataKeuangan other) {
        return this.equals(other);
    }

}
