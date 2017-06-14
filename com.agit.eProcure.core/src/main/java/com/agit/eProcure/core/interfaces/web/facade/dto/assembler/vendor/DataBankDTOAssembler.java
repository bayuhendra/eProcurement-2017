package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataBankDTO;
import com.agit.eProcure.common.dto.vendor.DataBankDTOBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;
import com.agit.eProcure.core.domain.vendor.DataBank;
import com.agit.eProcure.core.domain.vendor.DataBankBuilder;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataBankDTOAssembler implements IObjectAssembler<DataBank, DataBankDTO> {
    
    @Override
    public DataBankDTO toDTO(DataBank domainObject) {
        return new DataBankDTOBuilder()
                .setIdDataBank(domainObject.getIdDataBank())
                .setNamaBank(domainObject.getNamaBank())
                .setCabangBank(domainObject.getCabangBank())
                .setAlamatBank(domainObject.getAlamatBank())
                .setKota(domainObject.getKota())
                .setNegara(domainObject.getNegara())
                .setNoRekening(domainObject.getNoRekening())
                .setNamaNasabah(domainObject.getNamaNasabah())
                .setMataUangType(domainObject.getMataUangType())
                .setCreatedBy(domainObject.getCreatedBy())
                .setCreatedDate(domainObject.getCreatedDate())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .createDataBankDTO();
    }
    
    @Override
    public DataBank toDomain(DataBankDTO dtoObject) {
        return new DataBankBuilder()
                .setIdDataBank(dtoObject.getIdDataBank())
                .setNamaBank(dtoObject.getNamaBank())
                .setCabangBank(dtoObject.getCabangBank())
                .setAlamatBank(dtoObject.getAlamatBank())
                .setKota(dtoObject.getKota())
                .setNegara(dtoObject.getNegara())
                .setNoRekening(dtoObject.getNoRekening())
                .setNamaNasabah(dtoObject.getNamaNasabah())
                .setMataUangType(dtoObject.getMataUangType())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setCreatedDate(dtoObject.getCreatedDate())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .createDataBank();
    }
    
    public List<DataBank> toDomain(List<DataBankDTO> arg0) {
        List<DataBank> res = new ArrayList<>();
        for (DataBankDTO t : arg0) {
            res.add(new DataBankDTOAssembler().toDomain(t));
        }
        return res;
    }
    
    public List<DataBankDTO> toDTO(List<DataBank> arg0) {
        List<DataBankDTO> res = new ArrayList<>();
        for (DataBank t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }
    
}
