package com.agit.eProcure.core.application.impl;

import com.agit.eProcure.common.application.DataLoginService;
import com.agit.eProcure.common.dto.vendor.DataLoginDTO;
import com.agit.eProcure.core.domain.vendor.DataLogin;
import com.agit.eProcure.core.domain.vendor.DataLoginBuilder;
import com.agit.eProcure.core.domain.vendor.DataLoginRepository;
import com.agit.eProcure.core.interfaces.web.facade.dto.assembler.vendor.DataLoginDTOAssembler;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.lang.Validate;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataLoginServiceImpl implements DataLoginService {

    private DataLoginRepository dataLoginRepository;
    private DataLoginDTOAssembler dataLoginDTOAssembler;

    public void setDataLoginRepository(DataLoginRepository dataLoginRepository) {
        this.dataLoginRepository = dataLoginRepository;
    }

    public void setDataLoginDTOAssembler(DataLoginDTOAssembler dataLoginDTOAssembler) {
        this.dataLoginDTOAssembler = dataLoginDTOAssembler;
    }

    @Override
    public void SaveOrUpdate(DataLoginDTO dataLogin) {
        Validate.notNull(dataLoginRepository);
        DataLogin p = dataLoginRepository.findByID(dataLogin.getIdDataLogin());

        if (p == null) {
            p = dataLoginDTOAssembler.toDomain(dataLogin);
        } else {
            DataLogin newDataLogin = dataLoginDTOAssembler.toDomain(dataLogin);
            p.assignNewDataLogin(newDataLogin);

        }
        dataLoginRepository.SaveOrUpdate(p);
    }

    @Override
    public void deleteData(DataLoginDTO dataLogin) {
        DataLogin p = dataLoginDTOAssembler.toDomain(dataLogin);
        dataLoginRepository.deleteData(p);
    }

    @Override
    public DataLoginDTO findByID(String idDataLogin) {
        Validate.notNull(dataLoginRepository);
        DataLogin p = (DataLogin) dataLoginRepository.findByID(idDataLogin);
        if (p != null) {
            return dataLoginDTOAssembler.toDTO(p);
        }
        return null;
    }

    @Override
    public List<DataLoginDTO> findAll() {
        Validate.notNull(dataLoginRepository);
        return (List<DataLoginDTO>) dataLoginDTOAssembler.toDTO((List<DataLogin>) dataLoginRepository.findAll());
    }

    @Override
    public List<DataLoginDTO> findByParams(Map map) {
        Validate.notNull(dataLoginRepository);
        List<DataLogin> listDataLogin = dataLoginRepository.findByParams(map);
        if (listDataLogin != null) {
            return (List<DataLoginDTO>) dataLoginDTOAssembler.toDTO(listDataLogin);
        }
        return null;
    }

    @Override
    public DataLoginDTO getDummyData() {
        DataLogin p = new DataLoginBuilder()
                .setIdDataLogin((UUID.randomUUID().toString()))
                .setNamaPengguna("BAYU HENDRA SETIAWAN")
                .setIdUser("ID 001")
                .setPassword("Password123")
                .setRetypePassword("retypePassword")
                .setLogo("LOGO")
                .setHeaderImage("HEADER IMAGE")
                .setCreatedBy("ADMIN")
                .setCreatedDate(new Date())
                .setModifiedBy("ADMIN")
                .setModifiedDate(new Date())
                .createDataLogin();

        return dataLoginDTOAssembler.toDTO(p);
    }
}
