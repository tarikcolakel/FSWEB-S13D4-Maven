package org.example;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance()); // 7.810249675906654
        System.out.println("distance(second)= " + first.distance(second)); // 5.0
        System.out.println("distance(2,2)= " + first.distance(2, 2)); // 5.0

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance()); // 0.0
        Player player = new Player("Arthur", 120, Weapon.SWORD);
        System.out.println("Health Remaining: " + player.healthRemaining()); // 100

        // Lose health
        player.loseHealth(30);
        System.out.println("Health Remaining after damage: " + player.healthRemaining()); // 70

        // Restore health
        player.restoreHealth(50);
        System.out.println("Health Remaining after restoration: " + player.healthRemaining()); // 100

        // Lose health until knocked out
        player.loseHealth(120);
    }
}