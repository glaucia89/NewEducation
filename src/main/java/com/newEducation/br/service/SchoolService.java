package com.newEducation.br.service;

import com.newEducation.br.model.School;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface SchoolService {

    public void saveSchool(School school);

    public void deleteSchool(School school);

    public void updateSchool(School school);

    public School findSchoolById(Long id);

    public List<School> findAll();
}
