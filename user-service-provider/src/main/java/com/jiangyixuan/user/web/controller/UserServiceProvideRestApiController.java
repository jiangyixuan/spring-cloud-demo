package com.jiangyixuan.user.web.controller;

import com.jiangyixuan.user.domain.User;
import com.jiangyixuan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@link UserService 用户服务} 提供方 REST API {@link RestController}
 *
 * @author jiangyixuan
 * @date 2018-11-13
 */
@RestController
public class UserServiceProvideRestApiController {

    @Autowired
    private UserService userService;

    /**
     * @param user 请求参数名为“user”的数据
     * @return 如果保存成功，返回{@link User},否则返回<code>null</code>
     */
    @PostMapping("/user")
    public boolean saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    /**
     * 返回所有的用户数据
     *
     * @return
     */
    @GetMapping("/user")
    public List<User> listUser() {
        return userService.findAll();
    }


}
