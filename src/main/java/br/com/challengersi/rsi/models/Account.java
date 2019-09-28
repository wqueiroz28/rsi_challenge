package br.com.challengersi.rsi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_CONTA")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "saldo", length = 150)
    private double saldo;

    @Column(name = "numero",nullable = false, length = 150)
    private int numero;

    @Column(name = "usuario", nullable = false, length = 150)
    private User usuario;

    public void deposit(double value){
        saldo += value;
    }

    public boolean withdraw (double value){
        if (this.saldo >= value) {
            this.saldo -= value;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfer (double value, Account accountDestiny) {

        if (this.withdraw(value)) {
            accountDestiny.deposit(value);
            return true;
        }

        return false;

    }

}


