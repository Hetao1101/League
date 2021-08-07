package org.hetao.services.impl;

import org.apache.ibatis.session.SqlSession;
import org.hetao.dao.RoleDao;
import org.hetao.domain.Role;
import org.hetao.services.RoleService;
import org.hetao.utils.mybatisUtil;

public class RoleServiceImpl implements RoleService {
    RoleDao roleDao;

    public RoleServiceImpl() {
        roleDao=mybatisUtil.getSqlsession().getMapper(RoleDao.class);
    }

    @Override
    public Role queryRole(Role role) {
        return roleDao.queryRole(role);
    }
}
