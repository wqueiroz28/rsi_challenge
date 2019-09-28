package br.com.challengersi.rsi.controller;


import br.com.challengersi.rsi.models.User;
import br.com.challengersi.rsi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    private User user;


    @GetMapping()
    public ResponseEntity<?> findAll(){

        return new ResponseEntity<>(repository.findAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(User user){

        return new ResponseEntity<>(repository.save(user), HttpStatus.CREATED);
    }

























}
