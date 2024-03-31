package io.github.matheusfsantos.playersapi.infrastructure.controller;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreatePlayerResponse(
        UUID id,
        String name,
        Integer age,
        Float weight,
        Float height,
        @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss") LocalDateTime createdAt,
        @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss") LocalDateTime updatedAt
) { }
