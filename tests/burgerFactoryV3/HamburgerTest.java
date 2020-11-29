package burgerFactoryV3;

import burgerFactoryV3.burgers.*;
import burgerFactoryV3.components.*;
import burgerFactoryV3.additions.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HamburgerTest {

    @Test
    public void getToppings_hasToppings() throws Exception {
        Hamburger borg = new Hamburger(Bread.CIABATTA, Patty.BEYOND_MEAT,
                new ArrayList<>(Arrays.asList(Topping.LETTUCE, Topping.GUACAMOLE,
                        Topping.BACON, Topping.TOMATO)));
        Assert.assertEquals("Lettuce, Guacamole, Bacon, Tomato", borg.getToppings());
    }

    @Test(expected = Exception.class)
    public void getToppings_hasNoToppings() throws Exception {
        Hamburger borg = new Hamburger(Bread.NAAN, Patty.LENTIL);

        borg.getToppings();
    }

    @Test(expected = Exception.class)
    public void getToppings_hasTooManyToppings() throws Exception {
        Hamburger borg = new Hamburger(Bread.NAAN, Patty.LENTIL,
                new ArrayList<>(Arrays.asList(Topping.LETTUCE, Topping.GUACAMOLE,
                        Topping.BACON, Topping.TOMATO, Topping.CHEESE, Topping.MAYO)));

        borg.getToppings();
    }

    @Test
    public void getToppingsPrice_hasToppings() throws Exception {
        Hamburger borg = new Hamburger(Bread.CIABATTA, Patty.BEYOND_MEAT,
                new ArrayList<>(Arrays.asList(Topping.LETTUCE, Topping.GUACAMOLE,
                        Topping.BACON, Topping.TOMATO)));
        double d = 0;

        Assert.assertNotEquals(d, borg.getToppingsPrice());
    }

    @Test
    public void getToppingsPrice_noToppings() throws Exception {
        Hamburger borg = new Hamburger(Bread.NAAN, Patty.LENTIL);

        Assert.assertEquals(0, (int) borg.getToppingsPrice() * 100);
    }
}