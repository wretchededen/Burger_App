package burgerFactoryV3;

import burgerFactoryV3.additions.Chips;
import burgerFactoryV3.additions.Drink;
import burgerFactoryV3.burgers.*;
import burgerFactoryV3.components.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Order {

    String[] menu = new String[]{"Hamburger", "Healthy Burger", "Combo Burger"};
    ArrayList<Burger> burgers;
    Scanner s = new Scanner(System.in);

    Order() {
        String query = "Which menu item would you like? Choose a number: ";
        int i = 0;
        for (String s : menu) {
            i++;
            query += "[" + i + "] " + s;
        }
        System.out.println(query);
        int choice = s.nextInt();
        System.out.println("");
    }

    boolean queryBoolean(String query) {
        boolean isValidChoice = false, result = false;
        Scanner s = new Scanner(System.in);

        while (!isValidChoice) {
            System.out.println(query);
            String response = s.next();
            if (response.equals("Y") || response.equals("N")) {
                result = response.equals("Y");
                isValidChoice = true;
            }
        }
        return result;
    }

    public int queryChoice(Enum choices, int maxOptions) { //TODO: ...


        return 0;
    }
}
