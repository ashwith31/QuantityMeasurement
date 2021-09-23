package com.quantitymeasurement;

    public enum Units {
        FEET(1.0), FEET_TO_INCH(12.0), INCH(1.0), YARD_TO_INCH(36.0),
        CENTIMETER_TO_INCH(0.4), LITER(1.0), GALLON_TO_LITRE(3.78),
        MILLILITER_TO_LITRE(0.001);

        public final double baseUnitConversion;

        Units(double baseUnitConversion) {
            this.baseUnitConversion = baseUnitConversion;
        }


    }
