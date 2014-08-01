package com.newEducation.br.service.impl;

import com.newEducation.br.dao.GenericDAO;
import com.newEducation.br.model.Game;
import com.newEducation.br.model.User;
import com.newEducation.br.service.GameService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by glaucia on 31/07/14.
 */
@Service
public class GameServiceImpl implements GameService {

    private GenericDAO dao;

    @Override
    public void saveGame(Game game) {
        game.setDate(new Date());
        dao.save(game);

    }

    @Override
    public void updateGame(Game game) {
        dao.update(game);

    }

    @Override
    public void deleteGame(Game game) {
        dao.delete(game);

    }

    @Override
    public List<Game> findAllGames() {
        return dao.findAll(Game.class);
    }

    @Override
    //TODO melhor jeito para pesquisar por 1 atributo
    public List<Game> findGameByUser(User user) {
        return null;
    }
}
