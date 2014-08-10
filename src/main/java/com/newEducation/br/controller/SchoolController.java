package com.newEducation.br.controller;

import com.newEducation.br.model.City;
import com.newEducation.br.model.School;
import com.newEducation.br.model.State;
import com.newEducation.br.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/School/")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(method = RequestMethod.GET)
    public String initialize(ModelMap model) {
        School school = new School();
        school.setTitle("Novo nome pra escola !");
        model.addAttribute("school", school);
        model.addAttribute("cities", City.values());
        model.addAttribute("states", State.values());
        return "template";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(@ModelAttribute("schoolmodel") School schoolmodel, Model model) {
        this.schoolService.saveSchool(schoolmodel);
        model.addAttribute("message", "Escola " + schoolmodel.getTitle() + " foi salva com sucesso");
        return "hello";
    }
}
