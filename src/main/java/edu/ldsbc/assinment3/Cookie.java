package edu.ldsbc.assinment3;

public class Cookie extends DessertItem {

    int number;
    int pricePerDz;

    public Cookie(String name, int number, int pricePerLb) {
        super(name);
        this.number = number;
        this.pricePerDz = pricePerLb;
    }

    @Override
    public int calculateItemCost() {
        return (number / 12) * pricePerDz;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "number=" + number +
                ", pricePerDz=" + pricePerDz +
                "}\r\n";
    }
}