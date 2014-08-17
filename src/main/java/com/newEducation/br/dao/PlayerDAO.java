package com.newEducation.br.dao;

import com.newEducation.br.model.Player;

import java.util.List;

/**
 * Created by glaucia on 14/08/14.
 */
public interface PlayerDAO {

    public Player getById(Long id);

    public Player save(Player entity);

    public Player update(Player entity);

    public void delete(Player entity);

    public List<Player> findAll();
}
