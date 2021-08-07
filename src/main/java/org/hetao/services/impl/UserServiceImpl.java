package org.hetao.services.impl;

import org.hetao.dao.UserDao;
import org.hetao.domain.User;
import org.hetao.services.UserService;
import org.hetao.utils.mybatisUtil;

public class UserServiceImpl implements UserService {
    UserDao userDao=null;
    public UserServiceImpl() {
        userDao= mybatisUtil.getSqlsession().getMapper(UserDao.class);
    }


    @Override
    public User isUser(User user) {
        return userDao.isUser(user);
    }
}
