package br.com.challengersi.rsi.controller;

import br.com.challengersi.rsi.models.Account;
import org.aspectj.bridge.IMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conta")
public class AccountController {

//    /*@Autowired
//    private AccountRepository repository;
//
//    @GetMapping
//    public List<Account> toList(){
//        //return repository.findAll();
//
//    }*/

    @GetMapping("/{cpf}")
    public String toSearch(@PathVariable String cpf){
        //return repository.findById(id).get();
        return cpf;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Account toRegister(@RequestBody Account account){
        //return repository.save(account);
        return account;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
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

    @DeleteMapping("/conta/{id}")
    public Long toRemove(@PathVariable Long id){
        //repository.deleteById(id);
        return id;
    }

}
