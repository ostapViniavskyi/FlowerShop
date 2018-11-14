package flowersCollections;

import flowers.Chamomile;
import flowers.Flower;
import flowers.Rose;
import flowers.Tulip;

import java.util.ArrayList;
import java.util.List;

public class Bouquet extends FlowerList {
    public Bouquet() {
        super();
    }

    public Bouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet getRandomBouquet(){
        int size = rnd.nextInt(10) + 5;
        List<Flower> flowers = new ArrayList<>();

        for (int i = 0; i < size ; i++) {
            int flowerType = rnd.nextInt(3);

            switch (flowerType) {
                case 0: flowers.add(Rose.getRandomFlower()); break;
                case 1: flowers.add(Chamomile.getRandomFlower()); break;
                case 2: flowers.add(Tulip.getRandomFlower()); break;
            }
        }
        return new Bouquet(flowers);
    }

    public static Bouquet getCustomBouquet(int numRoses, int numTulips, int numChamomomiles){
        Bouquet bq = new Bouquet();
        for (int i = 0; i < numRoses; i++) {
            bq.addFlower(Rose.getRandomFlower());
        }
        for (int i = 0; i < numTulips; i++) {
            bq.addFlower(Tulip.getRandomFlower());
        }
        for (int i = 0; i < numChamomomiles; i++) {
            bq.addFlower(Chamomile.getRandomFlower());
        }
        return bq;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }

    public static void main(String[] args) {
        Bouquet boq = getRandomBouquet();
        System.out.println(boq);
        System.out.println(boq.getPrice());
    }
}
