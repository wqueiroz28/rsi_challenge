package br.com.challengersi.rsi.controller.transfer;

import br.com.challengersi.rsi.model.TransferModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    @PostMapping("/transferir")
    @ResponseBody
    public String transfer(int contaDestino, double transferValue, int contaOrigem){

        return contaDestino+","+","+transferValue+"para"+contaOrigem;
    }
}
