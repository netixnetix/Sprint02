package model.service;
import model.Food;
import model.constants.Discount;


public class ShoppingCart {

    protected Food[] ShoppingItemCart;

    public ShoppingCart(Food[] cartItem){
        this.ShoppingItemCart = cartItem;
    }

    public float getTotalPrice(){
        float SummaTotalPrice = 0;
        for (Food food : ShoppingItemCart) {
            SummaTotalPrice += food.getPrice()*food.getAmount();
        }
        return SummaTotalPrice;

    }

    public float getDiscountedPrice(){
        float SummaDiscountedPrice = 0;
        Discount discount = new Discount();
        for (Food food : ShoppingItemCart) {
            SummaDiscountedPrice += discount.getDiscount(food)* food.getAmount();
        }
        return SummaDiscountedPrice;

    }

    public float getVeganPrice(){
        float VeganTotalPrice = 0;
        for (Food food : ShoppingItemCart) {
            if(food.isVegetarian())
                VeganTotalPrice += food.getPrice()*food.getAmount();
        }
        return VeganTotalPrice;
    }

}