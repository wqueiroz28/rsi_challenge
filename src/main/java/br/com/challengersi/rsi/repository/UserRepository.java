package br.com.challengersi.rsi.repository;

import br.com.challengersi.rsi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User , Integer> {


    List<User> findByCpf( String cpf);




}
