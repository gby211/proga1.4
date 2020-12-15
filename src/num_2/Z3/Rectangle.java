package num_2.Z3;

public class Rectangle extends Shape {
    protected double width,length;
    public Rectangle(){color="green";filled=true;width=1.0;length=1.0;}
    public Rectangle(double width,double length){color="green";filled=true;this.width=width;this.length=length;}
    public Rectangle(double width,double length, String color , boolean filled ){this.color=color;this.filled=filled;this.width=width;this.length=length;}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
