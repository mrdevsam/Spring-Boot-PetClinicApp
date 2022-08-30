package com.app.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    
    @RequestMapping({"", "/", "index" ,"index.html"})
    public String index() {
        return "index.html";
    }

    @RequestMapping("oups")
    public String oupsHndler() {
        return "oupsPage.html";
    }
}
