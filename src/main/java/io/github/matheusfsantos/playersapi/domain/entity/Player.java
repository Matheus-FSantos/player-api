package io.github.matheusfsantos.playersapi.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public record Player (UUID id, String name, Integer age, Float weight, Float height, LocalDateTime createdAt, LocalDateTime updatedAt) {  }
