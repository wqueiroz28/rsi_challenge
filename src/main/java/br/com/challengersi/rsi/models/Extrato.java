package br.com.challengersi.rsi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;
@Getter
@Setter
@Entity
public class Extrato {
    @Id
    private int Id;
    private Date data;
    private String descricao;
    private double valor;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
