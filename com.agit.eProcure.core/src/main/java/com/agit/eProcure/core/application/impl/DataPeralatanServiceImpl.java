/*
 */
package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataPeralatanService;
import com.agit.eProcure.common.dto.vendor.DataPeralatanDTO;
import com.agit.eProcure.core.domain.vendor.DataPeralatan;
import com.agit.eProcure.core.domain.vendor.DataPeralatanBuilder;
import com.agit.eProcure.core.domain.vendor.DataPeralatanRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataPeralatanDTOAssembler;
import com.agit.eProcure.shared.type.BuktiKepemilikan;
import com.agit.eProcure.shared.type.KondisiPeralatan;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang.Validate;

/**
 *
 * @author Zaky
 */
public class DataPeralatanServiceImpl implements DataPeralatanService {

    private DataPeralatanRepository dataPeralatanRepository;
    private DataPeralatanDTOAssembler dataPeralatanDTOAssembler;

    public void setDataPeralatanRepository(DataPeralatanRepository dataPeralatanRepository) {
        this.dataPeralatanRepository = dataPeralatanRepository;
    }

    public void setDataPeralatanDTOAssembler(DataPeralatanDTOAssembler dataPeralatanDTOAssembler) {
        this.dataPeralatanDTOAssembler = dataPeralatanDTOAssembler;
    }

    @Override
    public void SaveOrUpdate(DataPeralatanDTO dataPeralatan) {
        Validate.notNull(dataPeralatanRepository);
        DataPeralatan p = dataPeralatanRepository.findByID(dataPeralatan.getIdDataPeralatan());

        if (p == null) {
            p = dataPeralatanDTOAssembler.toDomain(dataPeralatan);
        } else {
            DataPeralatan newDataPeralatan = dataPeralatanDTOAssembler.toDomain(dataPeralatan);
            p.assignNewDataPeralatan(newDataPeralatan);

        }
        dataPeralatanRepository.SaveOrUpdate(p);
    }

    @Override
    public void deleteData(DataPeralatanDTO dataPeralatan) {
        DataPeralatan p = dataPeralatanDTOAssembler.toDomain(dataPeralatan);
        dataPeralatanRepository.deleteData(p);
    }

    @Override
    public DataPeralatanDTO findByID(String idDataPeralatan) {
        Validate.notNull(dataPeralatanRepository);
        DataPeralatan p = (DataPeralatan) dataPeralatanRepository.findByID(idDataPeralatan);
        if (p != null) {
            return dataPeralatanDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataPeralatanDTO> findAll() {
        Validate.notNull(dataPeralatanRepository);
        return (List<DataPeralatanDTO>) dataPeralatanDTOAssembler.toDTO((List<DataPeralatan>) dataPeralatanRepository.findAll());
    }

    @Override
    public List<DataPeralatanDTO> findByParams(Map map) {
        Validate.notNull(dataPeralatanRepository);
        List<DataPeralatan> listDataPeralatan = dataPeralatanRepository.findByParams(map);
        if (listDataPeralatan != null) {
            return (List<DataPeralatanDTO>) dataPeralatanDTOAssembler.toDTO(listDataPeralatan);
        }
        return null;
    }

    @Override
    public DataPeralatanDTO getDummyData() {
        DataPeralatan p = new DataPeralatanBuilder()
                .setIdDataPeralatan((UUID.randomUUID().toString()))
                .setJenis("LAPTOP")
                .setJumlah("500")
                .setKapasitas("250")
                .setMerkTipe("ASUS")
                .setTahunPembuatan("2017")
                .setKondisiPeralatan(KondisiPeralatan.BARU)
                .setLokasi("JAKARTA")
                .setBuktiKepemilikan(BuktiKepemilikan.MILIK_1)
                .setDokumenBuktiKepemilikan("UploadDokumen")
                .setGambarPeralatanAset("UploadGambar")
                .setCreatedBy("ADMIN")
                .setCreatedDate(new Date())
                .setModifiedBy("ADMIN")
                .setModifiedDate(new Date())
                .createDataPeralatan();
        return dataPeralatanDTOAssembler.toDTO(p);
    }

}
