package io.github.brunoleame.orders.controllers.dto;

import java.util.List;

public record OrderRequestDto(String customerId, List<ItemDto> items) { }
