/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.common.dto.vendor;

import java.util.Date;


public class DataLoginDTOBuilder {

    private String idDataLogin;
    private String namaPengguna;
    private String idUser;
    private String password;
    private String retypePassword;
    private String logo;
    private String headerImage;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataLoginDTOBuilder() {
    }

    public DataLoginDTOBuilder setIdDataLogin(String idDataLogin) {
        this.idDataLogin = idDataLogin;
        return this;
    }

    public DataLoginDTOBuilder setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
        return this;
    }

    public DataLoginDTOBuilder setIdUser(String idUser) {
        this.idUser = idUser;
        return this;
    }

    public DataLoginDTOBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public DataLoginDTOBuilder setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
        return this;
    }

    public DataLoginDTOBuilder setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public DataLoginDTOBuilder setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
        return this;
    }

    public DataLoginDTOBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataLoginDTOBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataLoginDTOBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataLoginDTOBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataLoginDTO createDataLoginDTO() {
        return new DataLoginDTO(idDataLogin, namaPengguna, idUser, password, retypePassword, logo, headerImage, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
