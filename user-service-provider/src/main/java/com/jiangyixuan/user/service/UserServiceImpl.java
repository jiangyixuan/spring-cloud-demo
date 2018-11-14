package com.jiangyixuan.user.service;

import com.jiangyixuan.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link UserService 用户服务} 提供者实现
 *
 * @author jiangyixuan
 * @date 2018-11-13
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean save(User user) {
        System.out.println("--正在保存用户到数据库--");
        return true;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        for (long i = 0; i < 5; i++) {
            User user = new User();
            user.setName("user" + (i + 1));
            user.setId(i + 1);

            users.add(user);
        }
        return users;
    }
}
