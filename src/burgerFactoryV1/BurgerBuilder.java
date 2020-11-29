package burgerFactoryV1;

import java.util.Arrays;

public class BurgerBuilder {
    public static void main(String[] args) {
        Burger b1 = new Burger("White","Vegan Patty");
        System.out.println(b1.getToppings());

        Burger b2 = new Burger("Wholegrain","Vegan Patty", Arrays.asList("Lettuce", "Guacamole", "Bacon", "Tomato"));
        System.out.println(b2.getToppings());
    }
}
