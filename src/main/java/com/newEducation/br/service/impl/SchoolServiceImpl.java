package com.newEducation.br.service.impl;

import com.newEducation.br.dao.SchoolDAO;
import com.newEducation.br.model.School;
import com.newEducation.br.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    protected SchoolDAO dao;

    @Override
    public void saveSchool(School school) {
        dao.save(school);
    }

    @Override
    public void deleteSchool(School school) {
        dao.delete(school);
    }

    @Override
    public void updateSchool(School school) {
        dao.update(school);
    }

    @Override
    public School findSchoolById(Long id) {
        return dao.getById(id);
    }

    @Override
    public List<School> findAll() {
        return dao.findAll();
    }

    @Override
    public void deleteSchoolbyId(Long id) {
        School school = dao.getById(id);
        dao.delete(school);
    }
}
