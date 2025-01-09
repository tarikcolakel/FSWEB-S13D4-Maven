package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    BOW(30, 1.8),
    AXE(60, 0.9);

    private final int damage;
    private final double attackSpeed;

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
