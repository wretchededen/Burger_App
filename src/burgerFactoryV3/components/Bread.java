package burgerFactoryV3.components;

public enum Bread {
    BRIOCHE("Brioche"),
    CIABATTA("Ciabatta"),
    NAAN("Naan"),
    WHITE("White"),
    WHOLEGRAIN("Wholegrain");

    final String name;

    Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

