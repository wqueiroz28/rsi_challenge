package br.com.challengersi.rsi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class TransferModel {
    @Id
    private int id;
    private int contaDestino;
    private int contaOrigem;
    private double transferValue;

    public TransferModel() {

    }

    public TransferModel(int contaDestino, int contaOrigem, double transferValue) {
        this.contaDestino = contaDestino;
        this.contaOrigem = contaOrigem;
        this.transferValue = transferValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public int getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public double getTransferValue() {
        return transferValue;
    }

    public void setTransferValue(double transferValue) {
        this.transferValue = transferValue;
    }

}
