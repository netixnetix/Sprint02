package model;

public abstract class Food {
    private boolean isVegetarian;
    private int amount;
    private float price;

    public Food(int amount, float price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;

    }

    public boolean isVegetarian(){
        return this.isVegetarian;
    }

    public int getAmount(){
        return this.amount;
    }

    public float getPrice(){
        return this.price;
    }

}
