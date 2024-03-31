package io.github.matheusfsantos.playersapi.infrastructure.gateways;

import io.github.matheusfsantos.playersapi.domain.entity.Player;
import io.github.matheusfsantos.playersapi.infrastructure.persistence.PlayerEntity;

import java.util.UUID;

public class PlayerEntityMapper {

    public PlayerEntity toEntity(Player playerDomainObj) {
        return new PlayerEntity(playerDomainObj.id(), playerDomainObj.name(), playerDomainObj.age(), playerDomainObj.weight(), playerDomainObj.height(), playerDomainObj.createdAt(), playerDomainObj.updatedAt());
    }

    public Player toDomain(PlayerEntity playerEntity) {
        return new Player(playerEntity.getId(), playerEntity.getName(), playerEntity.getAge(), playerEntity.getWeight(), playerEntity.getHeight(), playerEntity.getCreatedAt(), playerEntity.getUpdatedAt());
    }

}
