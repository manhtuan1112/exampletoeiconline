package com.mitrais.core.common.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by duongtuan1211 on 12/28/2017.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory=buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        try {
            //create sessionfactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable e){
            System.out.println("Initial session factory fail");
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
