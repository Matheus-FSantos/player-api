package io.github.matheusfsantos.playersapi.main;

import io.github.matheusfsantos.playersapi.application.gateways.PlayerGateway;
import io.github.matheusfsantos.playersapi.application.usecases.CreatePlayerInteractor;
import io.github.matheusfsantos.playersapi.infrastructure.controller.PlayerDTOMapper;
import io.github.matheusfsantos.playersapi.infrastructure.gateways.PlayerEntityMapper;
import io.github.matheusfsantos.playersapi.infrastructure.gateways.PlayerGatewayImpl;
import io.github.matheusfsantos.playersapi.infrastructure.persistence.PlayerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {

    @Bean
    CreatePlayerInteractor createUseCase(PlayerGateway playerGateway) {
        return new CreatePlayerInteractor(playerGateway);
    }

    @Bean
    PlayerGateway playerGateway(PlayerEntityMapper playerEntityMapper, PlayerRepository playerRepository) {
        return new PlayerGatewayImpl(playerEntityMapper, playerRepository);
    }

    @Bean
    PlayerEntityMapper playerEntityMapper() {
        return new PlayerEntityMapper();
    }

    @Bean
    PlayerDTOMapper playerDTOMapper() {
        return new PlayerDTOMapper();
    }

}
