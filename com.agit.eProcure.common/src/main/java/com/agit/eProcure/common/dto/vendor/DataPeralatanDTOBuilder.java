/*
 */
package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BuktiKepemilikan;
import com.agit.eProcure.shared.type.KondisiPeralatan;
import java.util.Date;


public class DataPeralatanDTOBuilder {
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

    public DataPeralatanDTOBuilder() {
    }

    public DataPeralatanDTOBuilder setIdDataPeralatan(String idDataPeralatan) {
        this.idDataPeralatan = idDataPeralatan;
        return this;
    }

    public DataPeralatanDTOBuilder setJenis(String jenis) {
        this.jenis = jenis;
        return this;
    }

    public DataPeralatanDTOBuilder setJumlah(String jumlah) {
        this.jumlah = jumlah;
        return this;
    }

    public DataPeralatanDTOBuilder setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
        return this;
    }

    public DataPeralatanDTOBuilder setMerkTipe(String merkTipe) {
        this.merkTipe = merkTipe;
        return this;
    }

    public DataPeralatanDTOBuilder setTahunPembuatan(String tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
        return this;
    }

    public DataPeralatanDTOBuilder setKondisiPeralatan(KondisiPeralatan kondisiPeralatan) {
        this.kondisiPeralatan = kondisiPeralatan;
        return this;
    }

    public DataPeralatanDTOBuilder setLokasi(String lokasi) {
        this.lokasi = lokasi;
        return this;
    }

    public DataPeralatanDTOBuilder setBuktiKepemilikan(BuktiKepemilikan buktiKepemilikan) {
        this.buktiKepemilikan = buktiKepemilikan;
        return this;
    }

    public DataPeralatanDTOBuilder setDokumenBuktiKepemilikan(String dokumenBuktiKepemilikan) {
        this.dokumenBuktiKepemilikan = dokumenBuktiKepemilikan;
        return this;
    }

    public DataPeralatanDTOBuilder setGambarPeralatanAset(String gambarPeralatanAset) {
        this.gambarPeralatanAset = gambarPeralatanAset;
        return this;
    }

    public DataPeralatanDTOBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataPeralatanDTOBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataPeralatanDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPeralatanDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPeralatanDTO createDataPeralatanDTO() {
        return new DataPeralatanDTO(idDataPeralatan, jenis, jumlah, kapasitas, merkTipe, tahunPembuatan, kondisiPeralatan, lokasi, buktiKepemilikan, dokumenBuktiKepemilikan, gambarPeralatanAset, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
