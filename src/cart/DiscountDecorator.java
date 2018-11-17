package cart;

abstract class DiscountDecorator implements Cart{
    protected Cart discountCart;
    protected double discount;

    public DiscountDecorator(Cart discountCart, double discount){
        this.discountCart = discountCart;
        this.discount = discount;
    }

}
