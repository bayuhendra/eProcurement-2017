/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;


public class PengalamanBerjalanDTOBuilder {
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

    public PengalamanBerjalanDTOBuilder() {
    }

    public PengalamanBerjalanDTOBuilder setIdPengalamanBerjalan(String idPengalamanBerjalan) {
        this.idPengalamanBerjalan = idPengalamanBerjalan;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setNamaPekerjaan(String namaPekerjaan) {
        this.namaPekerjaan = namaPekerjaan;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setLokasiPekerjaan(String lokasiPekerjaan) {
        this.lokasiPekerjaan = lokasiPekerjaan;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setBidangUsaha(BidangUsahaType bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setMulaiKerja(Date mulaiKerja) {
        this.mulaiKerja = mulaiKerja;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setNilaiKontrak(Double nilaiKontrak) {
        this.nilaiKontrak = nilaiKontrak;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setBuktiKerja(String buktiKerja) {
        this.buktiKerja = buktiKerja;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public PengalamanBerjalanDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public PengalamanBerjalanDTO createPengalamanBerjalanDTO() {
        return new PengalamanBerjalanDTO(idPengalamanBerjalan, namaPekerjaan, lokasiPekerjaan, bidangUsaha, mulaiKerja, nilaiKontrak, buktiKerja, createBy, createDate, modifiedBy, modifiedDate);
    }
    
}
