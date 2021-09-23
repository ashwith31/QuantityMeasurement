package com.quantitymeasurement;

import java.util.Objects;

public class Length {

    private static final double FEET_TO_INCH = 12.0;
    private static final double FEET_TO_YARD = 3.0;
    private static final double INCH_TO_CENTIMETER = 0.4;
    private static final double GALLON_TO_LITER = 3.78;

    private final Unit unit;
    private final double value;

    public enum Unit{ FEET, INCH, YARD, CENTIMETER, GALLON, LITER, MILLILITER};

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static double add(Length value1, Length value2) {
        if (value1.unit.equals(Unit.INCH) && value2.unit.equals(Unit.INCH))
            return value1.value + value2.value;
        if (value1.unit.equals(Unit.FEET) && value2.unit.equals(Unit.INCH))
            return (value1.value * FEET_TO_INCH) + value2.value;
        if (value1.unit.equals(Unit.FEET) && value2.unit.equals(Unit.FEET))
            return (value1.value * FEET_TO_INCH) + (value2.value * FEET_TO_INCH);
        if (value1.unit.equals(Unit.INCH) && value2.unit.equals(Unit.CENTIMETER))
            return value1.value + (value2.value / 2.5);
        return 0;
    }

    public boolean compare(Length that) {
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value ) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH, that.value ) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value*FEET_TO_YARD ) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value, that.value * INCH_TO_CENTIMETER) == 0;
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITER))
            return Double.compare(this.value * GALLON_TO_LITER, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}