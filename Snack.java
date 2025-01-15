import java.util.Arrays;

public class Snack {

    // instance variables about snacks
    float price;
    String[] toppings;
    int quantity;
    String name;

    // constructor to make a snack
    public Snack(String name, int quantity, String[] toppings, float price) {
        this.name = name;
        this.quantity = quantity;
        this.toppings = toppings;
        this.price = price;
    }

    public String toString() {
        return "Snack: " + name + " with " + String.join(", ", toppings) + "; " + quantity + " at $" + price;
    }
    public static void main(String[] args) {
        Snack oatmeal = new Snack("oatmeal", 0, new String[]{"brown sugar", "bananas", "cinnamon"}, 0.02f);
        System.out.println(oatmeal);
    }
}