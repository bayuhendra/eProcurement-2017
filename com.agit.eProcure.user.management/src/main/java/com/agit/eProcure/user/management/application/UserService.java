package com.agit.eProcure.user.management.application;

import com.agit.eProcure.common.dto.usermanagement.UserDTO;
import com.agit.eProcure.common.dto.usermanagement.UserLoginInfoDTO;
import com.agit.eProcure.shared.status.StatusCode;
import com.agit.eProcure.shared.type.StatusData;
import java.util.List;

/**
 *
 * @author bayutridewanto
 */
public interface UserService {

    void saveOrUpdate(UserDTO user);

    UserDTO findByID(String userName);

    UserDTO findByRemote(String remote);

    List<UserDTO> findAllUser();

    List<UserDTO> findByParameter(String fullName, String userName, String roleID, StatusData userStatus);

    StatusCode release(String releaseType, String release);

    StatusCode releaseAll();

    int count(String roleID);

    StatusCode updatePassword(String userName, String newPassword);

    StatusCode updateLockUnlock(String userName, Integer loginAttempt);

    StatusCode updateLoginInfo(String userName, UserLoginInfoDTO loginInfo);

    StatusCode delete(String userName);

    Boolean isNotExistUserName(String userName);

    Boolean isNotExistIPAddress(String ipAddress);
}
