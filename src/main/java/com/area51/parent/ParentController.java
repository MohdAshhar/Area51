package com.area51.parent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/parent")
public class ParentController {

    @Autowired
    private ParentRepository parentRepo;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Parent> getAllParent() {
        // This returns the JSON or XML
        return parentRepo.findAll();
    }



}
