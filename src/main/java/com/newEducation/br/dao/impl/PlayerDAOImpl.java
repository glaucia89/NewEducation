package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.PlayerDAO;
import com.newEducation.br.model.Player;
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
public class PlayerDAOImpl implements PlayerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Player getById(Long id) {
        return null;
    }

    @Override
    public Player save(Player entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public Player update(Player entity) {
        this.sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    @Override
    public void delete(Player entity) {
        this.sessionFactory.getCurrentSession().delete(entity);

    }

    @Override
    public List<Player> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from  " + Player.class).list();
    }
}
