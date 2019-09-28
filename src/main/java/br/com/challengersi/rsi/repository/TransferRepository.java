package br.com.challengersi.rsi.repository;

import br.com.challengersi.rsi.models.TransferModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferModel, Integer> {
}
