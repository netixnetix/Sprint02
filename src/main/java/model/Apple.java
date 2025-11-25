package model;
import model.constants.Colour;

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
}
