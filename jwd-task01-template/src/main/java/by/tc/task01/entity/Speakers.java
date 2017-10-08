package by.tc.task01.entity;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable{
	private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private float cordLength;

    public Speakers(){}
    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, float cordLength){
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }
    @Override
    public void printData(){
        System.out.println("Speakers: Power consumption = " + this.powerConsumption + ", Number of speakers = "
        + this.numberOfSpeakers + ", Frequency range = " + this.frequencyRange + ", Cord length = " + this.cordLength);
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public float getCordLength() {
        return cordLength;
    }

    public void setCordLength(float cordLength) {
        this.cordLength = cordLength;
    }
}
