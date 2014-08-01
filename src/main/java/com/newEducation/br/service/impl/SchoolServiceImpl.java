package com.newEducation.br.service.impl;

import com.newEducation.br.dao.GenericDAO;
import com.newEducation.br.model.School;
import com.newEducation.br.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    private GenericDAO dao;

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
        return dao.getById(School.class, id);
    }

    @Override
    public List<School> findAll() {
        return dao.findAll(School.class);
    }
}
