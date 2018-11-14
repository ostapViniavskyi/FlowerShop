package flowers;

import flowersProperties.Color;
import flowersProperties.Country;
import flowersProperties.Odor;

public class Rosie extends Flower {
    private boolean spikes;

    public Rosie(Color color, double length, Odor odor, Country countryOfOrigin, double price, boolean spikes) {
        super(color, length, odor, countryOfOrigin, price);
        this.spikes = spikes;
    }

    public static boolean getRandomSpikes(){
        return rnd.nextBoolean();
    }

    public static Rosie getRandomFlower(){
        return new Rosie(getRandomColor(), getRandomLength(), getRandomOdor(),
                getRandomCountryOfOrigin(), getRandomPrice(), getRandomSpikes());
    }

}
