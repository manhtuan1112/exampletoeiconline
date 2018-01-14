package com.mitrais.core.data.dao;

import java.io.Serializable;
import java.util.List;
/**
 * Created by duongtuan1211 on 1/1/2018.
 */
public interface GenericDao<ID extends Serializable,T> {
    List<T> findAll();
    T update(T entity);
}
