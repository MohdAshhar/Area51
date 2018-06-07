package com.area51.parent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class ParentController {

    @Autowired
    private ParentRepository parentRepo;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Parent> getAllParent() {
        // This returns the JSON or XML
        return parentRepo.findAll();
    }

    @GetMapping(path = "/register")
    public String sendToRegister(Model model) {

       return "parent/ParentRegistrationForm.html";
    }

    private String message = "Hello World";

	@RequestMapping(value = { "/hello" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        model.addAttribute("message", message);
 
        return "welcome";
    }



}
