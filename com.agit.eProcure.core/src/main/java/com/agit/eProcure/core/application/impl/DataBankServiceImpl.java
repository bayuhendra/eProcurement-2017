package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataBankService;
import com.agit.eProcure.common.dto.vendor.DataBankDTO;
import com.agit.eProcure.core.domain.vendor.DataBank;
import com.agit.eProcure.core.domain.vendor.DataBankBuilder;
import com.agit.eProcure.core.domain.vendor.DataBankRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataBankDTOAssembler;
import com.agit.eProcure.shared.type.MataUangType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang.Validate;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataBankServiceImpl implements DataBankService {

    private DataBankRepository dataBankRepository;
    private DataBankDTOAssembler dataBankDTOAssembler;

    public void setDataBankRepository(DataBankRepository dataBankRepository) {
        this.dataBankRepository = dataBankRepository;
    }

    public void setDataBankDTOAssembler(DataBankDTOAssembler dataBankDTOAssembler) {
        this.dataBankDTOAssembler = dataBankDTOAssembler;
    }

    @Override
    public void SaveOrUpdate(DataBankDTO dataBank) {
        Validate.notNull(dataBankRepository);
        DataBank p = dataBankRepository.findByID(dataBank.getIdDataBank());

        if (p == null) {
            p = dataBankDTOAssembler.toDomain(dataBank);
        } else {
            DataBank newDataBank = dataBankDTOAssembler.toDomain(dataBank);
            p.assignNewDataBank(newDataBank);

        }
        dataBankRepository.SaveOrUpdate(p);
    }

    @Override
    public void deleteData(DataBankDTO dataBank) {
        DataBank p = dataBankDTOAssembler.toDomain(dataBank);
        dataBankRepository.deleteData(p);
    }

    @Override
    public DataBankDTO findByID(String idDataBank) {
        Validate.notNull(dataBankRepository);
        DataBank p = (DataBank) dataBankRepository.findByID(idDataBank);
        if (p != null) {
            return dataBankDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataBankDTO> findAll() {
        Validate.notNull(dataBankRepository);
        return (List<DataBankDTO>) dataBankDTOAssembler.toDTO((List<DataBank>) dataBankRepository.findAll());
    }

    @Override
    public List<DataBankDTO> findByParams(Map map) {
        Validate.notNull(dataBankRepository);
        List<DataBank> listDataBank = dataBankRepository.findByParams(map);
        if (listDataBank != null) {
            return (List<DataBankDTO>) dataBankDTOAssembler.toDTO(listDataBank);
        }
        return null;
    }

    @Override
    public DataBankDTO getDummyData() {
        DataBank p = new DataBankBuilder()
                .setIdDataBank((UUID.randomUUID().toString()))
                .setNamaBank("namaBank")
                .setCabangBank("cabangBank")
                .setAlamatBank("alamatBank")
                .setKota("kota")
                .setNegara("negara")
                .setNoRekening("noRekening")
                .setNamaNasabah("namaNasabah")
                .setMataUangType(MataUangType.RUPIAH)
                .setCreatedBy("ADMIN")
                .setCreatedDate(new Date())
                .setModifiedBy("ADMIN")
                .setModifiedDate(new Date())
                .createDataBank();

        return dataBankDTOAssembler.toDTO(p);
    }
}
