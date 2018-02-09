package edu.ldsbc.assinment3;

public class Candy extends DessertItem {

    private double wight;
    private double costPerLb;

    public Candy(String name, double wight, double costPerLb) {
        super(name);
        this.wight = wight;
        this.costPerLb = costPerLb;
    }

    @Override
    public int calculateItemCost(){
        return (int) (wight * costPerLb);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "wight=" + wight +
                ", costPerLb=" + costPerLb +
                "\r\n}";
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getCostPerLb() {
        return costPerLb;
    }

    public void setCostPerLb(double costPerLb) {
        this.costPerLb = costPerLb;
    }
}
