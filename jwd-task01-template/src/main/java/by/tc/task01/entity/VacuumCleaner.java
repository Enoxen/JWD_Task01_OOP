package by.tc.task01.entity;

import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable{
	private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(){}
    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
                         int motorSpeedRegulation, int cleaningWidth){
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;

    }
    @Override
    public void printData(){
        System.out.println("Vacuum Cleaner: Power consumption = " + this.powerConsumption + ", Filter Type = " + this.filterType +
        ", Bag type = " + this.bagType + ", Wand Type = " + this.wandType + ", Motor speed regulation = "
        + this.motorSpeedRegulation + ", Cleaning width = " + this.cleaningWidth);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (motorSpeedRegulation != that.motorSpeedRegulation) return false;
        if (cleaningWidth != that.cleaningWidth) return false;
        if (filterType != null ? !filterType.equals(that.filterType) : that.filterType != null) return false;
        if (bagType != null ? !bagType.equals(that.bagType) : that.bagType != null) return false;
        return wandType != null ? wandType.equals(that.wandType) : that.wandType == null;

    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
        result = 31 * result + (bagType != null ? bagType.hashCode() : 0);
        result = 31 * result + (wandType != null ? wandType.hashCode() : 0);
        result = 31 * result + motorSpeedRegulation;
        result = 31 * result + cleaningWidth;
        return result;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}


