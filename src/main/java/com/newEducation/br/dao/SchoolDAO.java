package com.newEducation.br.dao;

import com.newEducation.br.model.School;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface SchoolDAO {

    public School getById(Long id);

    public School save(School entity);

    public School update(School entity);

    public void delete(School entity);

    public List<School> findAll();
}
