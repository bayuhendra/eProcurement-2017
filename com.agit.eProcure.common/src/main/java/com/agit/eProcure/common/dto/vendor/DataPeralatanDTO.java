/*
 */
package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BuktiKepemilikan;
import com.agit.eProcure.shared.type.KondisiPeralatan;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zaky
 */
public class DataPeralatanDTO implements Serializable{
    
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

    public DataPeralatanDTO() {
    }

    public DataPeralatanDTO(String idDataPeralatan, String jenis, String jumlah, String kapasitas, String merkTipe, String tahunPembuatan, KondisiPeralatan kondisiPeralatan, String lokasi, BuktiKepemilikan buktiKepemilikan, String dokumenBuktiKepemilikan, String gambarPeralatanAset, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
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
    public String toString() {
        return "DataPeralatanDTO{" + "idDataPeralatan=" + idDataPeralatan + ", jenis=" + jenis + ", jumlah=" + jumlah + ", kapasitas=" + kapasitas + ", merkTipe=" + merkTipe + ", tahunPembuatan=" + tahunPembuatan + ", kondisiPeralatan=" + kondisiPeralatan + ", lokasi=" + lokasi + ", buktiKepemilikan=" + buktiKepemilikan + ", dokumenBuktiKepemilikan=" + dokumenBuktiKepemilikan + ", gambarPeralatanAset=" + gambarPeralatanAset + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }
        
}
