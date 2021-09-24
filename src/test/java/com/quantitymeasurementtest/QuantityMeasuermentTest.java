package com.quantitymeasurementtest;

import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.Units;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasuermentTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Units.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Units.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Units.FEET, 0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFeetFromSameRef_ifEqual_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 0.0);
        boolean result = feet1 == feet1;
        Assertions.assertTrue(result);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual(){
        QuantityMeasurement feet = new QuantityMeasurement(Units.FEET_TO_INCH, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Units.INCH,12.0);
        boolean check = feet.compare(feet, inch);
        Assertions.assertTrue(check);
    }

    @Test
    public void given2Feetand12Inch_WhenCompared_ShouldReturnNotEqual(){
        QuantityMeasurement feet = new QuantityMeasurement(Units.FEET, 2.0);
        QuantityMeasurement inch = new QuantityMeasurement(Units.INCH,12.0);
        Assertions.assertNotEquals(feet,inch);
    }

    @Test
    void givenDifferentType_ifNotEquals_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 0.0);
        boolean newfeet = true;
        Assertions.assertNotEquals(feet1, newfeet);
    }

    @Test
    void givensameType_ifEquals_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Units.FEET, 0.0);
        Assertions.assertEquals(feet2, feet1);
    }

    @Test
    public void givenFeetofSameValue_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Units.FEET, 1.0);
        Assertions.assertEquals(feet2, feet1);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Units.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Units.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Units.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenInchFromSameRef_ifEqual_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 0.0);
        boolean result = inch1 == inch1;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchandDifferentType_ifNotEquals_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 0.0);
        boolean newinch = true;
        Assertions.assertNotEquals(inch1, newinch);
    }

    @Test
    void givensameInchType_ifEquals_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Units.INCH, 0.0);
        Assertions.assertEquals(inch2, inch1);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET_TO_INCH,3.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD, 1.0);
        boolean check = feet1.compare(feet1, yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET,1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD, 1.0);
        boolean check = feet1.compare(feet1, yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH,1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD, 1.0);
        boolean check = inch1.compare(inch1, yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given5InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH,5.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD, 1.0);
        boolean check = inch1.compare(inch1, yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1YardAnd5Inch_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement yard = new QuantityMeasurement(Units.YARD,1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Units.INCH, 5.0);
        boolean check = yard.compare(yard, inch);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1YardAnd5Feet_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD,1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 5.0);
        boolean check = yard1.compare(yard1, feet1);
        Assertions.assertFalse(check);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET_TO_INCH,3.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD, 1.0);
        boolean check = feet1.compare(feet1, yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH,36.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD, 1.0);
        boolean check = inch1.compare(inch1, yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD,1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 36.0);
        boolean check = yard1.compare(yard1, inch1);
        Assertions.assertTrue(check);
    }
    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Units.YARD,1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET, 36.0);
        boolean check = yard1.compare(yard1, feet1);
        Assertions.assertTrue(check);
    }


    @Test
    public void given2Inchand5Centimeter_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Units.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Units.CENTIMETER, 5.0);
        boolean check = inch.compare(inch, centimeter);
        Assertions.assertTrue(check);
    }

    @Test
    public void given2Inchand6Inch_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Units.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Units.CENTIMETER, 6.0);
        boolean check = inch.compare(inch, centimeter);
        Assertions.assertFalse(check);
    }

    @Test
    public void givenTwoInches_WhenAdded_ShouldReturnSumInInch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 2);
        QuantityMeasurement inch2 = new QuantityMeasurement(Units.INCH, 2);
        double sum = QuantityMeasurement.add(inch1, inch2);
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void givenFeetAndInches_WhenAdded_ShouldReturnSumInInch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.FEET_TO_INCH, 1);
        QuantityMeasurement inch2 = new QuantityMeasurement(Units.INCH, 2);
        double sum = QuantityMeasurement.add(inch1, inch2);
        Assertions.assertEquals(14, sum);
    }

    @Test
    public void givenTwoFeet_WhenAdded_ShouldReturnSumInInch() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Units.FEET_TO_INCH, 1);
        QuantityMeasurement feet2 = new QuantityMeasurement(Units.FEET_TO_INCH, 1);
        double sum = QuantityMeasurement.add(feet1, feet2);
        Assertions.assertEquals(24, sum);
    }

    @Test
    public void givenInchAndCentimeter_WhenAdded_ShouldReturnSumInInch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Units.INCH, 2);
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Units.CENTIMETER, 2.5);
        double sum = QuantityMeasurement.add(inch1, centimeter1);
        Assertions.assertEquals(3, sum);
    }

    @Test
    public void given0Gallonand0Gallon_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement length1 = new QuantityMeasurement(Units.GALLON, 0.0);
        QuantityMeasurement length2 = new QuantityMeasurement(Units.GALLON, 0.0);
        Assertions.assertEquals(length1, length2);
    }

    @Test
    void given1GallonAnd3And78Litres_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement gallon = new QuantityMeasurement(Units.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Units.LITER, 3.79);
        boolean check = gallon.compare(gallon, litre);
        Assertions.assertTrue(check);
    }

    @Test
    void given1LitreAnd3And1000Ml_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement litre = new QuantityMeasurement(Units.LITER, 1);
        QuantityMeasurement milliMeter = new QuantityMeasurement(Units.MILLILITER, 1000.0);
        boolean check = litre.compare(litre, milliMeter);
        Assertions.assertTrue(check);
    }

    @Test
    void given2GallonAnd3And78Litres_WhenAdded_ShouldReturn7point57Litres() {
        QuantityMeasurement gallon = new QuantityMeasurement(Units.GALLON, 1.0);
        QuantityMeasurement litres = new QuantityMeasurement(Units.LITER, 3.78);
        double add = gallon.add(gallon, litres);
        Assertions.assertEquals(add,7.57);
    }

    @Test
    void given1MilliLitreAnd1Liter_WhenAdded_ShouldReturn2Litres() {
        QuantityMeasurement litre = new QuantityMeasurement(Units.LITER, 1);
        QuantityMeasurement millilitre = new QuantityMeasurement(Units.MILLILITER, 1000.0);
        double add = litre.add(litre, millilitre);
        Assertions.assertEquals(add,2);
    }

    @Test
    void given1KgAnd100Grams_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Units.KILOGRAM, 1);
        QuantityMeasurement gram = new QuantityMeasurement(Units.GRAMS, 1000.0);
        boolean check = kilogram.compare(kilogram, gram);
        Assertions.assertTrue(check);
    }

    @Test
    void given1TonneAnd1000Kg_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement tonne = new QuantityMeasurement(Units.TONNE, 1.0);
        QuantityMeasurement kilogram = new QuantityMeasurement(Units.KILOGRAM, 1000.0);
        boolean check = tonne.compare(tonne, kilogram);
        Assertions.assertTrue(check);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement fah = new QuantityMeasurement(Units.FAHRENHEIT, 212.0);
        QuantityMeasurement cel = new QuantityMeasurement(Units.CELSIUS, 100.0);
        boolean check = QuantityMeasurement.compare(fah,cel);
        Assertions.assertTrue(check);
    }
}
