package by.tc.task01.entity;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable{
    private int powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator(){}
    public Refrigerator(int powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height,
                        double width){
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }
    @Override
    public void printData(){
        System.out.println("Refrigerator: Power Consumption = " + this.powerConsumption + ", Weight = " + this.weight
         + ", Freezer capacity = " + this.freezerCapacity + ", Overall capacity = " + this.overallCapacity +
        ", Height = " + this.height + ", Width = " + this.width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;

        Refrigerator that = (Refrigerator) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.freezerCapacity, freezerCapacity) != 0) return false;
        if (Double.compare(that.overallCapacity, overallCapacity) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        return Double.compare(that.width, width) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = powerConsumption;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(freezerCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(overallCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
