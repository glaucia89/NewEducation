package com.newEducation.br.controller;

import com.newEducation.br.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/Game/")
public class GameController {

    @Autowired
    private GameService gameService;
}
