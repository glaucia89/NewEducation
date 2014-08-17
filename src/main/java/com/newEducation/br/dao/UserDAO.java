package com.newEducation.br.dao;

import com.newEducation.br.model.User;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface UserDAO {

    public User getById(Long id);

    public User save(User entity);

    public User update(User entity);

    public void delete(User entity);

    public List<User> findAll();
}
