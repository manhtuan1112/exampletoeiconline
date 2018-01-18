package com.mitrais.core.test;


import com.mitrais.core.dao.RoleDao;
import com.mitrais.core.daoimpl.RoleDaoImpl;
import com.mitrais.core.persistence.entity.RoleEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duongtuan1211 on 1/3/2018.
 */
public class ApiTest {
    @Test
    public void checkFindAll() {
        RoleDao roleDao = new RoleDaoImpl();
        List<RoleEntity> list = roleDao.findAll();
    }

    @Test
    public void checkUpdateRole() {
        RoleDao roleDao = new RoleDaoImpl();
        RoleEntity entity = new RoleEntity();
        entity.setRoleId(2);
        entity.setName("USER");
        roleDao.update(entity);
    }

    @Test
    public void checkSaveRole() {
        RoleDao roleDao = new RoleDaoImpl();
        RoleEntity entity = new RoleEntity();
        entity.setRoleId(2);
        entity.setName("USER");
        roleDao.save(entity);
    }

    @Test
    public void checkFindById() {
        RoleDao roleDao = new RoleDaoImpl();
        RoleEntity entity = roleDao.findById(1);
    }

    @Test
    public void checkFindByProperty() {
        RoleDao roleDao = new RoleDaoImpl();
        String property = null;
        Object value = null;
        String sortExpression = null;
        String sortDirection = null;
        Object[] objects = roleDao.findByProperty(property,value,sortExpression,sortDirection);

    }

    @Test
    public void checkDelete(){
        List<Integer> listId= new ArrayList<Integer>();
        listId.add(1);
        listId.add(2);
        RoleDao roleDao=new RoleDaoImpl();
        Integer count = roleDao.delete(listId);
    }
}
