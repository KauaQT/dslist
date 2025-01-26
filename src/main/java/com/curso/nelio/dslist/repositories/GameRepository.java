package com.curso.nelio.dslist.repositories;

import com.curso.nelio.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
