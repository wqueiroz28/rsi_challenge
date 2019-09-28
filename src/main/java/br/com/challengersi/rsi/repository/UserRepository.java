package br.com.challengersi.rsi.repository;

import br.com.challengersi.rsi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
