package mirea;

public class TestBall {
    public static void main(String[] args) {
        ball basket = new ball();
        ball football = new ball("black", "football");
        ball tennis = new ball("green", "tennis", 120);
        basket.setPrise(500);
        System.out.println(basket);
        basket.info();
        football.info();
        tennis.info();

    }

}
