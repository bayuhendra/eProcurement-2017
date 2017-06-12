/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;

public class DataPengalamanBuilder {

    private long id;
    private String idDataPengalaman;
    private String namaPekerjaan;
    private String lokasiPekerjaan;
    private BidangUsahaType bidangUsaha;
    private Date mulaiKerja;
    private Double nilaiKontrak;
    private String buktiKerjasama;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataPengalamanBuilder() {
    }

    public DataPengalamanBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataPengalamanBuilder setIdDataPengalaman(String idDataPengalaman) {
        this.idDataPengalaman = idDataPengalaman;
        return this;
    }

    public DataPengalamanBuilder setNamaPekerjaan(String namaPekerjaan) {
        this.namaPekerjaan = namaPekerjaan;
        return this;
    }

    public DataPengalamanBuilder setLokasiPekerjaan(String lokasiPekerjaan) {
        this.lokasiPekerjaan = lokasiPekerjaan;
        return this;
    }

    public DataPengalamanBuilder setBidangUsaha(BidangUsahaType bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
        return this;
    }

    public DataPengalamanBuilder setMulaiKerja(Date mulaiKerja) {
        this.mulaiKerja = mulaiKerja;
        return this;
    }

    public DataPengalamanBuilder setNilaiKontrak(Double nilaiKontrak) {
        this.nilaiKontrak = nilaiKontrak;
        return this;
    }

    public DataPengalamanBuilder setBuktiKerjasama(String buktiKerjasama) {
        this.buktiKerjasama = buktiKerjasama;
        return this;
    }

    public DataPengalamanBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public DataPengalamanBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public DataPengalamanBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPengalamanBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPengalaman createDataPengalaman() {
        return new DataPengalaman(id, idDataPengalaman, namaPekerjaan, lokasiPekerjaan, bidangUsaha, mulaiKerja, nilaiKontrak, buktiKerjasama, createBy, createDate, modifiedBy, modifiedDate);
    }

}
