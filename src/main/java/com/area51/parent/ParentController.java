package com.area51.parent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ParentController {

    @Autowired
    private ParentService parentService;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Parent> getAllParent() {
        // This returns the JSON or XML
        return parentService.getAllParent();
    }

    @GetMapping(path = {"/","/home"})
    public String homePage(Model model) {

        return "/index.html";
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

    @PostMapping(path = "/register")
    public String registerUser(HttpServletRequest request, Model model) {

        System.out.println(request.getServletPath());

        System.out.println("Name value : "+request.getParameter("fname"));
        Parent p = new Parent();
        String name  = request.getParameter("fname") +" "+request.getParameter("lname");
        p.setName(name);
        p.setEmail(request.getParameter("email"));
        p.setPhone(request.getParameter("phone"));
        p.setAddressLine1(request.getParameter("addr1"));
        p.setCity(request.getParameter("city"));
        p.setState(request.getParameter("state"));
        p.setCountry(request.getParameter("country"));
        p.setPassword(request.getParameter("pwd"));
        parentService.addParent(p);
        return "/home";
    }
}
