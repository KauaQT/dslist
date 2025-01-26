package com.curso.nelio.dslist.dto;

import com.curso.nelio.dslist.entities.GameList;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto() {

    }

    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
