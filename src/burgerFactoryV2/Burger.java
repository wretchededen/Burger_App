package burgerFactoryV2;

import java.util.Scanner;

public class Burger {
    String patty, bun;
    enum Buns {
        WHOLEGRAIN, WHITE, BRIOCHE, CIABATTA
    }
    enum Patties {
        ASD,DSA,SDA,SAD
    }
    double price = 1.80;

    Burger(){
        Scanner input = new Scanner(System.in);

    };

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }
}
