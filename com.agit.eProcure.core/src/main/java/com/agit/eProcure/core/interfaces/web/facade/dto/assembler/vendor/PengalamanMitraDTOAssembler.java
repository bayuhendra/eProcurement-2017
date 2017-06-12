package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.PengalamanMitraDTO;
import com.agit.eProcure.common.dto.vendor.PengalamanMitraDTOBuilder;
import com.agit.eProcure.core.domain.vendor.PengalamanMitra;
import com.agit.eProcure.core.domain.vendor.PengalamanMitraBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3AD
 */
public class PengalamanMitraDTOAssembler implements IObjectAssembler<PengalamanMitra, PengalamanMitraDTO> {

    @Override
    public PengalamanMitraDTO toDTO(PengalamanMitra domainObject) {
        return new PengalamanMitraDTOBuilder()
                .setBidangUsahaType(domainObject.getBidangUsahaType())
                .setBuktiKerjasama(domainObject.getBuktiKerjasama())
                .setCreateBy(domainObject.getCreateBy())
                .setCreateDate(domainObject.getCreateDate())
                .setLokasiKerja(domainObject.getLokasiKerja())
                .setMitraID(domainObject.getMitraID())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .setMulaiKerjasama(domainObject.getMulaiKerjasama())
                .setNamaMitra(domainObject.getNamaMitra())
                .setNilai(domainObject.getNilai())
                .createPengalamanMitraDTO();
    }

    @Override
    public PengalamanMitra toDomain(PengalamanMitraDTO dtoObject) {
        return new PengalamanMitraBuilder()
                .setBidangUsahaType(dtoObject.getBidangUsahaType())
                .setBuktiKerjasama(dtoObject.getBuktiKerjasama())
                .setCreateBy(dtoObject.getCreateBy())
                .setCreateDate(dtoObject.getCreateDate())
                .setLokasiKerja(dtoObject.getLokasiKerja())
                .setMitraID(dtoObject.getMitraID())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .setMulaiKerjasama(dtoObject.getMulaiKerjasama())
                .setNamaMitra(dtoObject.getNamaMitra())
                .setNilai(dtoObject.getNilai())
                .createPengalamanMitra();
    }

    public List<PengalamanMitra> toDomains(List<PengalamanMitraDTO> arg0) {
        List<PengalamanMitra> res = new ArrayList<>();
        for (PengalamanMitraDTO t : arg0) {
            res.add(new PengalamanMitraDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<PengalamanMitraDTO> toDTOs(List<PengalamanMitra> arg0) {
        List<PengalamanMitraDTO> res = new ArrayList<>();
        for (PengalamanMitra t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
