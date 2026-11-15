package io.github.brunoleame.orders.domain.enums;

import java.util.Set;

public enum OrderStatus {
    RECEIVED {
        @Override
        public Set<OrderStatus> goesTo() {
            return Set.of(CONFIRMED, COMPLETED, CANCELLED);
        }
    }, CONFIRMED {
        @Override
        public Set<OrderStatus> goesTo() {
            return Set.of(COMPLETED, CANCELLED);
        }
    }, CANCELLED {
        @Override
        public Set<OrderStatus> goesTo() {
            return Set.of();
        }
    }, COMPLETED {
        @Override
        public Set<OrderStatus> goesTo() {
            return Set.of();
        }
    };

    public abstract Set<OrderStatus> goesTo();

    public static OrderStatus retrieveStatus(String status) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.name().equalsIgnoreCase(status)) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
