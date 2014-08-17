package com.newEducation.br.dao;

import com.newEducation.br.model.PlayerSchoolGrade;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface PlayerSchoolGradeDAO {

    public PlayerSchoolGrade getById(Long id);

    public PlayerSchoolGrade save(PlayerSchoolGrade entity);

    public PlayerSchoolGrade update(PlayerSchoolGrade entity);

    public void delete(PlayerSchoolGrade entity);

    public List<PlayerSchoolGrade> findAll();
}
