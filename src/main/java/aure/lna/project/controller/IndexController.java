package aure.lna.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @RequestMapping(value = "/ajax", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping("testAjax")
    public void login(HttpServletRequest request, HttpServletResponse response) {
        String result = "test json";
        response.setContentType("application/json");

        try {
            PrintWriter writer = response.getWriter();
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
