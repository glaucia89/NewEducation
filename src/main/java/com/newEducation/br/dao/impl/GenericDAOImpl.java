package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.GenericDAO;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by glaucia on 13/07/14.
 */
@Component
public class GenericDAOImpl implements GenericDAO {

    @PersistenceContext(unitName = "NewEducationBD")
    protected EntityManager entityManager;


    public <T> T getById(Class<T> clazz, Long id) {
        return (T) entityManager.find(clazz, id);
    }

    public <T> void save(T entity) {
        entityManager.persist(entity);
    }

    public <T> void update(T entity) {
        entityManager.merge(entity);
    }

    public <T> void delete(T entity) {
        entityManager.remove(entity);
    }

    public <T> List<T> findAll(Class<T> clazz) {
        return entityManager.createQuery("FROM " + clazz.getName()).getResultList();
    }

}
