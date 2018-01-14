package com.mitrais.core.test;


import com.mitrais.core.dao.RoleDao;
import com.mitrais.core.daoimpl.RoleDaoImpl;
import com.mitrais.core.persistence.entity.RoleEntity;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by duongtuan1211 on 1/3/2018.
 */
public class RoleTest {
    @Test
    public void checkFindAll(){
        RoleDao roleDao = new RoleDaoImpl();
        List<RoleEntity> list = roleDao.findAll();
    }

    @Test
    public void checkUpdateRole(){
        RoleDao roleDao=new RoleDaoImpl();
        RoleEntity entity=new RoleEntity();
        entity.setRoleId(2);
        entity.setName("USER_1");
        roleDao.update(entity);
    }
}
