package io.github.matheusfsantos.playersapi.infrastructure.controller;

import io.github.matheusfsantos.playersapi.application.usecases.CreatePlayerInteractor;
import io.github.matheusfsantos.playersapi.domain.entity.Player;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerDTOMapper playerDTOMapper;
    private final CreatePlayerInteractor createPlayerInteractor;

    public PlayerController(CreatePlayerInteractor createPlayerInteractor, PlayerDTOMapper playerDTOMapper) {
        this.playerDTOMapper = playerDTOMapper;
        this.createPlayerInteractor = createPlayerInteractor;
    }

    @PostMapping
    public CreatePlayerResponse createPlayer(@RequestBody CreatePlayerRequest request) {
        Player savedPlayer = this.createPlayerInteractor.createPlayer(this.playerDTOMapper.toPlayer(request));
        return this.playerDTOMapper.toResponse(savedPlayer);
    }

}
