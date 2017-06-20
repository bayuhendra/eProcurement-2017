package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataPenanggungJawabService;
import com.agit.eProcure.common.dto.vendor.DataPenanggungJawabDTO;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawab;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawabBuilder;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawabRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataPenanggungJawabDTOAssembler;
import com.agit.eProcure.shared.type.JabatanType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang.Validate;

/**
 *
 * @author Zaky
 */
public class DataPenanggungJawabServiceImpl implements DataPenanggungJawabService {

    private DataPenanggungJawabRepository dataPenanggungJawabRepository;
    private DataPenanggungJawabDTOAssembler dataPenanggungJawabDTOAssembler;

    public void setDataPenanggungJawabRepository(DataPenanggungJawabRepository dataPenanggungJawabRepository) {
        this.dataPenanggungJawabRepository = dataPenanggungJawabRepository;
    }

    public void setDataPenanggungJawabDTOAssembler(DataPenanggungJawabDTOAssembler dataPenanggungJawabDTOAssembler) {
        this.dataPenanggungJawabDTOAssembler = dataPenanggungJawabDTOAssembler;
    }

    @Override
    public void SaveOrUpdate(DataPenanggungJawabDTO dataPenanggungJawab) {
        Validate.notNull(dataPenanggungJawabRepository);
        DataPenanggungJawab p = dataPenanggungJawabRepository.findByID(dataPenanggungJawab.getIdPenanggungJawab());

        if (p == null) {
            p = dataPenanggungJawabDTOAssembler.toDomain(dataPenanggungJawab);
        } else {
            DataPenanggungJawab newDataPenanggungJawab = dataPenanggungJawabDTOAssembler.toDomain(dataPenanggungJawab);
            p.assignNewDataPenanggungJawab(newDataPenanggungJawab);

        }
        dataPenanggungJawabRepository.SaveOrUpdate(p);
    }

    @Override
    public void deleteData(DataPenanggungJawabDTO dataPenanggungJawab) {
        DataPenanggungJawab p = dataPenanggungJawabDTOAssembler.toDomain(dataPenanggungJawab);
        dataPenanggungJawabRepository.deleteData(p);
    }

    @Override
    public DataPenanggungJawabDTO findByID(String idDataPenanggungJawab) {
        Validate.notNull(dataPenanggungJawabRepository);
        DataPenanggungJawab p = (DataPenanggungJawab) dataPenanggungJawabRepository.findByID(idDataPenanggungJawab);
        if (p != null) {
            return dataPenanggungJawabDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataPenanggungJawabDTO> findAll() {
        Validate.notNull(dataPenanggungJawabRepository);
        return (List<DataPenanggungJawabDTO>) dataPenanggungJawabDTOAssembler.toDTO((List<DataPenanggungJawab>) dataPenanggungJawabRepository.findAll());
    }

    @Override
    public List<DataPenanggungJawabDTO> findByParams(Map map) {
        Validate.notNull(dataPenanggungJawabRepository);
        List<DataPenanggungJawab> listDataPenanggungJawab = dataPenanggungJawabRepository.findByParams(map);
        if (listDataPenanggungJawab != null) {
            return (List<DataPenanggungJawabDTO>) dataPenanggungJawabDTOAssembler.toDTO(listDataPenanggungJawab);
        }
        return null;
    }

    @Override
    public DataPenanggungJawabDTO getDummyData() {
        DataPenanggungJawab p = new DataPenanggungJawabBuilder()
                .setIdPerusahaan("12")
                .setIdPenanggungJawab("13")
                .setNamaPenanggungJawab("NamaPenanggungJawab")
                .setJabatanType(JabatanType.MANAGER)
                .setEmailPenanggungJawab("EmailPenanggungJawab")
                .setCreatedBy("ADMIN")
                .setCreatedDate(new Date())
                .setModifiedBy("ADMIN")
                .setModifiedDate(new Date())
                .createDataPenanggungJawab();

        return dataPenanggungJawabDTOAssembler.toDTO(p);
    }

}
