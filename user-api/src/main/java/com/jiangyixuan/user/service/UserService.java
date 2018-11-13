package com.jiangyixuan.user.service;

import com.jiangyixuan.user.domain.User;

import java.util.List;

/**
 * 用户服务
 *
 * @author jiangyixuan
 * @date 2018-11-13
 */
public interface UserService {

    /**
     * 保存用户
     *
     * @param user
     * @return 成功返回true，否则返回false
     */
    boolean save(User user);

    /**
     * 查询所有用户对象
     *
     * @return 不会返回null
     */
    List<User> findAll();

}
