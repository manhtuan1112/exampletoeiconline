package com.mitrais.core.data.daoimpl;

import com.mitrais.core.common.util.HibernateUtil;
import com.mitrais.core.data.dao.GenericDao;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by duongtuan1211 on 1/1/2018.
 */
public class AbstractDao<ID extends Serializable,T> implements GenericDao<ID,T> {
    private Class<T> persistenceClass;

    public AbstractDao(){
        this.persistenceClass= (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    public String getPersistenceClassName(){
        return persistenceClass.getSimpleName();
    }
    protected Session getSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }
    public List<T> findAll() {
        List<T> list=new ArrayList<T>();
        Transaction transaction=null;
        try{
            transaction=getSession().beginTransaction();
            //HQL
            StringBuilder sql=new StringBuilder("from ");
            sql.append(this.getPersistenceClassName());
            Query query=this.getSession().createQuery(sql.toString());
            list=query.list();
            transaction.commit();

        } catch (HibernateException e){
            transaction.rollback();
            throw e;
        }
        return list;
    }


}

