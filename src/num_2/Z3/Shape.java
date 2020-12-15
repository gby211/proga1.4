package num_2.Z3;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    final double PI=3.14;
    public Shape() {
    }

    public Shape(String color, boolean filled) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();


}
