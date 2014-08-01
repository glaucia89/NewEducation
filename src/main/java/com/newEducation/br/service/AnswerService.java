package com.newEducation.br.service;

import com.newEducation.br.model.Answer;
import com.newEducation.br.model.Question;

import java.util.List;

/**
 * Created by glaucia on 09/07/14.
 */
public interface AnswerService {

    public void saveAnswer(Answer answer);

    public void deleteAnswer(Answer answer);

    public void updateAnswer(Answer answer);

    public Answer findAnswerById(Long id);

    public List<Answer> findAnswerByQuestion(Question question);
}
