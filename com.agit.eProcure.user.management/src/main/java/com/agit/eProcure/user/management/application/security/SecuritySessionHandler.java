package com.agit.eProcure.user.management.application.security;

import com.agit.eProcure.common.dto.usermanagement.UserDTO;
import com.agit.eProcure.common.dto.usermanagement.UserLoginInfoDTO;
import com.agit.eProcure.user.management.application.UserService;
import java.util.Date;
import javax.servlet.ServletContext;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;

import org.springframework.security.web.session.HttpSessionCreatedEvent;
import org.springframework.security.web.session.HttpSessionDestroyedEvent;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SecuritySessionHandler implements HttpSessionListener {
    
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private final String LOGGER_NAME = HttpSessionListener.class.getName();

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        Integer timeout = 30;
        se.getSession().setMaxInactiveInterval(timeout * 60);
        HttpSessionCreatedEvent e = new HttpSessionCreatedEvent(se.getSession());
        Log log = LogFactory.getLog(LOGGER_NAME);

        if (log.isDebugEnabled()) {
            log.debug("Publishing event: " + e);
        }

        getContext(se.getSession().getServletContext()).publishEvent(e);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        Date now = new Date();
        UserDTO userInfo = (UserDTO) se.getSession().getAttribute("userInfo");
        if (userInfo != null) {
            UserLoginInfoDTO loginInfoDTO = userInfo.getUserSpecificationDTO().getUserLoginInfoDTO();
            loginInfoDTO.setLastLogin(now);
            loginInfoDTO.setLogoutDate(now);
            loginInfoDTO.setRemoteHost(null);
            loginInfoDTO.setRemoteAddress(null);
            loginInfoDTO.setSessionID(null);
            userService.updateLoginInfo(userInfo.getUserName(), loginInfoDTO);
        }
        HttpSessionDestroyedEvent e = new HttpSessionDestroyedEvent(se.getSession());
        Log log = LogFactory.getLog(LOGGER_NAME);

        if (log.isDebugEnabled()) {
            log.debug("Publishing event: " + e);
        }

        getContext(se.getSession().getServletContext()).publishEvent(e);
    }

    ApplicationContext getContext(ServletContext servletContext) {
        return WebApplicationContextUtils.getWebApplicationContext(servletContext);
    }
}
