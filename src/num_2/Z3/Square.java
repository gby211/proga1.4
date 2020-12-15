package num_2.Z3;

public class Square extends Rectangle {
    public Square(){width=1;length =1;color="black";filled= false;}
    public Square(double side){width=side;length=side;color="black";filled= false;}
    public Square(double side, String color , boolean filled){width=side;length=side;this.color=color;this.filled=filled;}
    public double getSide(){return length;}
    public void setSide(double side){length=side;width=side;}

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
