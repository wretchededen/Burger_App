package burgerFactoryV3.burgers;

import burgerFactoryV3.components.Bread;
import burgerFactoryV3.components.Patty;

public class Burger {
    Bread bread;
    Patty patty;
    double basePrice = 1.50;

    Burger(Bread b, Patty p){
        this.bread = b;
        this.patty = p;
    }

    public String getBread() {
        return bread.getName();
    }

    public String getPatty() {
        return patty.getName();
    }

    public double getBasePrice() {
        return basePrice;
    }
}
