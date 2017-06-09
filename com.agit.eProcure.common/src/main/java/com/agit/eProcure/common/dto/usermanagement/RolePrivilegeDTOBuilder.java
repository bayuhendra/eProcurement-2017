package com.agit.eProcure.common.dto.usermanagement;

import com.agit.eProcure.shared.type.AccessType;

public class RolePrivilegeDTOBuilder {

    private PrivilegeDTO privilegeDTO;
    private AccessType accessType;

    public RolePrivilegeDTOBuilder() {
    }

    public RolePrivilegeDTOBuilder setPrivilegeDTO(PrivilegeDTO privilegeDTO) {
        this.privilegeDTO = privilegeDTO;
        return this;
    }

    public RolePrivilegeDTOBuilder setAccessType(AccessType accessType) {
        this.accessType = accessType;
        return this;
    }

    public RolePrivilegeDTO createRolePrivilegeDTO() {
        return new RolePrivilegeDTO(privilegeDTO, accessType);
    }

}
