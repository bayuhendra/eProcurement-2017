package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataPengalamanDTO;
import com.agit.eProcure.common.dto.vendor.DataPengalamanDTOBuilder;
import com.agit.eProcure.core.domain.vendor.DataPengalaman;
import com.agit.eProcure.core.domain.vendor.DataPengalamanBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3AD
 */
public class DataPengalamanDTOAssembler implements IObjectAssembler<DataPengalaman, DataPengalamanDTO> {

    @Override
    public DataPengalamanDTO toDTO(DataPengalaman domainObject) {
        return new DataPengalamanDTOBuilder()
                .setBidangUsaha(domainObject.getBidangUsaha())
                .setBuktiKerjasama(domainObject.getBuktiKerjasama())
                .setCreateBy(domainObject.getCreateBy())
                .setCreateDate(domainObject.getCreateDate())
                .setIdDataPengalaman(domainObject.getIdDataPengalaman())
                .setLokasiPekerjaan(domainObject.getLokasiPekerjaan())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .setMulaiKerja(domainObject.getMulaiKerja())
                .setNamaPekerjaan(domainObject.getNamaPekerjaan())
                .setNilaiKontrak(domainObject.getNilaiKontrak())
                .createDataPengalamanDTO();
    }

    @Override
    public DataPengalaman toDomain(DataPengalamanDTO dtoObject) {
        return new DataPengalamanBuilder()
                .setBidangUsaha(dtoObject.getBidangUsaha())
                .setBuktiKerjasama(dtoObject.getBuktiKerjasama())
                .setCreateBy(dtoObject.getCreateBy())
                .setCreateDate(dtoObject.getCreateDate())
                .setIdDataPengalaman(dtoObject.getIdDataPengalaman())
                .setLokasiPekerjaan(dtoObject.getLokasiPekerjaan())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .setMulaiKerja(dtoObject.getMulaiKerja())
                .setNamaPekerjaan(dtoObject.getNamaPekerjaan())
                .setNilaiKontrak(dtoObject.getNilaiKontrak())
                .createDataPengalaman();
    }

    public List<DataPengalaman> toDomains(List<DataPengalamanDTO> arg0) {
        List<DataPengalaman> res = new ArrayList<>();
        for (DataPengalamanDTO t : arg0) {
            res.add(new DataPengalamanDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataPengalamanDTO> toDTOs(List<DataPengalaman> arg0) {
        List<DataPengalamanDTO> res = new ArrayList<>();
        for (DataPengalaman t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
