package com.agit.eProcure.common.dto.vendor;

import com.agit.eProcure.shared.type.MataUangType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataBankDTO implements Serializable {

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

    public DataBankDTO() {
    }

    public DataBankDTO(String idDataBank, String namaBank, String alamatBank, String kota, String negara, String noRekening, String namaNasabah, MataUangType mataUangType, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.idDataBank = idDataBank;
        this.namaBank = namaBank;
        this.alamatBank = alamatBank;
        this.kota = kota;
        this.negara = negara;
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
        this.mataUangType = mataUangType;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public String getIdDataBank() {
        return idDataBank;
    }

    public void setIdDataBank(String idDataBank) {
        this.idDataBank = idDataBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public String getAlamatBank() {
        return alamatBank;
    }

    public void setAlamatBank(String alamatBank) {
        this.alamatBank = alamatBank;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public MataUangType getMataUangType() {
        return mataUangType;
    }

    public void setMataUangType(MataUangType mataUangType) {
        this.mataUangType = mataUangType;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "DataBankDTO{" + "idDataBank=" + idDataBank + ", namaBank=" + namaBank + ", alamatBank=" + alamatBank + ", kota=" + kota + ", negara=" + negara + ", noRekening=" + noRekening + ", namaNasabah=" + namaNasabah + ", mataUangType=" + mataUangType + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
