package com.newEducation.br.controller;

import com.newEducation.br.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/Player/")
public class PlayerController {

    @Autowired
    private PlayerService playerService;
}