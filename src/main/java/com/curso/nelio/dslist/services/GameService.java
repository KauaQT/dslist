package com.curso.nelio.dslist.services;

import com.curso.nelio.dslist.dto.GameDto;
import com.curso.nelio.dslist.dto.GameMinDto;
import com.curso.nelio.dslist.entities.Game;
import com.curso.nelio.dslist.projections.GameMinProjection;
import com.curso.nelio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();

        return dto;
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long gameId) {
        Optional<Game> result = gameRepository.findById(gameId);

        return new GameDto(result.get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }
}
