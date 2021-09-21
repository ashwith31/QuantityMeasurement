package com.quantitymeasurement;

public class Length {
    private final Unit unit;
    private final double value;

    public enum Unit {FEET, INCH}

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public double ftToInConversion() {
        return 12*value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}