package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.MataUangType;
import java.util.Date;


public class DataBankDTOBuilder {

    private String idDataBank;
    private String namaBank;
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

    public DataBankDTOBuilder() {
    }

    public DataBankDTOBuilder setIdDataBank(String idDataBank) {
        this.idDataBank = idDataBank;
        return this;
    }

    public DataBankDTOBuilder setNamaBank(String namaBank) {
        this.namaBank = namaBank;
        return this;
    }

    public DataBankDTOBuilder setAlamatBank(String alamatBank) {
        this.alamatBank = alamatBank;
        return this;
    }

    public DataBankDTOBuilder setKota(String kota) {
        this.kota = kota;
        return this;
    }

    public DataBankDTOBuilder setNegara(String negara) {
        this.negara = negara;
        return this;
    }

    public DataBankDTOBuilder setNoRekening(String noRekening) {
        this.noRekening = noRekening;
        return this;
    }

    public DataBankDTOBuilder setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
        return this;
    }

    public DataBankDTOBuilder setMataUangType(MataUangType mataUangType) {
        this.mataUangType = mataUangType;
        return this;
    }

    public DataBankDTOBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataBankDTOBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataBankDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataBankDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataBankDTO createDataBankDTO() {
        return new DataBankDTO(idDataBank, namaBank, alamatBank, kota, negara, noRekening, namaNasabah, mataUangType, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
