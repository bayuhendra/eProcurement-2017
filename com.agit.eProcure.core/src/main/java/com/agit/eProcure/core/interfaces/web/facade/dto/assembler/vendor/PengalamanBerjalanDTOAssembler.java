package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.PengalamanBerjalanDTO;
import com.agit.eProcure.common.dto.vendor.PengalamanBerjalanDTOBuilder;
import com.agit.eProcure.core.domain.vendor.PengalamanBerjalan;
import com.agit.eProcure.core.domain.vendor.PengalamanBerjalanBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3AD
 */
public class PengalamanBerjalanDTOAssembler implements IObjectAssembler<PengalamanBerjalan, PengalamanBerjalanDTO> {

    @Override
    public PengalamanBerjalanDTO toDTO(PengalamanBerjalan domainObject) {
        return new PengalamanBerjalanDTOBuilder()
                .setBidangUsaha(domainObject.getBidangUsaha())
                .setBuktiKerja(domainObject.getBuktiKerja())
                .setCreateBy(domainObject.getCreateBy())
                .setCreateDate(domainObject.getCreateDate())
                .setIdPengalamanBerjalan(domainObject.getIdPengalamanBerjalan())
                .setLokasiPekerjaan(domainObject.getLokasiPekerjaan())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .setMulaiKerja(domainObject.getMulaiKerja())
                .setNamaPekerjaan(domainObject.getNamaPekerjaan())
                .setNilaiKontrak(domainObject.getNilaiKontrak())
                .createPengalamanBerjalanDTO();
    }

    @Override
    public PengalamanBerjalan toDomain(PengalamanBerjalanDTO dtoObject) {
        return new PengalamanBerjalanBuilder()
                .setBidangUsaha(dtoObject.getBidangUsaha())
                .setBuktiKerja(dtoObject.getBuktiKerja())
                .setCreateBy(dtoObject.getCreateBy())
                .setCreateDate(dtoObject.getCreateDate())
                .setIdPengalamanBerjalan(dtoObject.getIdPengalamanBerjalan())
                .setLokasiPekerjaan(dtoObject.getLokasiPekerjaan())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .setMulaiKerja(dtoObject.getMulaiKerja())
                .setNamaPekerjaan(dtoObject.getNamaPekerjaan())
                .setNilaiKontrak(dtoObject.getNilaiKontrak())
                .createPengalamanBerjalan();
    }

    public List<PengalamanBerjalan> toDomains(List<PengalamanBerjalanDTO> arg0) {
        List<PengalamanBerjalan> res = new ArrayList<>();
        for (PengalamanBerjalanDTO t : arg0) {
            res.add(new PengalamanBerjalanDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<PengalamanBerjalanDTO> toDTOs(List<PengalamanBerjalan> arg0) {
        List<PengalamanBerjalanDTO> res = new ArrayList<>();
        for (PengalamanBerjalan t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
