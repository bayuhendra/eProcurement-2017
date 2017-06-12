package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import com.agit.eProcure.shared.type.MataUangType;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataBank implements EntityObject<DataBank> {

    long id;
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

    public DataBank() {
    }

    public DataBank(long id, String idDataBank, String namaBank, String alamatBank, String kota, String negara, String noRekening, String namaNasabah, MataUangType mataUangType, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.idDataBank);
        hash = 53 * hash + Objects.hashCode(this.namaBank);
        hash = 53 * hash + Objects.hashCode(this.alamatBank);
        hash = 53 * hash + Objects.hashCode(this.kota);
        hash = 53 * hash + Objects.hashCode(this.negara);
        hash = 53 * hash + Objects.hashCode(this.noRekening);
        hash = 53 * hash + Objects.hashCode(this.namaNasabah);
        hash = 53 * hash + Objects.hashCode(this.mataUangType);
        hash = 53 * hash + Objects.hashCode(this.createdBy);
        hash = 53 * hash + Objects.hashCode(this.createdDate);
        hash = 53 * hash + Objects.hashCode(this.modifiedBy);
        hash = 53 * hash + Objects.hashCode(this.modifiedDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataBank other = (DataBank) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void assignNewDataBank(DataBank dataBank) {
        this.idDataBank = dataBank.idDataBank;
        this.namaBank = dataBank.namaBank;
        this.alamatBank = dataBank.alamatBank;
        this.kota = dataBank.kota;
        this.negara = dataBank.negara;
        this.noRekening = dataBank.noRekening;
        this.namaNasabah = dataBank.namaNasabah;
        this.mataUangType = dataBank.mataUangType;
        this.createdBy = dataBank.createdBy;
        this.createdDate = dataBank.createdDate;
        this.modifiedBy = dataBank.modifiedBy;
        this.modifiedDate = dataBank.modifiedDate;
    }

    @Override
    public boolean sameIdentityAs(DataBank other) {
        return this.equals(other);
    }

}
