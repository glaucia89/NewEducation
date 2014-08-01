package com.newEducation.br.service;

import com.newEducation.br.model.User;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface UserService {

    public void saveUser(User user);

    public void deleteUser(User user);

    public void updateUser(User user);

    public User findUserById(Long id);

    public List<User> findAll();

    public User findByName(String name);
}
