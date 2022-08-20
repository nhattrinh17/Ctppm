package javaexercises5;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDenta;
    private float yDenta;

    public Ball(float x, float y, int radius, float xDenta, float yDenta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDenta = xDenta;
        this.yDenta = yDenta;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDenta() {
        return this.xDenta;
    }

    public void setXDenta(float xDenta) {
        this.xDenta = xDenta;
    }

    public float getYDenta() {
        return this.yDenta;
    }

    public void setYDenta(float yDenta) {
        this.yDenta = yDenta;
    }

    public void move() {
        this.x += this.xDenta;
        this.y += this.yDenta;
    }

    public void reflectHorizontal() {
        this.xDenta *= -1;
    }

    public void reflectVertical() {
        this.yDenta *= -1;
    }

    public String toString() {
        return "Ball[ (" + this.x + ", " + this.y + "), speed=(" + this.xDenta + ", " + this.yDenta + ") ]"; 
    }
}
