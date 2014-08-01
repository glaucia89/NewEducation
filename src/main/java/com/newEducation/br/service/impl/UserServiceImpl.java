package com.newEducation.br.service.impl;

import com.newEducation.br.dao.GenericDAO;
import com.newEducation.br.model.User;
import com.newEducation.br.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class UserServiceImpl implements UserService {

    private GenericDAO dao;

    @Override
    //TODO - incluir mensagem de erro
    public void saveUser(User user) {
        if (this.isAvailableName(user.getNameUser())) {
            dao.save(user);
        }
    }

    @Override
    public void deleteUser(User user) {
        dao.delete(user);
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);

    }

    @Override
    public User findUserById(Long id) {
        return dao.getById(User.class, id);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll(User.class);
    }

    @Override
    //TODO
    public User findByName(String name) {
        return null;
    }

    public boolean isAvailableName(String name) {
        User userFind = this.findByName(name);
        if (userFind != null) {
            return false;
        }
        return true;
    }
}
