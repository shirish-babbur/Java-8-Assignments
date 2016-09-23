package org.webonise.appleinformationprovider;

public class Apple {
    private final String color;
    private final int weight;

    public Apple(final String color, final int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple color:" + color + "\t weight:" + weight;
    }
}
