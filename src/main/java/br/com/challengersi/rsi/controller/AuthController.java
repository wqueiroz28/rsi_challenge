package br.com.challengersi.rsi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/users")
    @ResponseBody
    public String getUsers() {
        return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
                "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
    }
}
