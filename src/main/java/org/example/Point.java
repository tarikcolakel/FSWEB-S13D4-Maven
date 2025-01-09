package org.example;

public class Point {

    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance metodu (0,0) noktasına göre
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Distance metodu (Başka bir Point'e göre)
    public double distance(Point p) {
        return Math.sqrt((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
    }

    // Distance metodu (Verilen (a, b) noktasına göre)
    public double distance(int a, int b) {
        return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
    }
}