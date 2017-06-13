package com.agit.eProcure.common.dto.vendor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataLoginDTO implements Serializable {

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

    public DataLoginDTO() {
    }

    public DataLoginDTO(String idDataLogin, String namaPengguna, String idUser, String password, String retypePassword, String logo, String headerImage, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.idDataLogin = idDataLogin;
        this.namaPengguna = namaPengguna;
        this.idUser = idUser;
        this.password = password;
        this.retypePassword = retypePassword;
        this.logo = logo;
        this.headerImage = headerImage;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public String getIdDataLogin() {
        return idDataLogin;
    }

    public void setIdDataLogin(String idDataLogin) {
        this.idDataLogin = idDataLogin;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "DataLoginDTO{" + "idDataLogin=" + idDataLogin + ", namaPengguna=" + namaPengguna + ", idUser=" + idUser + ", password=" + password + ", retypePassword=" + retypePassword + ", logo=" + logo + ", headerImage=" + headerImage + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + '}';
    }

}
