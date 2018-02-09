package edu.ldsbc.assinment3;

public class Sundae extends IceCream {

    int toppingCost;
    String toppingName;

    public Sundae(String name, int cost, String toppingName, int toppingCost) {
        super(name, cost);
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
    }

    @Override
    public int calculateItemCost() {
        return super.calculateItemCost() + toppingCost;
    }

    @Override
    public String toString() {
        return "Sundae{" +
                "toppingCost=" + toppingCost +
                ", toppingName='" + toppingName + '\'' +
                ", cost=" + cost +
                "}\r\n";
    }
}
