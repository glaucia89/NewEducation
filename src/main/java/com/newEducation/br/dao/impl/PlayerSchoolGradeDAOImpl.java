package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.PlayerSchoolGradeDAO;
import com.newEducation.br.model.PlayerSchoolGrade;
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
public class PlayerSchoolGradeDAOImpl implements PlayerSchoolGradeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public PlayerSchoolGrade getById(Long id) {
        return null;
    }

    @Override
    public PlayerSchoolGrade save(PlayerSchoolGrade entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public PlayerSchoolGrade update(PlayerSchoolGrade entity) {
        this.sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    @Override
    public void delete(PlayerSchoolGrade entity) {
        this.sessionFactory.getCurrentSession().delete(entity);

    }

    @Override
    public List<PlayerSchoolGrade> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from  " + PlayerSchoolGrade.class).list();
    }
}
