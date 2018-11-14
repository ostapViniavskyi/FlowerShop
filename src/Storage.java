import flowersCollections.Bouquet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Storage {

    List<Bouquet> bouquets;

    private static Random rnd = new Random();

    public Storage() {
        this.bouquets = new ArrayList<>();
        // add default bouquets
        int size = rnd.nextInt(20);
        for (int i = 0; i < size; i++) {
            this.bouquets.add(Bouquet.getRandomBouquet());
        }
    }

    public void addBouquet(Bouquet bouquet){
        this.bouquets.add(bouquet);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "bouquets=" + bouquets +
                '}';
    }
}
