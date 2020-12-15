package num_2.Z3;

import java.math.*;

import static java.lang.StrictMath.sqrt;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        radius = 1;
        color = "red";
        filled = true;
    }


    public Circle(double radius) {
        this.radius = radius;
        color = "blue";
        filled = true;
    }


    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * sqrt(radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
