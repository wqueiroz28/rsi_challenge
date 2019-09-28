package br.com.challengersi.rsi.controller.transfer;

import br.com.challengersi.rsi.models.TransferModel;
import br.com.challengersi.rsi.repository.AccountRepository;
import br.com.challengersi.rsi.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransferController {

    @Autowired
    private TransferRepository repository;

    @PostMapping("/transferir")
    @ResponseBody
    public TransferModel transfer(TransferModel transfer){
        return repository.save(transfer);
    }

    @GetMapping("/buscarTransferencias")
    @ResponseBody
    public List<TransferModel> transfer(){
        return repository.findAll();
    }
}
