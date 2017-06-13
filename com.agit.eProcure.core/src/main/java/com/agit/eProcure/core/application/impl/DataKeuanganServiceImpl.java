package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataKeuanganService;
import com.agit.eProcure.common.dto.vendor.DataKeuanganDTO;
import com.agit.eProcure.core.domain.vendor.DataKeuangan;
import com.agit.eProcure.core.domain.vendor.DataKeuanganBuilder;
import com.agit.eProcure.core.domain.vendor.DataKeuanganRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataKeuanganDTOAssembler;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.Validate;

/**
 *
 * @author 3AD
 */
public class DataKeuanganServiceImpl implements DataKeuanganService {

    private DataKeuanganRepository dataKeuanganRepository;
    private DataKeuanganDTOAssembler dataKeuanganDTOAssembler;

    public void setDataKeuanganRepository(DataKeuanganRepository dataKeuanganRepository) {
        this.dataKeuanganRepository = dataKeuanganRepository;
    }

    public void setDataKeuanganDTOAssembler(DataKeuanganDTOAssembler dataKeuanganDTOAssembler) {
        this.dataKeuanganDTOAssembler = dataKeuanganDTOAssembler;
    }

    @Override
    public void saveOrUpdate(DataKeuanganDTO dataKeuangan) {
        Validate.notNull(dataKeuanganRepository);
        DataKeuangan p = dataKeuanganRepository.findByID(dataKeuangan.getAuditID());

        if (p == null) {
            p = dataKeuanganDTOAssembler.toDomain(dataKeuangan);
        } else {
            DataKeuangan newDataKeuangan = dataKeuanganDTOAssembler.toDomain(dataKeuangan);
            p.assignNewKeuangan(newDataKeuangan);

        }
        dataKeuanganRepository.SaveOrUpdate(p);
    }

    @Override
    public void delete(DataKeuanganDTO dataKeuangan) {
        DataKeuangan p = dataKeuanganDTOAssembler.toDomain(dataKeuangan);
        dataKeuanganRepository.deleteData(p);
    }

    @Override
    public DataKeuanganDTO findByID(String auditID) {
        Validate.notNull(dataKeuanganRepository);
        DataKeuangan p = (DataKeuangan) dataKeuanganRepository.findByID(auditID);
        if (p != null) {
            return dataKeuanganDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataKeuanganDTO> findAll() {
        Validate.notNull(dataKeuanganRepository);
        return (List<DataKeuanganDTO>) dataKeuanganDTOAssembler.toDTOs((List<DataKeuangan>) dataKeuanganRepository.findAll());
    }

    @Override
    public List<DataKeuanganDTO> findByParams(Map map) {
        Validate.notNull(dataKeuanganRepository);
        List<DataKeuangan> listDataKeuangan = dataKeuanganRepository.findByParam(map);
        if (listDataKeuangan != null) {
            return (List<DataKeuanganDTO>) dataKeuanganDTOAssembler.toDTOs(listDataKeuangan);
        }
        return null;
    }

    @Override
    public DataKeuanganDTO getDummy() {
        DataKeuangan p = new DataKeuanganBuilder()
                .setAktivaLainnya(Double.valueOf(12))
                .setAuditID("123")
                .setBank(Double.valueOf(13))
                .setCreatedBy("aws")
                .setCreatedDate(new Date())
                .setGedung(Double.valueOf(12))
                .setHutangDagang(Double.valueOf(16))
                .setHutangJangkaPanjang(Double.valueOf(17))
                .setHutangLainnya(Double.valueOf(12))
                .setHutangPajak(Double.valueOf(12))
                .setInventaris(Double.valueOf(12))
                .setKas(Double.valueOf(13))
                .setKekayaanBerih(Double.valueOf(56))
                .setModifiedBy("qw")
                .setModifiedDate(new Date())
                .setNamaAudit("AK")
                .setPekerjaanDP(Double.valueOf(89))
                .setPeralatan(Double.valueOf(16))
                .setPersediaanBarang(Double.valueOf(67))
                .setTahunKeuangan("2017")
                .setTglAudit(new Date())
                .setTotal(Double.valueOf(1111))
                .setTotalAktivaLainnya(Double.valueOf(1221))
                .setTotalAktivaLancar(Double.valueOf(121))
                .setTotalAktivaTetap(Double.valueOf(12132))
                .setTotalHutangJangkaPendek(Double.valueOf(231))
                .setTotalPiutang(Double.valueOf(1231))
                .createDataKeuangan();

        return dataKeuanganDTOAssembler.toDTO(p);
    }

}
