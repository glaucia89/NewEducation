package com.newEducation.br.service;

import com.newEducation.br.model.Question;

/**
 * Created by glaucia on 31/07/14.
 */
public interface QuestionService {

    public void saveQuestion(Question question);

    public void deleteQuestion(Question question);

    public void updateQuestion(Question question);

    public Question findQuestionById(Long id);

}
