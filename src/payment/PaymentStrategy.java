package payment;

import cart.Cart;

public interface PaymentStrategy {
    void pay(Cart cart);
}
