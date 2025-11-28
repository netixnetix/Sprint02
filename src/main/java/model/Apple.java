package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String color;

    public Apple(int amount, float price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    public boolean isRed() {
        if (this.color == Colour.RED) {
            return true;
        }
        return false;
    }

    @Override
    public float getDiscount() {
        if (isRed()) {
            return Discount.APPLE_RED_DISCOUNT; // скидка 60%
        }
        return model.constants.Discount.DEFAULT; // без скидки
    }
}