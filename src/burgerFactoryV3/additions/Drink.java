package burgerFactoryV3.additions;

public enum Drink {
    COKE ("Coke"),
    SPRITE ("Sprite"),
    FANTA ("Fanta"),
    WATER ("Water"),
    GREENTEA ("Green Tea"),
    BLACKTEA ("Black Tea"),
    VODKA ("Vodka");

    final String name;

    Drink(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
