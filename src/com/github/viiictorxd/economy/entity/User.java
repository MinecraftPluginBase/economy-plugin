package com.github.viiictorxd.economy.entity;

import java.util.UUID;

public class User {

    private final UUID uniqueId;
    private final String name;
    private double quantity;

    public User(UUID uniqueId, String name) {
        this(uniqueId, name, 0);
    }

    public User(UUID uniqueId, String name, double quantity) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.quantity = quantity;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(double quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(double quantity) {
        this.quantity -= quantity;

        if (this.quantity < 0)
            setQuantity(0);
    }
}
