package io.github.matheusfsantos.playersapi.application.gateways;

import io.github.matheusfsantos.playersapi.domain.entity.Player;

public interface PlayerGateway {

    Player createPlayer(Player player);

}
