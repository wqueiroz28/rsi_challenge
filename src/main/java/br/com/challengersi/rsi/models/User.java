package br.com.challengersi.rsi.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "user" ,allocationSize = 1 ,sequenceName = "T_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "user")
    private int id ;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "lastname" ,nullable = false)
    private String lastName;
    @Column(name = "nr_cpf" ,nullable = false)
    private String cpf;
    @Column(name = "address")
    private Address address;
    @Column(name = "dt_Birth")
    private Date dateofBirth;
    @Column(name = "email")
    private String email;
    @Column(name = "psswd" ,nullable = false)
    private String password;










}
