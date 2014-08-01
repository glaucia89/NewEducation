package com.newEducation.br.service;

import com.newEducation.br.model.Player;
import com.newEducation.br.model.User;

import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
public interface PlayerService {

    public void savePlayer(Player player);

    public void deletePlayer(Player player);

    public void updatePlayer(Player player);

    public List<Player> findAll();

    public Player findPlayerById(Long id);

    public Player findPlayerByUser(User user);
}
