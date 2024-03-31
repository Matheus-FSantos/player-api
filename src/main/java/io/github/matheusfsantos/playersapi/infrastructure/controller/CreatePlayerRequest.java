package io.github.matheusfsantos.playersapi.infrastructure.controller;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreatePlayerRequest(String name, Integer age, Float weight, Float height) { }
