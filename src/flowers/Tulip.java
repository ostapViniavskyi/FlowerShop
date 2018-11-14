package flowers;

import flowersProperties.Color;
import flowersProperties.Country;
import flowersProperties.Odor;

public class Tulip extends Flower {
    private boolean nectars;

    public Tulip(Color color, double length, Odor odor, Country countryOfOrigin, double price, boolean nectars) {
        super(color, length, odor, countryOfOrigin, price);
        this.nectars = nectars;
    }

    public static boolean getRandomNectars(){
        return rnd.nextBoolean();
    }

    public static Tulip getRandomFlower(){
        return new Tulip(getRandomColor(), getRandomLength(), getRandomOdor(),
                getRandomCountryOfOrigin(), getRandomPrice(), getRandomNectars());
    }
}
