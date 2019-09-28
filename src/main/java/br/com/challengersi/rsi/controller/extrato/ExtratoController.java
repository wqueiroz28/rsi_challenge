package br.com.challengersi.rsi.controller.extrato;

import br.com.challengersi.rsi.models.Extrato;
import br.com.challengersi.rsi.repository.AccountRepository;
import br.com.challengersi.rsi.repository.ExtratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExtratoController {

    @Autowired
    private ExtratoRepository repository;


    @GetMapping("/pegarExtrato")
    @ResponseBody
    public Extrato pegarExtrato(Extrato extrato){
        return repository.save(extrato);
    }

    @DeleteMapping("/excluirExtrato")
    @ResponseBody
    public String pegarExtrato(int conta){
        return "Estrato da conta "+ conta+" foi deletado";
    }
}
