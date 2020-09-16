package ru.Zadanie_3_2_Movable;

public class MovableCircle  extends MovablePoint  implements Movable{
    private  int radius;
    private MovablePoint center;

    public MovableCircle(int x ,int y ,int xSpeed,int ySpeed,int radius) {
        super(0, 0, 0, 0);
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }



    @Override
    public void moveUp() {
        center.y += ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += xSpeed;

    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

}



