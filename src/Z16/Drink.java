package Z16;

public final class Drink extends MenuItem implements Alcoholable {
    private double alcoholVol;
    final Drink BEAR = new Drink();
    final Drink WINE = new Drink();

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol != 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
