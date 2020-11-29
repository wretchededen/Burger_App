package burgerFactoryV1;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    String bread;
    String patty;
    double burgerPrice = 2.40;
    double toppingPrice = 0.60;
    int allowedToppings = 4;
    List<String> toppings = new ArrayList<>();

    Burger(String b, String p){
        bread = b;
        patty = p;
}

    Burger(String b, String p, List<String> t){
        bread = b;
        patty = p;
        for (String s:t) {
            if (s != null) {
                toppings.add(s);
            }
        }
    }

    public String getBread() {
        return bread;
    }

    public String getPatty() {
        return patty;
    }

    public String getToppings() {
        if (toppings == null || toppings.size() == 0){
            return "There are no toppings on this burger.";
        }
        return "This burger has the following toppings on it: " + toppings.toString() + ".";
    }

    public double getTotalPrice() {
        return burgerPrice + (toppings.size() * toppingPrice);
    }
}
