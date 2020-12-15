package num_2.Z1;

public class Test {
    public static void main(String[] args) {
        dog Riki = new dog("Riki",8);
        dog Pup = new dog ("Pup",123);
        System.out.println(Riki.toHumanAge());
        ball woleibool = new ball("woleibool");
        ball golf = new ball(5.5,123.4,"golf");
        golf.setPrise(100.0);
        woleibool.setPrise(200.0);
        woleibool.setSize(12.0);
        System.out.println(woleibool.toString());
        System.out.println(golf.toString());
    }
}
