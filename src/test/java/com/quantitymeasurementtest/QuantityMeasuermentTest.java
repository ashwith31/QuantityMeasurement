package com.quantitymeasurementtest;

import com.quantitymeasurement.Length;
import com.quantitymeasurement.Units;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasuermentTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length feet2 = new Length(Units.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length feet2 = new Length(Units.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length feet2 = new Length(Units.FEET, 0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFeetFromSameRef_ifEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Units.FEET, 0.0);
        boolean result = feet1 == feet1;
        Assertions.assertTrue(result);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual(){
        Length feet = new Length(Units.FEET_TO_INCH, 1.0);
        Length inch = new Length(Units.INCH,12.0);
        boolean check = feet.compare(feet, inch);
        Assertions.assertTrue(check);
    }

    @Test
    public void given2Feetand12Inch_WhenCompared_ShouldReturnNotEqual(){
        Length feet = new Length(Units.FEET, 2.0);
        Length inch = new Length(Units.INCH,12.0);
        Assertions.assertNotEquals(feet,inch);
    }

    @Test
    void givenDifferentType_ifNotEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Units.FEET, 0.0);
        boolean newfeet = true;
        Assertions.assertNotEquals(feet1, newfeet);
    }

    @Test
    void givensameType_ifEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length feet2 = new Length(Units.FEET, 0.0);
        Assertions.assertEquals(feet2, feet1);
    }

    @Test
    public void givenFeetofSameValue_ShouldReturnEqual() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Length feet2 = new Length(Units.FEET, 1.0);
        Assertions.assertEquals(feet2, feet1);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Units.INCH, 0.0);
        Length inch2 = new Length(Units.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Units.INCH, 0.0);
        Length inch2 = new Length(Units.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Length inch1 = new Length(Units.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length inch1 = new Length(Units.INCH, 0.0);
        Length inch2 = new Length(Units.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenInchFromSameRef_ifEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Units.INCH, 0.0);
        boolean result = inch1 == inch1;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchandDifferentType_ifNotEquals_ShouldReturnTrue() {
        Length inch1 = new Length(Units.INCH, 0.0);
        boolean newinch = true;
        Assertions.assertNotEquals(inch1, newinch);
    }

    @Test
    void givensameInchType_ifEquals_ShouldReturnTrue() {
        Length inch1 = new Length(Units.INCH, 0.0);
        Length inch2 = new Length(Units.INCH, 0.0);
        Assertions.assertEquals(inch2, inch1);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Units.FEET_TO_INCH,3.0);
        Length yard1 = new Length(Units.YARD_TO_INCH, 1.0);
        boolean check = feet1.compare(feet1, yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Units.FEET,1.0);
        Length yard1 = new Length(Units.YARD_TO_INCH, 1.0);
        boolean check = feet1.compare(feet1, yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Units.INCH,1.0);
        Length yard1 = new Length(Units.YARD_TO_INCH, 1.0);
        boolean check = inch1.compare(inch1, yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given5InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Units.INCH,5.0);
        Length yard1 = new Length(Units.YARD_TO_INCH, 1.0);
        boolean check = inch1.compare(inch1, yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1YardAnd5Inch_WhenCompared_ShouldReturnNotEqual() {
        Length yard = new Length(Units.YARD_TO_INCH,1.0);
        Length inch = new Length(Units.INCH, 5.0);
        boolean check = yard.compare(yard, inch);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1YardAnd5Feet_WhenCompared_ShouldReturnNotEqual() {
        Length yard1 = new Length(Units.YARD_TO_INCH,1.0);
        Length feet1 = new Length(Units.FEET, 5.0);
        boolean check = yard1.compare(yard1, feet1);
        Assertions.assertFalse(check);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Units.FEET_TO_INCH,3.0);
        Length yard1 = new Length(Units.YARD_TO_INCH, 1.0);
        boolean check = feet1.compare(feet1, yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Units.INCH,36.0);
        Length yard1 = new Length(Units.YARD_TO_INCH, 1.0);
        boolean check = inch1.compare(inch1, yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualLength() {
        Length yard1 = new Length(Units.YARD_TO_INCH,1.0);
        Length inch1 = new Length(Units.INCH, 36.0);
        boolean check = yard1.compare(yard1, inch1);
        Assertions.assertTrue(check);
    }
    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        Length yard1 = new Length(Units.YARD_TO_INCH,1.0);
        Length feet1 = new Length(Units.FEET, 36.0);
        boolean check = yard1.compare(yard1, feet1);
        Assertions.assertTrue(check);
    }


    @Test
    public void given2Inchand5Centimeter_WhenCompared_ShouldReturnEqual() {
        Length inch = new Length(Units.INCH, 2.0);
        Length centimeter = new Length(Units.CENTIMETER_TO_INCH, 5.0);
        boolean check = inch.compare(inch, centimeter);
        Assertions.assertTrue(check);
    }

    @Test
    public void given2Inchand6Inch_WhenCompared_ShouldReturnNotEqual() {
        Length inch = new Length(Units.INCH, 2.0);
        Length centimeter = new Length(Units.CENTIMETER_TO_INCH, 6.0);
        boolean check = inch.compare(inch, centimeter);
        Assertions.assertFalse(check);
    }

    @Test
    public void givenTwoInches_WhenAdded_ShouldReturnSumInInch() {
        Length inch1 = new Length(Units.INCH, 2);
        Length inch2 = new Length(Units.INCH, 2);
        double sum = Length.add(inch1, inch2);
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void givenFeetAndInches_WhenAdded_ShouldReturnSumInInch() {
        Length inch1 = new Length(Units.FEET_TO_INCH, 1);
        Length inch2 = new Length(Units.INCH, 2);
        double sum = Length.add(inch1, inch2);
        Assertions.assertEquals(14, sum);
    }

    @Test
    public void givenTwoFeet_WhenAdded_ShouldReturnSumInInch() {
        Length feet1 = new Length(Units.FEET_TO_INCH, 1);
        Length feet2 = new Length(Units.FEET_TO_INCH, 1);
        double sum = Length.add(feet1, feet2);
        Assertions.assertEquals(24, sum);
    }

    @Test
    public void givenInchAndCentimeter_WhenAdded_ShouldReturnSumInInch() {
        Length inch1 = new Length(Units.INCH, 2);
        Length centimeter1 = new Length(Units.CENTIMETER_TO_INCH, 2.5);
        double sum = Length.add(inch1, centimeter1);
        Assertions.assertEquals(3, sum);
    }

    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual() {
        Length length1 = new Length(Units.GALLON_TO_LITRE, 0.0);
        Length length2 = new Length(Units.GALLON_TO_LITRE, 0.0);
        Assertions.assertEquals(length1, length2);
    }

    @Test
    void given1GallonAnd3And78Litres_ShouldReturnTrue() {
        Length gallon = new Length(Units.GALLON_TO_LITRE, 1.0);
        Length litre = new Length(Units.LITER, 3.78);
        boolean check = gallon.compare(gallon, litre);
        Assertions.assertTrue(check);
    }

    @Test
    void given1LitreAnd3And1000Ml_ShouldReturnTrue() {
        Length litre = new Length(Units.LITER, 1);
        Length milliMeter = new Length(Units.MILLILITER_TO_LITRE, 1000.0);
        boolean check = litre.compare(litre, milliMeter);
        Assertions.assertTrue(check);
    }

    @Test
    void given2GallonAnd3And78Litres_WhenAdd_ShouldReturn7And57Litres() {
        Length gallon = new Length(Units.GALLON_TO_LITRE, 1.0);
        Length litres = new Length(Units.LITER, 3.78);
        double add = gallon.add(gallon, litres);
        Assertions.assertEquals(add,7.56);
    }

    @Test
    void given1MilliLitreAnd1Litres_WhenAdd_ShouldReturn1000Litres() {
        Length litre = new Length(Units.LITER, 1);
        Length millilitre = new Length(Units.MILLILITER_TO_LITRE, 1000.0);
        double add = litre.add(litre, millilitre);
        Assertions.assertEquals(add,2);
    }
}
