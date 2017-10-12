package by.tc.task01.entity;


import java.io.Serializable;

public class Laptop extends Appliance implements Serializable{
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private float displayInches;

    public Laptop(){}
    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory,double cpu, float displayInches ){
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    @Override
    public void printData(){
        System.out.println("Laptop: Battery capacity= " + this.batteryCapacity + ", OS= " + this.os + ", Memory rom= "
        + this.memoryRom + ", System Memory= " + this.systemMemory + ", Display Inches= " + this.displayInches +
        " CPU = " + this.cpu);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (memoryRom != laptop.memoryRom) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (Float.compare(laptop.displayInches, displayInches) != 0) return false;
        return os != null ? os.equals(laptop.os) : laptop.os == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + memoryRom;
        result = 31 * result + systemMemory;
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (displayInches != +0.0f ? Float.floatToIntBits(displayInches) : 0);
        return result;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
    }
}
