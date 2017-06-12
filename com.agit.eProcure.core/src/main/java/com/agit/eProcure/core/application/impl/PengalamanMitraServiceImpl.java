package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.PengalamanMitraService;
import com.agit.eProcure.common.dto.vendor.PengalamanMitraDTO;
import com.agit.eProcure.core.domain.vendor.PengalamanMitra;
import com.agit.eProcure.core.domain.vendor.PengalamanMitraBuilder;
import com.agit.eProcure.core.domain.vendor.PengalamanMitraRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.PengalamanMitraDTOAssembler;
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
public class PengalamanMitraServiceImpl implements PengalamanMitraService {

    private PengalamanMitraRepository pengalamanMitraRepository;
    private PengalamanMitraDTOAssembler pengalamanMitraDTOAssembler;

    public void setPengalamanMitraRepository(PengalamanMitraRepository pengalamanMitraRepository) {
        this.pengalamanMitraRepository = pengalamanMitraRepository;
    }

    public void setPengalamanMitraDTOAssembler(PengalamanMitraDTOAssembler pengalamanMitraDTOAssembler) {
        this.pengalamanMitraDTOAssembler = pengalamanMitraDTOAssembler;
    }

    @Override
    public void saveOrUpdate(PengalamanMitraDTO pengalamanMitra) {
        Validate.notNull(pengalamanMitraRepository);
        PengalamanMitra p = pengalamanMitraRepository.findByID(pengalamanMitra.getMitraID());

        if (p == null) {
            p = pengalamanMitraDTOAssembler.toDomain(pengalamanMitra);
        } else {
            PengalamanMitra newDataPengalaman = pengalamanMitraDTOAssembler.toDomain(pengalamanMitra);
            p.assignNewPengalamanMitra(newDataPengalaman);

        }
        pengalamanMitraRepository.saveOrUpdate(p);
    }

    @Override
    public void delete(PengalamanMitraDTO pengalamanMitra) {
        PengalamanMitra p = pengalamanMitraDTOAssembler.toDomain(pengalamanMitra);
        pengalamanMitraRepository.delete(p);
    }

    @Override
    public PengalamanMitraDTO findByID(String mitraID) {
        Validate.notNull(pengalamanMitraRepository);
        PengalamanMitra p = (PengalamanMitra) pengalamanMitraRepository.findByID(mitraID);
        if (p != null) {
            return pengalamanMitraDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<PengalamanMitraDTO> findAll() {
        Validate.notNull(pengalamanMitraRepository);
        return (List<PengalamanMitraDTO>) pengalamanMitraDTOAssembler.toDTOs((List<PengalamanMitra>) pengalamanMitraRepository.findAll());
    }

    @Override
    public List<PengalamanMitraDTO> findByParams(Map map) {
        Validate.notNull(pengalamanMitraRepository);
        List<PengalamanMitra> listPengalamanMitra = pengalamanMitraRepository.findByParam(map);
        if (listPengalamanMitra != null) {
            return (List<PengalamanMitraDTO>) pengalamanMitraDTOAssembler.toDTOs(listPengalamanMitra);
        }
        return null;
    }

    @Override
    public PengalamanMitraDTO getDummy() {
        PengalamanMitra p = new PengalamanMitraBuilder()
                .setBidangUsahaType(BidangUsahaType.KONSULTAN)
                .setBuktiKerjasama("OK")
                .setCreateBy("AAA")
                .setCreateDate(new Date())
                .setMitraID(UUID.randomUUID().toString())
                .setLokasiKerja("SMG")
                .setModifiedBy("AAA")
                .setModifiedDate(new Date())
                .setMulaiKerjasama(new Date())
                .setNamaMitra("PO")
                .setNilai(Double.valueOf(4))
                .createPengalamanMitra();
        return pengalamanMitraDTOAssembler.toDTO(p);
    }

}
