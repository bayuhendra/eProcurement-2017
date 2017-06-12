/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;

public class PengalamanMitraBuilder {

    private long id;
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

    public PengalamanMitraBuilder() {
    }

    public PengalamanMitraBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public PengalamanMitraBuilder setMitraID(String mitraID) {
        this.mitraID = mitraID;
        return this;
    }

    public PengalamanMitraBuilder setNamaMitra(String namaMitra) {
        this.namaMitra = namaMitra;
        return this;
    }

    public PengalamanMitraBuilder setLokasiKerja(String lokasiKerja) {
        this.lokasiKerja = lokasiKerja;
        return this;
    }

    public PengalamanMitraBuilder setBidangUsahaType(BidangUsahaType bidangUsahaType) {
        this.bidangUsahaType = bidangUsahaType;
        return this;
    }

    public PengalamanMitraBuilder setMulaiKerjasama(Date mulaiKerjasama) {
        this.mulaiKerjasama = mulaiKerjasama;
        return this;
    }

    public PengalamanMitraBuilder setNilai(Double nilai) {
        this.nilai = nilai;
        return this;
    }

    public PengalamanMitraBuilder setBuktiKerjasama(String buktiKerjasama) {
        this.buktiKerjasama = buktiKerjasama;
        return this;
    }

    public PengalamanMitraBuilder setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public PengalamanMitraBuilder setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public PengalamanMitraBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public PengalamanMitraBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public PengalamanMitra createPengalamanMitra() {
        return new PengalamanMitra(id, mitraID, namaMitra, lokasiKerja, bidangUsahaType, mulaiKerjasama, nilai, buktiKerjasama, createBy, createDate, modifiedBy, modifiedDate);
    }

}
