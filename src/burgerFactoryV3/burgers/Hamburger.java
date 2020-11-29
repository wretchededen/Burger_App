package burgerFactoryV3.burgers;

import burgerFactoryV3.components.Bread;
import burgerFactoryV3.components.Patty;
import burgerFactoryV3.components.Topping;

import java.util.ArrayList;
import java.util.List;

public class Hamburger extends Burger {

    List<Topping> toppings = new ArrayList<>();
    int maxToppings = 4;

    public Hamburger(Bread b, Patty p) {
        super(b, p);
    }

    public Hamburger(Bread b, Patty p, ArrayList<Topping> t) throws Exception {
        super(b, p);
        if (t.size() > this.maxToppings) throw new Exception("Only " + this.maxToppings + " toppings are allowed on this burger.");
        else {
            this.toppings = t;
        }
    }

    public int getMaxToppings() {
        return maxToppings;
    }

    public String getToppings() throws Exception {
        if (toppings == null || toppings.size() < 1) throw new Exception("There are no toppings on this burger");
        else {
            StringBuilder sb = new StringBuilder();
            for (Topping t : toppings) {
                sb.append(t.getName()).append(", ");
            }
            String res = sb.toString();
            return res.substring(0, res.length() - 2);
        }
    }

    public double getToppingsPrice() {
        if (toppings == null || toppings.size() < 1) return 0;
        else {
            double sum = 0;
            for (Topping t : toppings) {
                sum += t.getPrice();
            }
            return sum;
        }
    }

    public double getTotalPrice() {
        return getToppingsPrice() + getBasePrice();
    }
}