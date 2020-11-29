package burgerFactoryV3;

import burgerFactoryV3.burgers.Burger;
import burgerFactoryV3.components.Topping;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        /*Burger borg1 = new Hamburger(Bread.WHOLEGRAIN, Patty.BEYOND_MEAT);
        Hamburger borg2 = new HealthyBurger(Bread.NAAN, Patty.LENTIL,
                new ArrayList<>(Arrays.asList(Topping.CHEESE, Topping.LETTUCE, Topping.TOMATO, Topping.LETTUCE, Topping.LETTUCE, Topping.LETTUCE)));
        ComboBurger combo = new ComboBurger(Bread.WHITE, Patty.IMPOSSIBLE, Chips.CHEESEFRIES, Drink.VODKA);

        System.out.println(borg1.getBread() +" " + borg1.getPatty());

        System.out.println(borg2.getBread());
        System.out.println(borg2.getPatty());
        System.out.println("Max toppings allowed: " + borg2.getMaxToppings());
        System.out.println(borg2.getToppings());
        System.out.println("Total Price: " + new DecimalFormat("##.###").format(borg2.getTotalPrice()) + " Euros");

        System.out.println("Combo: " + combo.getBread() + " and " + combo.getPatty() +
                " with " + combo.getDrink() + " and " + combo.getChips() + ": " + combo.getTotalPrice());*/

        boolean wantsToOrder = false;

        do {
            boolean response = queryBoolean("Would you like to make a new order? (Y/N)");
            if (response) {
                Order asd = new Order();
                wantsToOrder = true;
            }
        }
        while (wantsToOrder);
        System.out.println("Thank you for stopping by!");
        System.exit(-1);

    }

    static boolean queryBoolean(String query) {
        boolean isValidChoice = false, result = false;
        Scanner s = new Scanner(System.in);

        while (!isValidChoice) {
            System.out.println(query);
            String response = s.next();
            if (response.equals("Y") || response.equals("N")) {
                result = response.equals("Y");
                isValidChoice = true;
            }
            System.out.println("Input must be a Y or an N!");
        }
        return result;
    }
}
