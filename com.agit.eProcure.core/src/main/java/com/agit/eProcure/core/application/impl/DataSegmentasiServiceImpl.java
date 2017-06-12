package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataSegmentasiService;
import com.agit.eProcure.common.dto.vendor.DataSegmentasiDTO;
import com.agit.eProcure.core.domain.vendor.DataSegmentasi;
import com.agit.eProcure.core.domain.vendor.DataSegmentasiBuilder;
import com.agit.eProcure.core.domain.vendor.DataSegmentasiRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataSegmentasiDTOAssembler;
import com.agit.eProcure.shared.type.AssosiasiType;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang.Validate;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataSegmentasiServiceImpl implements DataSegmentasiService {

    private DataSegmentasiRepository dataSegmentasiRepository;
    private DataSegmentasiDTOAssembler dataSegmentasiDTOAssembler;

    public void setDataSegmentasiRepository(DataSegmentasiRepository dataSegmentasiRepository) {
        this.dataSegmentasiRepository = dataSegmentasiRepository;
    }

    public void setDataSegmentasiDTOAssembler(DataSegmentasiDTOAssembler dataSegmentasiDTOAssembler) {
        this.dataSegmentasiDTOAssembler = dataSegmentasiDTOAssembler;
    }

    @Override
    public void SaveOrUpdate(DataSegmentasiDTO dataSegmentasi) {
        Validate.notNull(dataSegmentasiRepository);
        DataSegmentasi p = dataSegmentasiRepository.findByID(dataSegmentasi.getIdDataSegmentasi());

        if (p == null) {
            p = dataSegmentasiDTOAssembler.toDomain(dataSegmentasi);
        } else {
            DataSegmentasi newDataSegmentasi = dataSegmentasiDTOAssembler.toDomain(dataSegmentasi);
            p.assignNewDataSegmentasi(newDataSegmentasi);

        }
        dataSegmentasiRepository.SaveOrUpdate(p);
    }

    @Override
    public void deleteData(DataSegmentasiDTO dataSegmentasi) {
        DataSegmentasi p = dataSegmentasiDTOAssembler.toDomain(dataSegmentasi);
        dataSegmentasiRepository.deleteData(p);
    }

    @Override
    public DataSegmentasiDTO findByID(String idDataSegmentasi) {
        Validate.notNull(dataSegmentasiRepository);
        DataSegmentasi p = (DataSegmentasi) dataSegmentasiRepository.findByID(idDataSegmentasi);
        if (p != null) {
            return dataSegmentasiDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataSegmentasiDTO> findAll() {
        Validate.notNull(dataSegmentasiRepository);
        return (List<DataSegmentasiDTO>) dataSegmentasiDTOAssembler.toDTO((List<DataSegmentasi>) dataSegmentasiRepository.findAll());
    }

    @Override
    public List<DataSegmentasiDTO> findByParams(Map map) {
        Validate.notNull(dataSegmentasiRepository);
        List<DataSegmentasi> listDataSegmentasi = dataSegmentasiRepository.findByParams(map);
        if (listDataSegmentasi != null) {
            return (List<DataSegmentasiDTO>) dataSegmentasiDTOAssembler.toDTO(listDataSegmentasi);
        }
        return null;
    }

    @Override
    public DataSegmentasiDTO getDummyData() {
        DataSegmentasi p = new DataSegmentasiBuilder()
                .setIdDataSegmentasi((UUID.randomUUID().toString()))
                .setBidangUsahaType(BidangUsahaType.KONSULTAN)
                .setAssosiasiType(AssosiasiType.ASSOSIASI_1)
                .setNomorAssosiasi("nomorAssosiasi")
                .setTanggalMulai(new Date())
                .setTanggalBerakhir(new Date())
                .setCreatedBy("ADMIN")
                .setCreatedDate(new Date())
                .setModifiedBy("ADMIN")
                .setModifiedDate(new Date())
                .createDataSegmentasi();

        return dataSegmentasiDTOAssembler.toDTO(p);
    }
}
