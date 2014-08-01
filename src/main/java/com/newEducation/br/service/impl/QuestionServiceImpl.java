package com.newEducation.br.service.impl;

import com.newEducation.br.dao.GenericDAO;
import com.newEducation.br.model.Answer;
import com.newEducation.br.model.Question;
import com.newEducation.br.service.AnswerService;
import com.newEducation.br.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    private GenericDAO dao;
    private AnswerService answerService;

    @Override
    public void saveQuestion(Question question) {
        dao.save(question);
    }

    @Override
    public void deleteQuestion(Question question) {
        dao.delete(question);
    }

    @Override
    public void updateQuestion(Question question) {
        dao.update(question);
        List<Answer> listAnswer;
        listAnswer = answerService.findAnswerByQuestion(question);
        for (Answer answer : listAnswer) {
            answerService.updateAnswer(answer);
        }
    }

    @Override
    public Question findQuestionById(Long id) {
        return dao.getById(Question.class, id);
    }
}
