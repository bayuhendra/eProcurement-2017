/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;

public class PengalamanBerjalanBuilder {

    private String idPengalamanBerjalan;
    private String namaPekerjaan;
    private String lokasiPekerjaan;
    private BidangUsahaType bidangUsaha;
    private Date mulaiKerja;
    private Double nilaiKontrak;
    private String buktiKerja;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;

    public PengalamanBerjalanBuilder() {
    }

    public PengalamanBerjalanBuilder setIdPengalamanBerjalan(String idPengalamanBerjalan) {
        this.idPengalamanBerjalan = idPengalamanBerjalan;
        return this;
    }

    public PengalamanBerjalanBuilder setNamaPekerjaan(String namaPekerjaan) {
        this.namaPekerjaan = namaPekerjaan;
        return this;
    }

    public PengalamanBerjalanBuilder setLokasiPekerjaan(String lokasiPekerjaan) {
        this.lokasiPekerjaan = lokasiPekerjaan;
        return this;
    }

    public PengalamanBerjalanBuilder setBidangUsaha(BidangUsahaType bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
        return this;
    }

    public PengalamanBerjalanBuilder setMulaiKerja(Date mulaiKerja) {
        this.mulaiKerja = mulaiKerja;
        return this;
    }

    public PengalamanBerjalanBuilder setNilaiKontrak(Double nilaiKontrak) {
        this.nilaiKontrak = nilaiKontrak;
        return this;
    }

    public PengalamanBerjalanBuilder setBuktiKerja(String buktiKerja) {
        this.buktiKerja = buktiKerja;
        return this;
    }

    public PengalamanBerjalanBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public PengalamanBerjalanBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public PengalamanBerjalanBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public PengalamanBerjalanBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public PengalamanBerjalan createPengalamanBerjalan() {
        return new PengalamanBerjalan(idPengalamanBerjalan, namaPekerjaan, lokasiPekerjaan, bidangUsaha, mulaiKerja, nilaiKontrak, buktiKerja, createBy, createDate, modifiedBy, modifiedDate);
    }

}
