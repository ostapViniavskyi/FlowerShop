package flowersCollections;

import flowers.Flower;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public abstract class FlowerList {
    protected List<Flower> flowers;
    protected static Random rnd = new Random();

    public FlowerList() {
        this.flowers = new ArrayList<>();
    }

    public FlowerList(Collection<Flower> initialFlowers){
        this.flowers = new ArrayList<>();
        flowers.addAll(initialFlowers);
    }

    protected int getSize(){
        return flowers.size();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    protected List<Flower> getFlowers() {
        return flowers;
    }

    public double getPrice(){
        double sum = 0;
        for(Flower f: flowers){
            sum += f.getPrice();
        }
        return sum;
    }
}
