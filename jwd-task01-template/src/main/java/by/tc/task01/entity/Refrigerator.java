package by.tc.task01.entity;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable{
    private int powerConsumption;
    private float weight;
    private float freezerCapacity;
    private float overallCapacity;
    private float height;
    private float width;

    public Refrigerator(){}
    public Refrigerator(int powerConsumption, float weight, float freezerCapacity, float overallCapacity, float height,
                        float width){
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
        if (Float.compare(that.weight, weight) != 0) return false;
        if (Float.compare(that.freezerCapacity, freezerCapacity) != 0) return false;
        if (Float.compare(that.overallCapacity, overallCapacity) != 0) return false;
        if (Float.compare(that.height, height) != 0) return false;
        return Float.compare(that.width, width) == 0;

    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (freezerCapacity != +0.0f ? Float.floatToIntBits(freezerCapacity) : 0);
        result = 31 * result + (overallCapacity != +0.0f ? Float.floatToIntBits(overallCapacity) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        result = 31 * result + (width != +0.0f ? Float.floatToIntBits(width) : 0);
        return result;
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

    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
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
