package flowers;

import flowersProperties.Color;
import flowersProperties.Country;
import flowersProperties.Odor;

public class Chamomile extends Flower {
    private boolean therapeutic;

    public Chamomile(Color color, double length, Odor odor, Country countryOfOrigin, double price, boolean therapeutic) {
        super(color, length, odor, countryOfOrigin, price);
        this.therapeutic = therapeutic;
    }

    public static boolean getRandomTherapeutic(){
        return rnd.nextBoolean();
    }

    public static Chamomile getRandomFlower(){
        return new Chamomile(getRandomColor(), getRandomLength(), getRandomOdor(),
                getRandomCountryOfOrigin(), getRandomPrice(), getRandomTherapeutic());
    }

}
