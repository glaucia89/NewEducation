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
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/School/page", method = RequestMethod.GET)
    public String listSchool(Model model) {
        model.addAttribute("schools", this.schoolService.findAll());
        return "listschool";
    }

    @RequestMapping(value = "/School/add", method = RequestMethod.GET)
    public String initAddSchool(ModelMap model) {
        School school = new School();
        model.addAttribute("school", school);
        model.addAttribute("cities", City.values());
        model.addAttribute("states", State.values());
        return "addschool";
    }

    @RequestMapping(value = "/School/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("schoolmodel") School schoolmodel, Model model) {
        this.schoolService.saveSchool(schoolmodel);
        model.addAttribute("message", "Escola " + schoolmodel.getTitle() + " foi salva com sucesso");
        return "listschool";
    }
}
