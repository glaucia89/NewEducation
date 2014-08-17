package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.UserDAO;
import com.newEducation.br.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
@Component
@Transactional
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User save(User entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public User update(User entity) {
        this.sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    @Override
    public void delete(User entity) {
        this.sessionFactory.getCurrentSession().delete(entity);

    }

    @Override
    public List<User> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from  " + User.class).list();
    }
}
