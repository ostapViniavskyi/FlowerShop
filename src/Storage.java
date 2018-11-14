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

    public void addCustomBouquet(int numRoses, int numTulips, int numChamomomiles){
        this.bouquets.add(Bouquet.getCustomBouquet(numRoses, numTulips, numChamomomiles));
    }

    public int numberOfBouquets(){
        return this.bouquets.size();
    }

    @Override
    public String toString() {
        return "Storage{" +
                "bouquets=" + bouquets +
                '}';
    }

    public static void main(String[] args) {
        Storage s1 = new Storage();
        System.out.println("Initial number of bouquets: " + s1.numberOfBouquets());
        s1.addBouquet(Bouquet.getRandomBouquet());
        System.out.println("Number of bouquets after adding random one: " + s1.numberOfBouquets());
        s1.addCustomBouquet(7, 5, 3);
        System.out.println("Price of custom bouquet: " + s1.bouquets.get(s1.bouquets.size() - 1).getPrice());
    }
}
