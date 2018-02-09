package edu.ldsbc.assinment3;

public class IceCream extends DessertItem {

    int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int calculateItemCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "cost=" + cost +
                "}\r\n";
    }
}