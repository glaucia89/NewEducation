package com.newEducation.br.service.impl;

import com.newEducation.br.dao.GenericDAO;
import com.newEducation.br.model.PlayerSchoolGrade;
import com.newEducation.br.service.PlayerSchoolGradeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class PlayerSchoolGradeServiceImpl implements PlayerSchoolGradeService {

    private GenericDAO dao;

    @Override
    public void savePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        dao.save(playerSchoolGrade);
    }

    @Override
    public void updatePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        dao.update(playerSchoolGrade);

    }

    @Override
    public void deletePlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        dao.update(playerSchoolGrade);

    }

    @Override
    public List<PlayerSchoolGrade> findAllPSG() {
        return dao.findAll(PlayerSchoolGrade.class);

    }

    @Override
    //TODO
    public List<PlayerSchoolGrade> findPSGByPlayer() {
        return null;
    }
}
