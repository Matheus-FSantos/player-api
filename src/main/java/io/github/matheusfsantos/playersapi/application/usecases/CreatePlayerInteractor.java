package io.github.matheusfsantos.playersapi.application.usecases;

import io.github.matheusfsantos.playersapi.application.gateways.PlayerGateway;
import io.github.matheusfsantos.playersapi.domain.entity.Player;

public class CreatePlayerInteractor {

    private final PlayerGateway playerGateway;

    public CreatePlayerInteractor(PlayerGateway playerGateway) {
        this.playerGateway = playerGateway;
    }

    public Player createPlayer(Player player) {
        return this.playerGateway.createPlayer(player);
    }

}
