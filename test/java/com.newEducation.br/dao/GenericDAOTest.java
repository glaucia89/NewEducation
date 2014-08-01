package com.newEducation.br.dao;

import com.newEducation.br.dao.impl.GenericDAOImpl;
import com.newEducation.br.model.Answer;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by glaucia on 13/07/14.
 */
public class GenericDAOTest {

    //    @Autowired
    private GenericDAO genericDAO = new GenericDAOImpl();

    @Test
    public void createAnswer() {
        Answer answer = new Answer();
        answer.setResponse("teste de dao");
        answer.setType("teste");
        answer.setIsCorrect(false);

        genericDAO.save(answer);
        List<Answer> list = genericDAO.findAll(Answer.class);

        Assert.assertEquals(1, list.size());
    }


}
