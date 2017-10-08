package by.tc.task01.entity;

import java.io.Serializable;

public class Oven extends Appliance implements Serializable{
	private int powerConsumption;
    private float weight;
    private int capacity;
    private float depth;
    private float height;
    private float width;

    public Oven(){}
    public Oven(int powerConsumption, float weight, int capacity, float  depth, float height, float width){
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

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
