package com.hetao;

import org.hetao.domain.Role;
import org.hetao.domain.User;
import org.hetao.services.impl.RoleServiceImpl;
import org.hetao.services.impl.UserServiceImpl;

public class Test {
    @org.junit.Test
    public void test1()
    {
        System.out.println(new UserServiceImpl().isUser(new User("2990096445","hetao174")));
    }
    @org.junit.Test
    public void test2()
    {
        System.out.println(new RoleServiceImpl().queryRole(new Role(1,"黑色玫瑰 电信")));
    }
}
