package burgerFactoryV3.components;

public enum Patty {
    BLACK_ANGUS("Black Angus"),
    KOBE_BEEF("Kobe beef"),
    LENTIL("Lentil"),
    BEYOND_MEAT ("Beyond Meat"),
    IMPOSSIBLE ("Impossible");

    final String name;

    Patty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
