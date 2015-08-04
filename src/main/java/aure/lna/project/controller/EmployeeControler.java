package aure.lna.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aure.lna.project.model.Employee;
import aure.lna.project.service.EmployeeService;

@Controller
@RequestMapping("/e")
public class EmployeeControler {
    @Autowired
    private EmployeeService service;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {
        List<Employee> employees = service.findAllEmployees();
        model.addAttribute("employees", employees);
        return "employees";
    }
}
