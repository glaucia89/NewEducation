package com.newEducation.br.dao.impl;

import com.newEducation.br.dao.QuestionDAO;
import com.newEducation.br.model.Question;
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
public class QuestionDAOImpl implements QuestionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Question getById(Long id) {
        return null;
    }

    @Override
    public Question save(Question entity) {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public Question update(Question entity) {
        this.sessionFactory.getCurrentSession().update(entity);
        return entity;
    }

    @Override
    public void delete(Question entity) {
        this.sessionFactory.getCurrentSession().delete(entity);

    }

    @Override
    public List<Question> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from  " + Question.class).list();
    }
}