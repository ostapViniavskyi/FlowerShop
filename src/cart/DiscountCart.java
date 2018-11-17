package cart;

import flowersCollections.Bouquet;

public class DiscountCart extends DiscountDecorator{
    public DiscountCart(Cart discountCart, double discount){
        super(discountCart, discount);
    }

    @Override
    public double getPrice() {
        return discountCart.getPrice() * (1 - discount);
    }

    @Override
    public void addBouquet(Bouquet bouquet){
        this.discountCart.addBouquet(bouquet);
    }

    public static void main(String[] args) {
        Cart pc = new PlainCart();
        Bouquet b = Bouquet.getRandomBouquet();
        pc.addBouquet(b);
        System.out.println(pc.getPrice());
        Cart dc = new DiscountCart(pc, 0.5);
        System.out.println(dc.getPrice());
        Cart ddc = new DiscountCart(dc, 0.5);
        System.out.println(ddc.getPrice());
    }
}
