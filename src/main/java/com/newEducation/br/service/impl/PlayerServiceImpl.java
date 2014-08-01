package com.newEducation.br.service.impl;

import com.newEducation.br.dao.GenericDAO;
import com.newEducation.br.model.Player;
import com.newEducation.br.model.User;
import com.newEducation.br.service.PlayerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    private GenericDAO dao;

    @Override
    public void savePlayer(Player player) {
        dao.save(player);
    }

    @Override
    public void deletePlayer(Player player) {
        dao.delete(player);

    }

    @Override
    public void updatePlayer(Player player) {
        dao.update(player);
    }

    @Override
    public List<Player> findAll() {
        return dao.findAll(Player.class);
    }

    @Override
    public Player findPlayerById(Long id) {
        return dao.getById(Player.class, id);
    }

    @Override
    //TODO
    public Player findPlayerByUser(User user) {
        return null;
    }
}
