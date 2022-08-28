/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class InternalCombustion extends Engine {
    private String fuelType;

    public InternalCombustion(String modelNumber, String displacement, int maxPower, int maxRpm, int numberOfCylinder, String fuelType) {
        super(modelNumber, displacement, maxPower, maxRpm, numberOfCylinder);
        this.fuelType = fuelType;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
