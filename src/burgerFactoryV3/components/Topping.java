package burgerFactoryV3.components;

public enum Topping {
    LETTUCE("Lettuce",0.3),
    GUACAMOLE ("Guacamole",0.25),
    BACON ("Bacon",0.4),
    TOMATO ("Tomato",0.3),
    CHEESE ("Cheese", 0.4),
    KETCHUP ("Ketchup", 0.25),
    MAYO ("Mayonnaise",0.25);

    final String name;
    final double price;

    Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
