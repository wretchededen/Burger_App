package burgerFactoryV3;

import burgerFactoryV3.burgers.HealthyBurger;
import burgerFactoryV3.components.Bread;
import burgerFactoryV3.components.Patty;
import burgerFactoryV3.components.Topping;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class HealthyBurgerTest {

    @Test
    public void getToppings_hasToppings() throws Exception {
        HealthyBurger borg = new HealthyBurger(Bread.CIABATTA, Patty.BEYOND_MEAT,
                new ArrayList<>(Arrays.asList(Topping.LETTUCE, Topping.GUACAMOLE,
                        Topping.BACON, Topping.TOMATO)));
        Assert.assertEquals("Lettuce, Guacamole, Bacon, Tomato", borg.getToppings());
    }

    @Test(expected = Exception.class)
    public void getToppings_hasNoToppings() throws Exception {
        HealthyBurger borg = new HealthyBurger(Bread.NAAN, Patty.LENTIL);

        borg.getToppings();
    }

    @Test(expected = Exception.class)
    public void getToppings_hasTooManyToppings() throws Exception {
        HealthyBurger borg = new HealthyBurger(Bread.NAAN, Patty.LENTIL,
                new ArrayList<>(Arrays.asList(Topping.LETTUCE, Topping.GUACAMOLE,
                        Topping.BACON, Topping.TOMATO,Topping.KETCHUP, Topping.CHEESE, Topping.MAYO)));

        borg.getToppings();
    }

    @Test
    public void getToppingsPrice_hasToppings() throws Exception {
        HealthyBurger borg = new HealthyBurger(Bread.CIABATTA, Patty.BEYOND_MEAT,
                new ArrayList<>(Arrays.asList(Topping.LETTUCE, Topping.GUACAMOLE,
                        Topping.BACON, Topping.TOMATO)));
        double d = 0;

        Assert.assertNotEquals(d, borg.getToppingsPrice());
    }

    @Test
    public void getToppingsPrice_noToppings() throws Exception {
        HealthyBurger borg = new HealthyBurger(Bread.NAAN, Patty.LENTIL);

        Assert.assertEquals(0, (int) borg.getToppingsPrice() * 100);
    }

}