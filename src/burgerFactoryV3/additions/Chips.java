package burgerFactoryV3.additions;

public enum Chips {
    FRIES ("Fries"),
    CHEESEFRIES ("Cheese Fries"),
    POTATOWEDGES ("Potato Wedges"),
    GARLICBREAD ("Garlic Bread");

    final String name;

    Chips(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
