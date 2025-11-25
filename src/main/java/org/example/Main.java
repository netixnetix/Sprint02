package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10,50, Colour.RED);
        Apple greenApple = new Apple(8, 60,Colour.GREEN);
        Food[] ProductCart = new Food[] { meat, redApple, greenApple };
        ShoppingCart shoppingCart = new ShoppingCart(ProductCart);

        System.out.println("Общая сумма без скидки: " + shoppingCart.getTotalPrice());
        System.out.println("Стоимость со скидками: " + shoppingCart.getDiscountedPrice());
        System.out.println("Вегетарианская цена: " + shoppingCart.getVeganPrice());
    }

    }

