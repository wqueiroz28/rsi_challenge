package br.com.challengersi.rsi.controller;

import br.com.challengersi.rsi.models.Account;
import br.com.challengersi.rsi.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountRepository repository;



}
