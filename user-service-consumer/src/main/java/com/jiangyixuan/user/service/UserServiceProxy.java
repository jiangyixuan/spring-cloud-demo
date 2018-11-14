package com.jiangyixuan.user.service;

import com.jiangyixuan.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author jiangyixuan
 * @date 2018-11-14
 */
@Service
public class UserServiceProxy implements UserService {

    private static final String PROOVIDER_SERVER_URL_PREFIX = "http://user-service-provider/";
    /**
     * 通过rest api代理到服务提供者
     */
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean save(User user) {
        return restTemplate.postForObject(PROOVIDER_SERVER_URL_PREFIX + "/user", user, boolean.class);
    }

    @Override
    public List<User> findAll() {
        return restTemplate.getForObject(PROOVIDER_SERVER_URL_PREFIX + "/user", List.class);
    }
}
