package com.autenticatelemetria.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autenticatelemetria.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
