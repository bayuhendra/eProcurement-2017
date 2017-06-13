/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;

public class DataPengalamanDTOBuilder {

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
    private Boolean statusPengalaman;

    public DataPengalamanDTOBuilder() {
    }

    public DataPengalamanDTOBuilder setIdDataPengalaman(String idDataPengalaman) {
        this.idDataPengalaman = idDataPengalaman;
        return this;
    }

    public DataPengalamanDTOBuilder setNamaPekerjaan(String namaPekerjaan) {
        this.namaPekerjaan = namaPekerjaan;
        return this;
    }

    public DataPengalamanDTOBuilder setLokasiPekerjaan(String lokasiPekerjaan) {
        this.lokasiPekerjaan = lokasiPekerjaan;
        return this;
    }

    public DataPengalamanDTOBuilder setBidangUsaha(BidangUsahaType bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
        return this;
    }

    public DataPengalamanDTOBuilder setMulaiKerja(Date mulaiKerja) {
        this.mulaiKerja = mulaiKerja;
        return this;
    }

    public DataPengalamanDTOBuilder setNilaiKontrak(Double nilaiKontrak) {
        this.nilaiKontrak = nilaiKontrak;
        return this;
    }

    public DataPengalamanDTOBuilder setBuktiKerjasama(String buktiKerjasama) {
        this.buktiKerjasama = buktiKerjasama;
        return this;
    }

    public DataPengalamanDTOBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public DataPengalamanDTOBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public DataPengalamanDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataPengalamanDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataPengalamanDTOBuilder setStatusPengalaman(Boolean statusPengalaman) {
        this.statusPengalaman = statusPengalaman;
        return this;
    }

    public DataPengalamanDTO createDataPengalamanDTO() {
        return new DataPengalamanDTO(idDataPengalaman, namaPekerjaan, lokasiPekerjaan, bidangUsaha, mulaiKerja, nilaiKontrak, buktiKerjasama, createBy, createDate, modifiedBy, modifiedDate, statusPengalaman);
    }

}
