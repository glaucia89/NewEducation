package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.SchoolDAO;
import com.newEducation.br.model.School;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
@Component
@Transactional(readOnly = false)
public class SchoolDAOImpl implements SchoolDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public School getById(Long id) {

        return null;
    }

    @Override
    public School save(School entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public School update(School entity) {
        this.sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    @Override
    public void delete(School entity) {
        this.sessionFactory.getCurrentSession().delete(entity);

    }

    @Override
    public List<School> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from  " + School.class).list();
    }
}
