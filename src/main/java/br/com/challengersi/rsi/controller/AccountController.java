package br.com.challengersi.rsi.controller;

import br.com.challengersi.rsi.models.Account;
import br.com.challengersi.rsi.repository.AccountRepository;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conta")
public class AccountController {

    @Autowired
    private AccountRepository repository;

    @GetMapping
    public List<Account> toList(){
        return repository.findAll();

    }

    @GetMapping("/{cpf}")
    public Account toSearch(long id){
        return repository.findById(id).get();
    }


    @PostMapping
    public Account toRegister(Account account){
        return repository.save(account);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/adicionarSaldo")
    public String addBalance(int numeroConta, double valor){
//        if(inserirValor()){
//            return "Valor inserido com sucesso";
//        }

        return "Saldo";

    }

//    private boolean inserirValor(int numeroConta, double valor){
//        if(){
//            return  true;
//        }
//        return false;
//    }

    @DeleteMapping("/{id}")
    public void toRemove(@PathVariable Long id){
        repository.deleteById(id);
    }

}
