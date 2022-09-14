package com.hoodee.cloud.service;

import com.hoodee.cloud.domain.User;

import java.util.List;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年09月14日 11:19
 */
public interface UserService {

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);

}
