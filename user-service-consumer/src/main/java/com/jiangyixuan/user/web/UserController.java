package com.jiangyixuan.user.web;

import com.jiangyixuan.user.domain.User;
import com.jiangyixuan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户服务REST API
 *
 * @author jiangyixuan
 * @date 2018-11-13
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @param name 请求参数名为“name”的数据
     * @return 如果保存成功，返回{@link User},否则返回<code>null</code>
     */
    @PostMapping("/user")
    public User saveUser(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        if (userService.save(user)) {
            return user;
        } else {
            return null;
        }
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
