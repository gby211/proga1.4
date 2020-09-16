package ru.Zadanie_3_2_Movable;

public class MovableRectangle extends MovablePoint {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super(0, 0, 0, 0);
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean isEqual(MovablePoint MA, MovablePoint MB) {
        boolean flag = false;
        if (MA.ySpeed == MB.ySpeed && MA.xSpeed == MB.xSpeed)
            flag = true;
        return flag;
    }

    @Override
    public void moveUp() {
        if (isEqual(topLeft, bottomRight)) {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
    }

    @Override
    public void moveDown() {
        if (isEqual(topLeft, bottomRight)) {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
    }

    @Override
    public void moveLeft() {
        if (isEqual(topLeft, bottomRight)) {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
    }

    @Override
    public void moveRight() {
        if (isEqual(topLeft, bottomRight)) {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
