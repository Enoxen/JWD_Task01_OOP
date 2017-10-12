package by.tc.task01.entity;

import java.io.Serializable;

public class Oven extends Appliance implements Serializable{
	private int powerConsumption;
    private double weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(){}
    public Oven(int powerConsumption, double weight, int capacity, double depth, double height, double width){
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
    @Override
    public void printData(){
        System.out.println("Oven: Power Consumption = " + this.powerConsumption + ", Weight = " + this.weight +
        ", Capacity = " + this.capacity + ", Depth = " + this.depth + ", Height = " + this.height +
        ", Width = " + this.width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;

        Oven oven = (Oven) o;

        if (powerConsumption != oven.powerConsumption) return false;
        if (Double.compare(oven.weight, weight) != 0) return false;
        if (capacity != oven.capacity) return false;
        if (Double.compare(oven.depth, depth) != 0) return false;
        if (Double.compare(oven.height, height) != 0) return false;
        return Double.compare(oven.width, width) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = powerConsumption;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + capacity;
        temp = Double.doubleToLongBits(depth);
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
