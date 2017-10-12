package by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable{
	private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int flashMemoryCap;
    private String color;

    public TabletPC(){}
    public TabletPC(int batteryCapacity, double displayInches, int memoryRom, int flashMemoryCap, String color){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (batteryCapacity != tabletPC.batteryCapacity) return false;
        if (Double.compare(tabletPC.displayInches, displayInches) != 0) return false;
        if (memoryRom != tabletPC.memoryRom) return false;
        if (flashMemoryCap != tabletPC.flashMemoryCap) return false;
        return color != null ? color.equals(tabletPC.color) : tabletPC.color == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = batteryCapacity;
        temp = Double.doubleToLongBits(displayInches);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + memoryRom;
        result = 31 * result + flashMemoryCap;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
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
