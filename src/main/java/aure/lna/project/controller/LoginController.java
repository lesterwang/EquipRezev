package aure.lna.project.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aure.lna.project.model.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String showFOrm(ModelMap model) {
        LoginForm loginForm = new LoginForm();
        model.addAttribute("loginForm", loginForm);
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@Valid LoginForm loginForm, BindingResult result, ModelMap model) {
        String userName = "UserName";
        String password = "password";
        if (result.hasErrors()) {
            return "login";
        }
        loginForm = (LoginForm) model.get("loginForm");
        if (!loginForm.getUserName().equals(userName) || !loginForm.getPassword().equals(password)) {
            return "login";
        }
        model.addAttribute("loginForm", loginForm);

        return "loginsuccess";
    }
}
