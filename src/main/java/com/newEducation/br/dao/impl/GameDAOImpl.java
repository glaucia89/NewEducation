package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.GameDAO;
import com.newEducation.br.model.Game;
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
public class GameDAOImpl implements GameDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Game getById(Long id) {
        return null;
    }

    @Override
    public Game save(Game entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public Game update(Game entity) {
        this.sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    @Override
    public void delete(Game entity) {
        this.sessionFactory.getCurrentSession().delete(entity);

    }

    @Override
    public List<Game> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from  " + Game.class).list();
    }
}
