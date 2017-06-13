package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.PengalamanBerjalanService;
import com.agit.eProcure.common.dto.vendor.PengalamanBerjalanDTO;
import com.agit.eProcure.core.domain.vendor.PengalamanBerjalan;
import com.agit.eProcure.core.domain.vendor.PengalamanBerjalanBuilder;
import com.agit.eProcure.core.domain.vendor.PengalamanBerjalanRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.PengalamanBerjalanDTOAssembler;
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
public class PengalamanBerjalanServiceImpl implements PengalamanBerjalanService {

    private PengalamanBerjalanRepository pengalamanBerjalanRepository;
    private PengalamanBerjalanDTOAssembler pengalamanBerjalanDTOAssembler;

    public void setPengalamanBerjalanRepository(PengalamanBerjalanRepository pengalamanBerjalanRepository) {
        this.pengalamanBerjalanRepository = pengalamanBerjalanRepository;
    }

    public void setPengalamanBerjalanDTOAssembler(PengalamanBerjalanDTOAssembler pengalamanBerjalanDTOAssembler) {
        this.pengalamanBerjalanDTOAssembler = pengalamanBerjalanDTOAssembler;
    }

    @Override
    public void saveOrUpdate(PengalamanBerjalanDTO pengalamanBerjalan) {
        Validate.notNull(pengalamanBerjalanRepository);
        PengalamanBerjalan p = pengalamanBerjalanRepository.findByID(pengalamanBerjalan.getIdPengalamanBerjalan());

        if (p == null) {
            p = pengalamanBerjalanDTOAssembler.toDomain(pengalamanBerjalan);
        } else {
            PengalamanBerjalan newDataPengalaman = pengalamanBerjalanDTOAssembler.toDomain(pengalamanBerjalan);
            p.assignNewBerjalan(newDataPengalaman);

        }
        pengalamanBerjalanRepository.saveOrUpdate(p);
    }

    @Override
    public void delete(PengalamanBerjalanDTO pengalamanBerjalan) {
        PengalamanBerjalan p = pengalamanBerjalanDTOAssembler.toDomain(pengalamanBerjalan);
        pengalamanBerjalanRepository.delete(p);
    }

    @Override
    public PengalamanBerjalanDTO findByID(String idPengalamanBerjalan) {
        Validate.notNull(pengalamanBerjalanRepository);
        PengalamanBerjalan p = (PengalamanBerjalan) pengalamanBerjalanRepository.findByID(idPengalamanBerjalan);
        if (p != null) {
            return pengalamanBerjalanDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<PengalamanBerjalanDTO> findAll() {
        Validate.notNull(pengalamanBerjalanRepository);
        return (List<PengalamanBerjalanDTO>) pengalamanBerjalanDTOAssembler.toDTOs((List<PengalamanBerjalan>) pengalamanBerjalanRepository.findAll());
    }

    @Override
    public List<PengalamanBerjalanDTO> findByParams(Map map) {
        Validate.notNull(pengalamanBerjalanRepository);
        List<PengalamanBerjalan> listPengalamanBerjalan = pengalamanBerjalanRepository.findByParam(map);
        if (listPengalamanBerjalan != null) {
            return (List<PengalamanBerjalanDTO>) pengalamanBerjalanDTOAssembler.toDTOs(listPengalamanBerjalan);
        }
        return null;
    }

    @Override
    public PengalamanBerjalanDTO getDummy() {
        PengalamanBerjalan p = new PengalamanBerjalanBuilder()
                .setBidangUsaha(BidangUsahaType.KONSULTAN)
                .setBuktiKerja("OK")
                .setCreateBy("AAA")
                .setCreateDate(new Date())
                .setIdPengalamanBerjalan(UUID.randomUUID().toString())
                .setLokasiPekerjaan("SMG")
                .setModifiedBy("AAA")
                .setModifiedDate(new Date())
                .setMulaiKerja(new Date())
                .setNamaPekerjaan("PO")
                .setNilaiKontrak(Double.valueOf(4))
                .createPengalamanBerjalan();
        return pengalamanBerjalanDTOAssembler.toDTO(p);
    }

}
