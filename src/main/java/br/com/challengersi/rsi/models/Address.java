package br.com.challengersi.rsi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String neighborhood;
    private String city;
    private String country;
    private String complement;
    private String state;
    private String street;
    private String number;













}
