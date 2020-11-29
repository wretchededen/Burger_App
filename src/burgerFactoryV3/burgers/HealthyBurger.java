package burgerFactoryV3.burgers;

import burgerFactoryV3.components.Bread;
import burgerFactoryV3.components.Patty;
import burgerFactoryV3.components.Topping;

import java.util.ArrayList;

public class HealthyBurger extends Hamburger {

    int maxToppings = 6;

    public HealthyBurger(Bread b, Patty p) {
        super(b, p);
    }

    public HealthyBurger(Bread b, Patty p, ArrayList<Topping> t) throws Exception{
        super(b, p);
        if (t.size() > maxToppings) throw new Exception("Only " + maxToppings + " toppings are allowed on this burger.");
        else {
            super.toppings = t;
        }
        super.maxToppings = this.maxToppings;
    }

}
