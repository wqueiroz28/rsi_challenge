package br.com.challengersi.rsi.controller;

import br.com.challengersi.rsi.models.Account;
import br.com.challengersi.rsi.models.User;
import br.com.challengersi.rsi.repository.AccountRepository;
import br.com.challengersi.rsi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> toList(){
        return repository.findAll();
    }

    @PostMapping
    public User toRegister(User user){
        return repository.save(user);
    }

}
