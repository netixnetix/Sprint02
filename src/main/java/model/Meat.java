package model;

public class Meat extends Food {

    public Meat(int amount, float price) {
        super(amount, price, false);
    }

    @Override
    public float getDiscount() {
        return model.constants.Discount.DEFAULT;
    }
}