package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.AnswerDAO;
import com.newEducation.br.model.Answer;
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
public class AnswerDAOImpl implements AnswerDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Answer getById(Long id) {
        return null;
    }

    @Override
    public Answer save(Answer entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public Answer update(Answer entity) {
        this.sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    @Override
    public void delete(Answer entity) {
        this.sessionFactory.getCurrentSession().delete(entity);

    }

    @Override
    public List<Answer> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from  " + Answer.class).list();
    }
}
