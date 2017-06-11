package com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor;

import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import com.agit.eProcure.common.dto.vendor.DataLoginDTOBuilder;
import com.agit.eProcure.shared.object.IObjectAssembler;
import java.util.ArrayList;
import java.util.List;
import com.agit.eProcure.core.domain.vendor.DataLogin;
import com.agit.eProcure.core.domain.vendor.DataLoginBuilder;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataLoginDTOAssembler implements IObjectAssembler<DataLogin, DataLoginDTO> {

    @Override
    public DataLoginDTO toDTO(DataLogin domainObject) {
        return new DataLoginDTOBuilder()
                .setIdDataLogin(domainObject.getIdDataLogin())
                .setNamaPengguna(domainObject.getNamaPengguna())
                .setIdUser(domainObject.getIdUser())
                .setPassword(domainObject.getPassword())
                .setLogo(domainObject.getLogo())
                .setHeaderImage(domainObject.getHeaderImage())
                .setCreatedBy(domainObject.getCreatedBy())
                .setCreatedDate(domainObject.getCreatedDate())
                .setModifiedBy(domainObject.getModifiedBy())
                .setModifiedDate(domainObject.getModifiedDate())
                .createDataLoginDTO();
    }

    @Override
    public DataLogin toDomain(DataLoginDTO dtoObject) {
        return new DataLoginBuilder()
                .setIdDataLogin(dtoObject.getIdDataLogin())
                .setNamaPengguna(dtoObject.getNamaPengguna())
                .setIdUser(dtoObject.getIdUser())
                .setPassword(dtoObject.getPassword())
                .setLogo(dtoObject.getLogo())
                .setHeaderImage(dtoObject.getHeaderImage())
                .setCreatedBy(dtoObject.getCreatedBy())
                .setCreatedDate(dtoObject.getCreatedDate())
                .setModifiedBy(dtoObject.getModifiedBy())
                .setModifiedDate(dtoObject.getModifiedDate())
                .createDataLogin();
    }

    public List<DataLogin> toDomain(List<DataLoginDTO> arg0) {
        List<DataLogin> res = new ArrayList<>();
        for (DataLoginDTO t : arg0) {
            res.add(new DataLoginDTOAssembler().toDomain(t));
        }
        return res;
    }

    public List<DataLoginDTO> toDTO(List<DataLogin> arg0) {
        List<DataLoginDTO> res = new ArrayList<>();
        for (DataLogin t : arg0) {
            res.add(this.toDTO(t));
        }
        return res;
    }

}
