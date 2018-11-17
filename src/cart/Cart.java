package cart;

import flowersCollections.Bouquet;

import java.util.List;

public interface Cart {

    double getPrice();
    void addBouquet(Bouquet bouquet);

}
