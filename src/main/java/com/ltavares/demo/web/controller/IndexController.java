package com.ltavares.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Luiz on 19/09/2015.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap modelMap) {
        return "index.html";
    }
}
