/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;

public class PengalamanMitraDTOBuilder {

    private String mitraID;
    private String namaMitra;
    private String lokasiKerja;
    private BidangUsahaType bidangUsahaType;
    private Date mulaiKerjasama;
    private Double nilai;
    private String buktiKerjasama;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;

    public PengalamanMitraDTOBuilder() {
    }

    public PengalamanMitraDTOBuilder setMitraID(String mitraID) {
        this.mitraID = mitraID;
        return this;
    }

    public PengalamanMitraDTOBuilder setNamaMitra(String namaMitra) {
        this.namaMitra = namaMitra;
        return this;
    }

    public PengalamanMitraDTOBuilder setLokasiKerja(String lokasiKerja) {
        this.lokasiKerja = lokasiKerja;
        return this;
    }

    public PengalamanMitraDTOBuilder setBidangUsahaType(BidangUsahaType bidangUsahaType) {
        this.bidangUsahaType = bidangUsahaType;
        return this;
    }

    public PengalamanMitraDTOBuilder setMulaiKerjasama(Date mulaiKerjasama) {
        this.mulaiKerjasama = mulaiKerjasama;
        return this;
    }

    public PengalamanMitraDTOBuilder setNilai(Double nilai) {
        this.nilai = nilai;
        return this;
    }

    public PengalamanMitraDTOBuilder setBuktiKerjasama(String buktiKerjasama) {
        this.buktiKerjasama = buktiKerjasama;
        return this;
    }

    public PengalamanMitraDTOBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public PengalamanMitraDTOBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public PengalamanMitraDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public PengalamanMitraDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public PengalamanMitraDTO createPengalamanMitraDTO() {
        return new PengalamanMitraDTO(mitraID, namaMitra, lokasiKerja, bidangUsahaType, mulaiKerjasama, nilai, buktiKerjasama, createBy, createDate, modifiedBy, modifiedDate);
    }

}
