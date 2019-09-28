package br.com.challengersi.rsi.controller.conta;

import br.com.challengersi.rsi.model.Extrato;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExtratoController {

    @GetMapping("/pegarExtrato")
    @ResponseBody
    public Extrato pegarExtrato(Extrato extrato){
        return extrato;
    }

    @PostMapping("/EnviarExtrato")
    @ResponseBody
    public String pegarExtrato(int conta, String data, String descricao, double valor){
        return "Extrato salvo con sucesso";
    }

    @DeleteMapping("/excluirExtrato")
    @ResponseBody
    public String pegarExtrato(int conta){
        return "Estrato da conta "+ conta+" foi deletado";
    }
}
