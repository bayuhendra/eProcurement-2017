package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataPerusahaanService;
import com.agit.eProcure.common.dto.vendor.DataPerusahaanDTO;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawab;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawabBuilder;
import com.agit.eProcure.core.domain.vendor.DataPenanggungJawabRepository;
import com.agit.eProcure.core.domain.vendor.DataPerusahaan;
import com.agit.eProcure.core.domain.vendor.DataPerusahaanBuilder;
import com.agit.eProcure.core.domain.vendor.DataPerusahaanRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataPenanggungJawabDTOAssembler;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataPerusahaanDTOAssembler;
import com.agit.eProcure.shared.type.JabatanType;
import com.agit.eProcure.shared.type.KualifikasiType;
import com.agit.eProcure.shared.type.PKPType;
import com.agit.eProcure.shared.type.PerusahaanType;
import com.agit.eProcure.shared.type.UnitType;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.apache.commons.lang.Validate;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataPerusahaanServiceImpl implements DataPerusahaanService {

    private DataPenanggungJawabRepository dataPenanggungJawabRepository;
    private DataPenanggungJawabDTOAssembler dataPenanggungJawabDTOAssembler;
    private DataPerusahaanRepository dataPerusahaanRepository;
    private DataPerusahaanDTOAssembler dataPerusahaanDTOAssembler;

    public void setDataPerusahaanRepository(DataPerusahaanRepository dataPerusahaanRepository) {
        this.dataPerusahaanRepository = dataPerusahaanRepository;
    }

    public void setDataPerusahaanDTOAssembler(DataPerusahaanDTOAssembler dataPerusahaanDTOAssembler) {
        this.dataPerusahaanDTOAssembler = dataPerusahaanDTOAssembler;
    }

    public void setDataPenanggungJawabRepository(DataPenanggungJawabRepository dataPenanggungJawabRepository) {
        this.dataPenanggungJawabRepository = dataPenanggungJawabRepository;
    }

    public void setDataPenanggungJawabDTOAssembler(DataPenanggungJawabDTOAssembler dataPenanggungJawabDTOAssembler) {
        this.dataPenanggungJawabDTOAssembler = dataPenanggungJawabDTOAssembler;
    }

    @Override
    public void SaveOrUpdate(DataPerusahaanDTO dataPerusahaan) {
        Validate.notNull(dataPerusahaanRepository);
        DataPerusahaan p = dataPerusahaanRepository.findByID(dataPerusahaan.getIdPerusahaan());

        if (p == null) {
            p = dataPerusahaanDTOAssembler.toDomain(dataPerusahaan);
        } else {
            DataPerusahaan newDataPerusahaan = dataPerusahaanDTOAssembler.toDomain(dataPerusahaan);
            p.assignNewDataPerusahaan(newDataPerusahaan);

        }
        dataPerusahaanRepository.SaveOrUpdate(p);
    }

    @Override
    public void deleteData(DataPerusahaanDTO dataPerusahaan) {
        DataPerusahaan p = dataPerusahaanDTOAssembler.toDomain(dataPerusahaan);
        dataPerusahaanRepository.deleteData(p);
    }

    @Override
    public DataPerusahaanDTO findByID(String idDataPerusahaan) {
        Validate.notNull(dataPerusahaanRepository);
        DataPerusahaan p = (DataPerusahaan) dataPerusahaanRepository.findByID(idDataPerusahaan);
        if (p != null) {
            return dataPerusahaanDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataPerusahaanDTO> findAll() {
        Validate.notNull(dataPerusahaanRepository);
        List<DataPerusahaan> listDataPerusahaan= dataPerusahaanRepository.findAll();
        if (listDataPerusahaan != null) {
            return dataPerusahaanDTOAssembler.irDomain2irDTO(listDataPerusahaan);
        }
        return null;
    }

    @Override
    public List<DataPerusahaanDTO> findByParams(Map map) {
        Validate.notNull(dataPerusahaanRepository);
        List<DataPerusahaan> listDataPerusahaan = dataPerusahaanRepository.findByParams(map);
        if (listDataPerusahaan != null) {
            return (List<DataPerusahaanDTO>) dataPerusahaanDTOAssembler.toDTO(listDataPerusahaan);
        }
        return null;
    }

    @Override
    public DataPerusahaanDTO getDummyData() {
        DataPenanggungJawab x = new DataPenanggungJawabBuilder()
                .setIdPerusahaan("11")
                .setIdPenanggungJawab("111")
                .setNamaPenanggungJawab("NamaPenanggungJawab")
                .setJabatanType(JabatanType.MANAGER)
                .setEmailPenanggungJawab("EmailPenanggungJawab")
                .setCreatedBy("ADMIN")
                .setCreatedDate(new Date())
                .setModifiedBy("ADMIN")
                .setModifiedDate(new Date())
                .createDataPenanggungJawab();

        Set<DataPenanggungJawab> dataPenanggungJawabs = new HashSet<>();
        dataPenanggungJawabs.add(x);

        DataPerusahaan p = new DataPerusahaanBuilder()
                .setIdPerusahaan("111")
                .setPKPType(PKPType.PKP)
                .setKualifikasiType(KualifikasiType.KECIL)
                .setUnitType(UnitType.PT_ASTRA_INTERNATIONAL_Tbk)
                .setNamaPerusahaan("namaPerusahaan")
                .setPerusahaanType(PerusahaanType.PT)
                .setNpwp("npwp")
                .setNamaSingkatan("namaSingkatan")
                .setJumlahKaryawan("jumlahKaryawan")
                .setTanggalBerdiri(new Date())
                .setDeskripsi("deskripsi")
                .setAlamatPerusahaan("alamatPerusahaan")
                .setPropinsi("JAKARTA")
                .setKota("kota")
                .setPoBox("poBox")
                .setKodePos("kodePos")
                .setTelpPerusahaan("telpPerusahaan")
                .setNoFax("noFax")
                .setEmailPerusahaan("emailPerusahaan")
                .setWebsite("website")
                .setNamaCp("namaCp")
                .setNoHP("noHP")
                .setEmailCp("emailCp")
                .setNoKtp("noKtp")
                .setDataPenanggungJawabs(dataPenanggungJawabs)
                .setCreatedBy("ADMIN")
                .setCreatedDate(new Date())
                .setModifiedBy("ADMIN")
                .setModifiedDate(new Date())
                .createDataPerusahaan();

        return dataPerusahaanDTOAssembler.toDTO(p);
    }
}
