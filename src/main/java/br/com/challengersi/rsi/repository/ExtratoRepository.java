package br.com.challengersi.rsi.repository;

import br.com.challengersi.rsi.models.Account;
import br.com.challengersi.rsi.models.Extrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtratoRepository extends JpaRepository<Extrato, Integer> {
}
