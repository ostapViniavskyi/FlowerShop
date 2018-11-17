package cart;

import flowersCollections.Bouquet;

import java.util.LinkedList;
import java.util.List;

public class PlainCart implements Cart {

    private List<Bouquet> bouquets;
    public PlainCart(){
        this.bouquets = new LinkedList<Bouquet>();
    }
    public PlainCart(List<Bouquet> bouquets){
        this.bouquets = bouquets;
    }

    @Override
    public double getPrice(){
        double result = 0;
        for(Bouquet bouquet: this.bouquets){
            result += bouquet.getPrice();
        }
        return result;
    }

    @Override
    public void addBouquet(Bouquet bouquet){
        this.bouquets.add(bouquet);
    }

    @Override
    public String toString() {
        return "PlainCart{" +
                "bouquets=" + bouquets +
                '}';
    }
}


