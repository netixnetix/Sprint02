package model.constants;

import model.Apple;
import model.Discountable;
import model.Food;

public class Discount implements Discountable {
    @Override
    public float getDiscount(Food foods) {
        if(foods.isVegetarian()){
            Apple apple = (Apple) foods;
            if (apple.isRed()){
                return (float) (apple.getPrice() * 0.4);
            }
        }
        return foods.getPrice();
    }
}
