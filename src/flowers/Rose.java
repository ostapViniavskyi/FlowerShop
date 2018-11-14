package flowers;

import flowersProperties.Color;
import flowersProperties.Country;
import flowersProperties.Odor;

public class Rose extends Flower {
    private boolean spikes;

    public Rose(Color color, double length, Odor odor, Country countryOfOrigin, double price, boolean spikes) {
        super(color, length, odor, countryOfOrigin, price);
        this.spikes = spikes;
    }

    public static boolean getRandomSpikes(){
        return rnd.nextBoolean();
    }

    public static Rose getRandomFlower(){
        return new Rose(getRandomColor(), getRandomLength(), getRandomOdor(),
                getRandomCountryOfOrigin(), getRandomPrice(), getRandomSpikes());
    }

}
