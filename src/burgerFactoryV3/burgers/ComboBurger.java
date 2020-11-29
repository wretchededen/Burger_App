package burgerFactoryV3.burgers;

import burgerFactoryV3.components.Bread;
import burgerFactoryV3.components.Patty;
import burgerFactoryV3.additions.*;

public class ComboBurger extends Burger {

    Chips chips;
    Drink drink;
    double additionsPrice = 1.40; // chips = 0.5, drink = 0.9

    public ComboBurger(Bread b, Patty p, Chips c, Drink d) {
        super(b, p);
        this.chips = c;
        this.drink = d;
    }

    public String getChips() {
        return chips.getName();
    }

    public String getDrink() {
        return drink.getName();
    }

    public double getTotalPrice() {
        return additionsPrice + getBasePrice();
    }
}
