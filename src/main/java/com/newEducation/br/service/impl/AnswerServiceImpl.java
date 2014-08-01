package com.newEducation.br.service.impl;

import com.newEducation.br.dao.GenericDAO;
import com.newEducation.br.model.Answer;
import com.newEducation.br.model.Question;
import com.newEducation.br.service.AnswerService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by glaucia on 09/07/14.
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    private GenericDAO dao;

    @Override
    public void saveAnswer(Answer answer) {
        dao.save(answer);

    }

    @Override
    public void deleteAnswer(Answer answer) {
        dao.delete(answer);
    }

    @Override
    public void updateAnswer(Answer answer) {
        dao.update(answer);

    }

    @Override
    public Answer findAnswerById(Long id) {
        Answer answer = dao.getById(Answer.class, id);
        return answer;
    }

    @Override
    //Preciso verificar como fazer ... acho que deve existir um jeito mais fácil do que montar um SQL
    public List<Answer> findAnswerByQuestion(Question question) {
        List<Answer> listAnswer = new LinkedList<Answer>();
        return listAnswer;
    }
}
