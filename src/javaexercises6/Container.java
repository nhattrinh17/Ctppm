package javaexercises6;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width - 1;
        y2 = y1 + height -1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2;
    }

    public int getHeight() {
        return y2;
    }

    public boolean collidesWith(Ball ball) {
        if((ball.getX() - ball.getRadius() <= this.x1) || 
            (ball.getX() - ball.getRadius() >= this.x2)) {
                ball.reflectHorizontal();
            return true;
        } else if((ball.getY() - ball.getRadius() <= this.y1) || 
                (ball.getY() - ball.getRadius() >= this.y2)){
            ball.reflectVertical();
            return true;
        }
        return true;
    }

    public String toString() {
        return "Container at (" + this.x1 + ", " + this.y1 + ")" + "to (" + this.x2 + ", " + this.y2 + ")";
    }
}
