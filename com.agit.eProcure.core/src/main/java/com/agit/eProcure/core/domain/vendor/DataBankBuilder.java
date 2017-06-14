/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.type.MataUangType;
import java.util.Date;


public class DataBankBuilder {

    private long id;
    private String idDataBank;
    private String namaBank;
    private String cabangBank;
    private String alamatBank;
    private String kota;
    private String negara;
    private String noRekening;
    private String namaNasabah;
    private MataUangType mataUangType;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataBankBuilder() {
    }

    public DataBankBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataBankBuilder setIdDataBank(String idDataBank) {
        this.idDataBank = idDataBank;
        return this;
    }

    public DataBankBuilder setNamaBank(String namaBank) {
        this.namaBank = namaBank;
        return this;
    }

    public DataBankBuilder setCabangBank(String cabangBank) {
        this.cabangBank = cabangBank;
        return this;
    }

    public DataBankBuilder setAlamatBank(String alamatBank) {
        this.alamatBank = alamatBank;
        return this;
    }

    public DataBankBuilder setKota(String kota) {
        this.kota = kota;
        return this;
    }

    public DataBankBuilder setNegara(String negara) {
        this.negara = negara;
        return this;
    }

    public DataBankBuilder setNoRekening(String noRekening) {
        this.noRekening = noRekening;
        return this;
    }

    public DataBankBuilder setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
        return this;
    }

    public DataBankBuilder setMataUangType(MataUangType mataUangType) {
        this.mataUangType = mataUangType;
        return this;
    }

    public DataBankBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataBankBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataBankBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataBankBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataBank createDataBank() {
        return new DataBank(id, idDataBank, namaBank, cabangBank, alamatBank, kota, negara, noRekening, namaNasabah, mataUangType, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
