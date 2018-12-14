import cart.Cart;
import cart.DiscountCart;
import cart.PlainCart;
import flowersCollections.Bouquet;
import payment.CardPayment;
import payment.CashPayment;
import payment.PaymentStrategy;

// class for showing capabilities of flower shop
public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.println("Initial number of bouquets: " + storage.numberOfBouquets());

        // discount cart decorator demo
        Cart cart = new PlainCart();
        cart.addBouquet(Bouquet.getCustomBouquet(10, 45, 42));
        System.out.println("The price of flowers in the cart w/o discount : " + cart.getPrice());
        Cart cartWithDiscount = new DiscountCart(cart, 0.3);
        System.out.println("The price of flowers with discount: " + cartWithDiscount.getPrice());

        // payment strategy demo
        PaymentStrategy inCash = new CashPayment();
        inCash.pay(cart);
        System.out.println();
        PaymentStrategy withCard = new CardPayment();
        withCard.pay(cartWithDiscount);
    }
}
