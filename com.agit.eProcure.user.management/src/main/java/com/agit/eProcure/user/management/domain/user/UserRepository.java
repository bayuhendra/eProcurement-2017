package com.agit.eProcure.user.management.domain.user;

import com.agit.eProcure.shared.type.StatusData;
import java.util.List;

/**
 *
 * @author bayutridewanto
 */
public interface UserRepository {

    void saveOrUpdate(User user);

    User findByID(String userName);

    User findByRemote(String remote);

    List<User> findAllUser();

    List<User> findByParameter(String fullName, String userName, String roleID, StatusData userStatus);
    
    List<User> findByRoleID(String roleID);

    int releaseAll();

    int count(String roleID);
}
