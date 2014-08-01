package com.newEducation.br.dao;

import java.util.List;

/**
 * Created by glaucia on 09/07/14.
 */
public interface GenericDAO {

    public <T> T getById(Class<T> clazz, Long id);

    public <T> void save(T entity);

    public <T> void update(T entity);

    public <T> void delete(T entity);

    public <T> List<T> findAll(Class<T> clazz);

}



