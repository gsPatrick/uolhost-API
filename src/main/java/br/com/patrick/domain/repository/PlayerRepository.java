package br.com.patrick.domain.repository;

import br.com.patrick.domain.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
