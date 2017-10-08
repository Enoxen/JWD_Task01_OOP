package by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable{
	private int batteryCapacity;
    private float displayInches;
    private int memoryRom;
    private int flashMemoryCap;
    private String color;

    public TabletPC(){}
    public TabletPC(int batteryCapacity, float displayInches, int memoryRom, int flashMemoryCap, String color){
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCap = flashMemoryCap;
        this.color = color;
    }
    @Override
    public void printData(){
        System.out.println("Tablet PC: Battery capacity = " + this.batteryCapacity + ", Display inches = " +
        this.displayInches + ", Memory rom = " + this.memoryRom + " Flash memory capacity " + this.flashMemoryCap
        + ", Color = " + this.color);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCap() {
        return flashMemoryCap;
    }

    public void setFlashMemoryCap(int flashMemoryCap) {
        this.flashMemoryCap = flashMemoryCap;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
