package payment;

import cart.Cart;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(Cart cart){
        System.out.printf("Paying %.2f with credit card...", cart.getPrice());
    }
}
