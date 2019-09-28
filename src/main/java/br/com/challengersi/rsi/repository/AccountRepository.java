package br.com.challengersi.rsi.repository;

import br.com.challengersi.rsi.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}