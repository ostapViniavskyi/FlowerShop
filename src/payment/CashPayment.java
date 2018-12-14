package payment;

import cart.Cart;

public class CashPayment implements PaymentStrategy {
    public void pay(Cart cart){
        System.out.printf("Paying %.2f in cash...", cart.getPrice());
    }
}
