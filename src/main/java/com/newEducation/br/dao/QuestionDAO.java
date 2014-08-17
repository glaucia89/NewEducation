package com.newEducation.br.dao;

import com.newEducation.br.model.Question;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface QuestionDAO {

    public Question getById(Long id);

    public Question save(Question entity);

    public Question update(Question entity);

    public void delete(Question entity);

    public List<Question> findAll();
}
