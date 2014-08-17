package com.newEducation.br.dao;

import com.newEducation.br.model.Answer;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface AnswerDAO {

    public Answer getById(Long id);

    public Answer save(Answer entity);

    public Answer update(Answer entity);

    public void delete(Answer entity);

    public List<Answer> findAll();
}
