package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataPengalamanService;
import com.agit.eProcure.common.dto.vendor.DataPengalamanDTO;
import com.agit.eProcure.core.domain.vendor.DataPengalaman;
import com.agit.eProcure.core.domain.vendor.DataPengalamanBuilder;
import com.agit.eProcure.core.domain.vendor.DataPengalamanRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataPengalamanDTOAssembler;
import com.agit.eProcure.shared.type.BidangUsahaType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang.Validate;

/**
 *
 * @author 3AD
 */
public class DataPengalamanServiceImpl implements DataPengalamanService {

    private DataPengalamanRepository dataPengalamanRepository;
    private DataPengalamanDTOAssembler dataPengalamanDTOAssembler;

    public void setDataPengalamanRepository(DataPengalamanRepository dataPengalamanRepository) {
        this.dataPengalamanRepository = dataPengalamanRepository;
    }

    public void setDataPengalamanDTOAssembler(DataPengalamanDTOAssembler dataPengalamanDTOAssembler) {
        this.dataPengalamanDTOAssembler = dataPengalamanDTOAssembler;
    }

    @Override
    public void SaveOrUpdate(DataPengalamanDTO dataPengalaman) {
        Validate.notNull(dataPengalamanRepository);
        DataPengalaman p = dataPengalamanRepository.findByID(dataPengalaman.getIdDataPengalaman());

        if (p == null) {
            p = dataPengalamanDTOAssembler.toDomain(dataPengalaman);
        } else {
            DataPengalaman newDataPengalaman = dataPengalamanDTOAssembler.toDomain(dataPengalaman);
            p.assignNewDatapengalaman(newDataPengalaman);

        }
        dataPengalamanRepository.SaveOrUpdate(p);
    }

    @Override
    public void deleteData(DataPengalamanDTO dataPengalaman) {
        DataPengalaman p = dataPengalamanDTOAssembler.toDomain(dataPengalaman);
        dataPengalamanRepository.deleteData(p);
    }

    @Override
    public DataPengalamanDTO getDummyData() {
        DataPengalaman p = new DataPengalamanBuilder()
                .setBidangUsaha(BidangUsahaType.KONSULTAN)
                .setBuktiKerjasama("OK")
                .setCreateBy("AAA")
                .setCreateDate(new Date())
                .setIdDataPengalaman(UUID.randomUUID().toString())
                .setLokasiPekerjaan("SMG")
                .setModifiedBy("AAA")
                .setModifiedDate(new Date())
                .setMulaiKerja(new Date())
                .setNamaPekerjaan("PO")
                .setNilaiKontrak(Double.valueOf(4))
                .createDataPengalaman();
        return dataPengalamanDTOAssembler.toDTO(p);
    }

    @Override
    public DataPengalamanDTO findByID(String idDataPengalaman) {
        Validate.notNull(dataPengalamanRepository);
        DataPengalaman p = (DataPengalaman) dataPengalamanRepository.findByID(idDataPengalaman);
        if (p != null) {
            return dataPengalamanDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataPengalamanDTO> findAll() {
        Validate.notNull(dataPengalamanRepository);
        return (List<DataPengalamanDTO>) dataPengalamanDTOAssembler.toDTOs((List<DataPengalaman>) dataPengalamanRepository.findAll());
    }

    @Override
    public List<DataPengalamanDTO> findByParams(Map map) {
        Validate.notNull(dataPengalamanRepository);
        List<DataPengalaman> listDataPengalaman = dataPengalamanRepository.findByParam(map);
        if (listDataPengalaman != null) {
            return (List<DataPengalamanDTO>) dataPengalamanDTOAssembler.toDTOs(listDataPengalaman);
        }
        return null;
    }
}
