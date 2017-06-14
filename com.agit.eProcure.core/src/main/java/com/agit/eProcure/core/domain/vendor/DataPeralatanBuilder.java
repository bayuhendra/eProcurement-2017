/*
 */
package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.BuktiKepemilikan;
import com.agit.eProcure.shared.type.KondisiPeralatan;
import java.util.Date;


public class DataPeralatanBuilder {
    private long id;
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

    public DataPeralatanBuilder() {
    }

    public DataPeralatanBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataPeralatanBuilder setIdDataPeralatan(String idDataPeralatan) {
        this.idDataPeralatan = idDataPeralatan;
        return this;
    }

    public DataPeralatanBuilder setJenis(String jenis) {
        this.jenis = jenis;
        return this;
    }

    public DataPeralatanBuilder setJumlah(String jumlah) {
        this.jumlah = jumlah;
        return this;
    }

    public DataPeralatanBuilder setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
        return this;
    }

    public DataPeralatanBuilder setMerkTipe(String merkTipe) {
        this.merkTipe = merkTipe;
        return this;
    }

    public DataPeralatanBuilder setTahunPembuatan(String tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
        return this;
    }

    public DataPeralatanBuilder setKondisiPeralatan(KondisiPeralatan kondisiPeralatan) {
        this.kondisiPeralatan = kondisiPeralatan;
        return this;
    }

    public DataPeralatanBuilder setLokasi(String lokasi) {
        this.lokasi = lokasi;
        return this;
    }

    public DataPeralatanBuilder setBuktiKepemilikan(BuktiKepemilikan buktiKepemilikan) {
        this.buktiKepemilikan = buktiKepemilikan;
        return this;
    }

    public DataPeralatanBuilder setDokumenBuktiKepemilikan(String dokumenBuktiKepemilikan) {
        this.dokumenBuktiKepemilikan = dokumenBuktiKepemilikan;
        return this;
    }

    public DataPeralatanBuilder setGambarPeralatanAset(String gambarPeralatanAset) {
        this.gambarPeralatanAset = gambarPeralatanAset;
        return this;
    }

    public DataPeralatanBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataPeralatanBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataPeralatanBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPeralatanBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPeralatan createDataPeralatan() {
        return new DataPeralatan(id, idDataPeralatan, jenis, jumlah, kapasitas, merkTipe, tahunPembuatan, kondisiPeralatan, lokasi, buktiKepemilikan, dokumenBuktiKepemilikan, gambarPeralatanAset, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
