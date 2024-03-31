package io.github.matheusfsantos.playersapi.infrastructure.controller;

import io.github.matheusfsantos.playersapi.domain.entity.Player;

import java.time.LocalDateTime;
import java.util.UUID;

public class PlayerDTOMapper {

    public CreatePlayerResponse toResponse(Player playerDomainObj) {
        return new CreatePlayerResponse(playerDomainObj.id(), playerDomainObj.name(), playerDomainObj.age(), playerDomainObj.weight(), playerDomainObj.height(), playerDomainObj.createdAt(), playerDomainObj.updatedAt());
    }

    public Player toPlayer(CreatePlayerRequest playerRequest) {
        return new Player(UUID.randomUUID(), playerRequest.name(), playerRequest.age(), playerRequest.weight(), playerRequest.height(), LocalDateTime.now(), LocalDateTime.now());
    }

}
