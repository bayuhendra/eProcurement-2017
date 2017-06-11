/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agit.eProcure.core.domain.vendor;

import java.util.Date;


public class DataLoginBuilder {

    private long id;
    private String idDataLogin;
    private String namaPengguna;
    private String idUser;
    private String password;
    private String logo;
    private String headerImage;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;

    public DataLoginBuilder() {
    }

    public DataLoginBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public DataLoginBuilder setIdDataLogin(String idDataLogin) {
        this.idDataLogin = idDataLogin;
        return this;
    }

    public DataLoginBuilder setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
        return this;
    }

    public DataLoginBuilder setIdUser(String idUser) {
        this.idUser = idUser;
        return this;
    }

    public DataLoginBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public DataLoginBuilder setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public DataLoginBuilder setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
        return this;
    }

    public DataLoginBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DataLoginBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public DataLoginBuilder setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public DataLoginBuilder setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public DataLogin createDataLogin() {
        return new DataLogin(id, idDataLogin, namaPengguna, idUser, password, logo, headerImage, createdBy, createdDate, modifiedBy, modifiedDate);
    }
    
}
