package com.agit.eProcure.core.domain.vendor;

import com.agit.eProcure.shared.object.EntityObject;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Bayu Hendra Setiawan
 */
public class DataLogin implements EntityObject<DataLogin> {

    long id;
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

    public DataLogin() {
    }

    public DataLogin(long id, String idDataLogin, String namaPengguna, String idUser, String password, String logo, String headerImage, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.id = id;
        this.idDataLogin = idDataLogin;
        this.namaPengguna = namaPengguna;
        this.idUser = idUser;
        this.password = password;
        this.logo = logo;
        this.headerImage = headerImage;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.idDataLogin);
        hash = 71 * hash + Objects.hashCode(this.namaPengguna);
        hash = 71 * hash + Objects.hashCode(this.idUser);
        hash = 71 * hash + Objects.hashCode(this.password);
        hash = 71 * hash + Objects.hashCode(this.logo);
        hash = 71 * hash + Objects.hashCode(this.headerImage);
        hash = 71 * hash + Objects.hashCode(this.createdBy);
        hash = 71 * hash + Objects.hashCode(this.createdDate);
        hash = 71 * hash + Objects.hashCode(this.modifiedBy);
        hash = 71 * hash + Objects.hashCode(this.modifiedDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataLogin other = (DataLogin) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void assignNewDataLogin(DataLogin dataLogin) {
        this.idDataLogin = dataLogin.idDataLogin;
        this.namaPengguna = dataLogin.namaPengguna;
        this.idUser = dataLogin.idUser;
        this.password = dataLogin.password;
        this.logo = dataLogin.logo;
        this.headerImage = dataLogin.headerImage;
        this.createdBy = dataLogin.createdBy;
        this.createdDate = dataLogin.createdDate;
        this.modifiedBy = dataLogin.modifiedBy;
        this.modifiedDate = dataLogin.modifiedDate;
    }

    @Override
    public boolean sameIdentityAs(DataLogin other) {
        return this.equals(other);
    }

}
