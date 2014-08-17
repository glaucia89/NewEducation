package com.newEducation.br.dao;

import com.newEducation.br.model.Game;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface GameDAO {

    public Game getById(Long id);

    public Game save(Game entity);

    public Game update(Game entity);

    public void delete(Game entity);

    public List<Game> findAll();
}
