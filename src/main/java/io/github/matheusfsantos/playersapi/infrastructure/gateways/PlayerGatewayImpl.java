package io.github.matheusfsantos.playersapi.infrastructure.gateways;

import io.github.matheusfsantos.playersapi.application.gateways.PlayerGateway;
import io.github.matheusfsantos.playersapi.domain.entity.Player;
import io.github.matheusfsantos.playersapi.infrastructure.persistence.PlayerEntity;
import io.github.matheusfsantos.playersapi.infrastructure.persistence.PlayerRepository;

public class PlayerGatewayImpl implements PlayerGateway {

    private PlayerEntityMapper playerEntityMapper;
    private final PlayerRepository playerRepository;

    public PlayerGatewayImpl(PlayerEntityMapper playerEntityMapper, PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
        this.playerEntityMapper = playerEntityMapper;
    }

    @Override
    public Player createPlayer(Player playerDomainObject) {
        PlayerEntity savedPlayer = this.playerRepository.save(this.playerEntityMapper.toEntity(playerDomainObject));
        return this.playerEntityMapper.toDomain(savedPlayer);
    }

}
