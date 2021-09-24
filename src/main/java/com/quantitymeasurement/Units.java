package com.quantitymeasurement;

public enum Units {
    FEET(1.0), FEET_TO_INCH(12.0), INCH(1.0), YARD(36.0),
    CENTIMETER(0.4), LITER(1.0), GALLON(3.79),
    MILLILITER(0.001), KILOGRAM(1.0), GRAMS(0.001),
    TONNE( 1000), CELSIUS(2.12), FAHRENHEIT(1.0);

    private static final double TEMPERATURE_CONSTANT = 32;
    public final double baseUnitConversion;

    Units(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static Double temperatureConversion(double value, Units temperature) {
        if (temperature == Units.FAHRENHEIT)
            return (value - TEMPERATURE_CONSTANT) / Units.CELSIUS.baseUnitConversion;
        return (value * Units.FAHRENHEIT.baseUnitConversion) + TEMPERATURE_CONSTANT;
    }
}
