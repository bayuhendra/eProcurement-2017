package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.type.BuktiKepemilikan;
import com.agit.eProcure.shared.type.KondisiPeralatan;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Zaky
 */
public class DataPeralatan implements EntityObject<DataPeralatan> {

    long id;
    private String idDataPeralatan;
    private String jenis;
    private String jumlah;
    private String kapasitas;
    private String merkTipe;
    private String tahunPembuatan;
    private KondisiPeralatan kondisiPeralatan;
    private String lokasi;
    private BuktiKepemilikan buktiKepemilikan;
    private String dokumenBuktiKepemilikan;
    private String gambarPeralatanAset;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPeralatan() {
    }

    public DataPeralatan(long id, String idDataPeralatan, String jenis, String jumlah, String kapasitas, String merkTipe, String tahunPembuatan, KondisiPeralatan kondisiPeralatan, String lokasi, BuktiKepemilikan buktiKepemilikan, String dokumenBuktiKepemilikan, String gambarPeralatanAset, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
        this.idDataPeralatan = idDataPeralatan;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.kapasitas = kapasitas;
        this.merkTipe = merkTipe;
        this.tahunPembuatan = tahunPembuatan;
        this.kondisiPeralatan = kondisiPeralatan;
        this.lokasi = lokasi;
        this.buktiKepemilikan = buktiKepemilikan;
        this.dokumenBuktiKepemilikan = dokumenBuktiKepemilikan;
        this.gambarPeralatanAset = gambarPeralatanAset;
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

    public String getIdDataPeralatan() {
        return idDataPeralatan;
    }

    public void setIdDataPeralatan(String idDataPeralatan) {
        this.idDataPeralatan = idDataPeralatan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getMerkTipe() {
        return merkTipe;
    }

    public void setMerkTipe(String merkTipe) {
        this.merkTipe = merkTipe;
    }

    public String getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(String tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public KondisiPeralatan getKondisiPeralatan() {
        return kondisiPeralatan;
    }

    public void setKondisiPeralatan(KondisiPeralatan kondisiPeralatan) {
        this.kondisiPeralatan = kondisiPeralatan;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public BuktiKepemilikan getBuktiKepemilikan() {
        return buktiKepemilikan;
    }

    public void setBuktiKepemilikan(BuktiKepemilikan buktiKepemilikan) {
        this.buktiKepemilikan = buktiKepemilikan;
    }

    public String getDokumenBuktiKepemilikan() {
        return dokumenBuktiKepemilikan;
    }

    public void setDokumenBuktiKepemilikan(String dokumenBuktiKepemilikan) {
        this.dokumenBuktiKepemilikan = dokumenBuktiKepemilikan;
    }

    public String getGambarPeralatanAset() {
        return gambarPeralatanAset;
    }

    public void setGambarPeralatanAset(String gambarPeralatanAset) {
        this.gambarPeralatanAset = gambarPeralatanAset;
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
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.idDataPeralatan);
        hash = 83 * hash + Objects.hashCode(this.jenis);
        hash = 83 * hash + Objects.hashCode(this.jumlah);
        hash = 83 * hash + Objects.hashCode(this.kapasitas);
        hash = 83 * hash + Objects.hashCode(this.merkTipe);
        hash = 83 * hash + Objects.hashCode(this.tahunPembuatan);
        hash = 83 * hash + Objects.hashCode(this.kondisiPeralatan);
        hash = 83 * hash + Objects.hashCode(this.lokasi);
        hash = 83 * hash + Objects.hashCode(this.buktiKepemilikan);
        hash = 83 * hash + Objects.hashCode(this.dokumenBuktiKepemilikan);
        hash = 83 * hash + Objects.hashCode(this.gambarPeralatanAset);
        hash = 83 * hash + Objects.hashCode(this.createdBy);
        hash = 83 * hash + Objects.hashCode(this.createdDate);
        hash = 83 * hash + Objects.hashCode(this.modifiedBy);
        hash = 83 * hash + Objects.hashCode(this.modifiedDate);
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
        final DataPeralatan other = (DataPeralatan) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public void assignNewDataPeralatan(DataPeralatan dataPeralatan){
        this.id = dataPeralatan.id;
        this.idDataPeralatan = dataPeralatan.idDataPeralatan;
        this.jenis = dataPeralatan.jenis;
        this.jumlah = dataPeralatan.jumlah;
        this.kapasitas = dataPeralatan.kapasitas;
        this.merkTipe = dataPeralatan.merkTipe;
        this.tahunPembuatan = dataPeralatan.tahunPembuatan;
        this.kondisiPeralatan = dataPeralatan.kondisiPeralatan;
        this.lokasi = dataPeralatan.lokasi;
        this.buktiKepemilikan = dataPeralatan.buktiKepemilikan;
        this.dokumenBuktiKepemilikan = dataPeralatan.dokumenBuktiKepemilikan;
        this.gambarPeralatanAset = dataPeralatan.gambarPeralatanAset;
        this.createdBy = dataPeralatan.createdBy;
        this.createdDate = dataPeralatan.createdDate;
        this.modifiedBy = dataPeralatan.modifiedBy;
        this.modifiedDate = dataPeralatan.modifiedDate;
    }
    
    
    

    @Override            
    public boolean sameIdentityAs(DataPeralatan other) {
        return this.equals(other);
    }

}
