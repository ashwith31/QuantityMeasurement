package com.quantitymeasurement;

public class QuantityMeasurement {

    private final Units unit;
    private final double value;

    public QuantityMeasurement(Units unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static boolean compare(QuantityMeasurement l1, QuantityMeasurement l2) {
        return Double.compare(l1.getValue() * l1.getUnit().baseUnitConversion, l2.getValue() * l2.getUnit().baseUnitConversion) == 0;
    }

    public static double add(QuantityMeasurement l1, QuantityMeasurement l2) {
        return l1.getValue() * l1.getUnit().baseUnitConversion + l2.getValue() * l2.getUnit().baseUnitConversion;
    }

    public Double unitConversion(double value, Units temperature) {
        return Units.temperatureConversion(value, temperature);
    }

    public Units getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}