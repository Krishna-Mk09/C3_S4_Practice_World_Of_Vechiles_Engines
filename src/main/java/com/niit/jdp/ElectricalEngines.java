/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class ElectricalEngines extends Engine {
    private final int voltage;

    public ElectricalEngines(String modelNumber, String displacement, int maxPower, int maxRpm, int numberOfCylinder, int voltage) {
        super(modelNumber, displacement, maxPower, maxRpm, numberOfCylinder);
        this.voltage = voltage;
    }
}
