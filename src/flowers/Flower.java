package flowers;

import flowersProperties.Color;
import flowersProperties.Country;
import flowersProperties.Odor;

import java.util.Random;

public abstract class Flower {
    protected Color color;
    protected double length;
    protected Odor odor;
    protected Country countryOfOrigin;
    protected double price;

    protected static Random rnd = new Random();

    public Flower(Color color, double length, Odor odor, Country countryOfOrigin, double price) {
        this.color = color;
        this.length = length;
        this.odor = odor;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public Odor getOdor() {
        return odor;
    }

    public Country getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setOdor(Odor odor) {
        this.odor = odor;
    }

    public void setCountryOfOrigin(Country countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Color getRandomColor() {
        switch (rnd.nextInt(3)) {
            case 0: return Color.RED;
            case 1: return Color.GREEN;
            case 2: return Color.BLUE;
            default: return Color.RED;
        }
    }

    public static double getRandomLength() {
        return 5 + rnd.nextDouble() * 5;
    }

    public static Odor getRandomOdor() {
        switch (rnd.nextInt(3)) {
            case 0: return Odor.BAD;
            case 1: return Odor.NORMAL;
            case 2: return Odor.GOOD;
            default: return Odor.NORMAL;
        }
    }

    public static Country getRandomCountryOfOrigin() {
        switch (rnd.nextInt(3)) {
            case 0: return Country.UKRAINE;
            case 1: return Country.FRANCE;
            case 2: return Country.NETHERLANDS;
            default: return Country.UKRAINE;
        }
    }

    public static double getRandomPrice() {
        return 20 + rnd.nextDouble() * 50;
    }

}
