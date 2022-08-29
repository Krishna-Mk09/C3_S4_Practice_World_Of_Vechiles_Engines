/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

/**
 * The Engine class is a blueprint for creating objects that store information about an engine
 */
public class Engine {
    private String modelNumber;
    private String displacement;
    private int maxPower;
    private int maxRpm;
    private int NumberOfCylinder;

    public Engine() {
    }

    // This is a constructor.
    public Engine(String modelNumber, String displacement, int maxPower, int maxRpm, int numberOfCylinder) {
        this.modelNumber = modelNumber;
        this.displacement = displacement;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
        NumberOfCylinder = numberOfCylinder;


    }

    // This is called getter and setter methods.
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public int getNumberOfCylinder() {
        return NumberOfCylinder;
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        NumberOfCylinder = numberOfCylinder;
    }

    /**
     * The toString() method returns a string representation of the object
     *
     * @return The toString method is being returned.
     */
    @Override
    public String toString() {
        return "Engine{" +
                "modelNumber='" + modelNumber + '\'' +
                ", displacement='" + displacement + '\'' +
                ", maxPower=" + maxPower +
                ", maxRpm=" + maxRpm +
                ", NumberOfCylinder=" + NumberOfCylinder +
                '}';
    }
}
