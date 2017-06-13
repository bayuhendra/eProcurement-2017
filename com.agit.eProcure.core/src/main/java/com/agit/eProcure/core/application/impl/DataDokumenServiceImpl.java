package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataDokumenService;
import com.agit.eProcure.common.dto.vendor.DataDokumenDTO;
import com.agit.eProcure.core.domain.vendor.DataDokumen;
import com.agit.eProcure.core.domain.vendor.DataDokumenBuilder;
import com.agit.eProcure.core.domain.vendor.DataDokumenRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataDokumenDTOAssembler;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author 3AD
 */
public class DataDokumenServiceImpl implements DataDokumenService {

    private DataDokumenRepository dataDokumenRepository;
    private DataDokumenDTOAssembler dataDokumenDTOAssembler;

    public void setDataDokumenRepository(DataDokumenRepository dataDokumenRepository) {
        this.dataDokumenRepository = dataDokumenRepository;
    }

    public void setDataDokumenDTOAssembler(DataDokumenDTOAssembler dataDokumenDTOAssembler) {
        this.dataDokumenDTOAssembler = dataDokumenDTOAssembler;
    }

    @Override
    public void saveOrUpdate(DataDokumenDTO dataDokumen) {
        Validate.notNull(dataDokumenRepository);
        DataDokumen p = dataDokumenRepository.findByID(dataDokumen.getDokumenID());

        if (p == null) {
            p = dataDokumenDTOAssembler.toDomain(dataDokumen);
        } else {
            DataDokumen newDataDokumen = dataDokumenDTOAssembler.toDomain(dataDokumen);
            p.assignNewDokumen(newDataDokumen);

        }
        dataDokumenRepository.SaveOrUpdate(p);
    }

    @Override
    public void delete(DataDokumenDTO dataDokumen) {
        DataDokumen p = dataDokumenDTOAssembler.toDomain(dataDokumen);
        dataDokumenRepository.deleteData(p);
    }

    @Override
    public DataDokumenDTO findByID(String dokumenID) {
        Validate.notNull(dataDokumenRepository);
        DataDokumen p = (DataDokumen) dataDokumenRepository.findByID(dokumenID);
        if (p != null) {
            return dataDokumenDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataDokumenDTO> findAll() {
        Validate.notNull(dataDokumenRepository);
        return (List<DataDokumenDTO>) dataDokumenDTOAssembler.toDTOs((List<DataDokumen>) dataDokumenRepository.findAll());
    }

    @Override
    public List<DataDokumenDTO> findByParams(Map map) {
        Validate.notNull(dataDokumenRepository);
        List<DataDokumen> listDataDokumen = dataDokumenRepository.findByParam(map);
        if (listDataDokumen != null) {
            return (List<DataDokumenDTO>) dataDokumenDTOAssembler.toDTOs(listDataDokumen);
        }
        return null;
    }

    @Override
    public DataDokumenDTO getDummy() {
        DataDokumen p = new DataDokumenBuilder()
                .setCreateBy("as")
                .setCreateDate(new Date())
                .setDokumenID("asa")
                .setModifiedBy("adas")
                .setModifiedDate(new Date())
                .setNoDokumen("1234")
                .setSubject("wdqwd")
                .setTglAkhir(new Date())
                .setTglTerbit(new Date())
                .setUploadFile("qwe")
                .createDataDokumen();
        return dataDokumenDTOAssembler.toDTO(p);
    }

}
