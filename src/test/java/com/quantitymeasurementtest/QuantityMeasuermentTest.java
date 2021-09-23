package com.quantitymeasurementtest;

import com.quantitymeasurement.Length;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasuermentTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFeetFromSameRef_ifEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        boolean result = feet1 == feet1;
        Assertions.assertTrue(result);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual(){
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH,12.0);
        boolean check = feet.compare(inch);
        Assertions.assertTrue(check);
    }

    @Test
    public void given2Feetand12Inch_WhenCompared_ShouldReturnNotEqual(){
        Length feet = new Length(Length.Unit.FEET, 2.0);
        Length inch = new Length(Length.Unit.INCH,12.0);
        Assertions.assertNotEquals(feet,inch);
    }

    @Test
    void givenDifferentType_ifNotEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        boolean newfeet = true;
        Assertions.assertNotEquals(feet1, newfeet);
    }

    @Test
    void givensameType_ifEquals_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet2, feet1);
    }

    @Test
    public void givenFeetofSameValue_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertEquals(feet2, feet1);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenInchFromSameRef_ifEqual_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean result = inch1 == inch1;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchandDifferentType_ifNotEquals_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean newinch = true;
        Assertions.assertNotEquals(inch1, newinch);
    }

    @Test
    void givensameInchType_ifEquals_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch2, inch1);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,3.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = feet1.compare(yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = feet1.compare(yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = inch1.compare(yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given5InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,5.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = inch1.compare(yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1YardAnd5Inch_WhenCompared_ShouldReturnNotEqual() {
        Length yard = new Length(Length.Unit.YARD,1.0);
        Length inch = new Length(Length.Unit.INCH, 5.0);
        boolean check = yard.compare(inch);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1YardAnd5Feet_WhenCompared_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD,1.0);
        Length feet1 = new Length(Length.Unit.FEET, 5.0);
        boolean check = yard1.compare(feet1);
        Assertions.assertFalse(check);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,3.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = feet1.compare(yard1);
        Assertions.assertTrue(check);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = feet1.compare(yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = inch1.compare(yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,36.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean check = inch1.compare(yard1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnNotEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD,1.0);
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        boolean check = yard1.compare(inch1);
        Assertions.assertFalse(check);
    }
    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnNotEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD,1.0);
        Length feet1 = new Length(Length.Unit.FEET, 36.0);
        boolean check = yard1.compare(feet1);
        Assertions.assertFalse(check);
    }

    @Test
    public void given0Centimeterand0Centimeter_ShouldReturnEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0Centimeterand1Centimeter_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAndNull_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenCentimeterFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        boolean result = centimeter1 == centimeter2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenCentimeterFromSameRef_ifEqual_ShouldReturnTrue() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        boolean result = centimeter1 == centimeter1;
        Assertions.assertTrue(result);
    }

    @Test
    public void given2Inchand5Centimeter_WhenCompared_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER, 5.0);
        boolean check = inch.compare(centimeter);
        Assertions.assertTrue(check);
    }

    @Test
    public void given2Inchand6Inch_WhenCompared_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER, 6.0);
        boolean check = inch.compare(centimeter);
        Assertions.assertFalse(check);
    }

    @Test
    public void givenTwoInches_WhenAdded_ShouldReturnSumInInch() {
        Length inch1 = new Length(Length.Unit.INCH, 2);
        Length inch2 = new Length(Length.Unit.INCH, 2);
        double sum = Length.add(inch1, inch2);
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void givenFeetAndInches_WhenAdded_ShouldReturnSumInInch() {
        Length inch1 = new Length(Length.Unit.FEET, 1);
        Length inch2 = new Length(Length.Unit.INCH, 2);
        double sum = Length.add(inch1, inch2);
        Assertions.assertEquals(14, sum);
    }

    @Test
    public void givenTwoFeet_WhenAdded_ShouldReturnSumInInch() {
        Length feet1 = new Length(Length.Unit.FEET, 1);
        Length feet2 = new Length(Length.Unit.FEET, 1);
        double sum = Length.add(feet1, feet2);
        Assertions.assertEquals(24, sum);
    }

    @Test
    public void givenInchAndCentimeter_WhenAdded_ShouldReturnSumInInch() {
        Length inch1 = new Length(Length.Unit.INCH, 2);
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 2.5);
        double sum = Length.add(inch1, centimeter1);
        Assertions.assertEquals(3, sum);
    }

    @Test
    public void given0Gallonand0Gallon_ShouldReturnEqual() {
        Length length1 = new Length(Length.Unit.GALLON, 0.0);
        Length length2 = new Length(Length.Unit.GALLON, 0.0);
        Assertions.assertEquals(length1, length2);
    }

    @Test
    public void given0Gallonand1Gallon_ShouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.GALLON, 0.0);
        Length length2 = new Length(Length.Unit.GALLON, 1.0);
        Assertions.assertNotEquals(length1, length2);
    }

    @Test
    public void given0GallonAndNull_ShouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.GALLON, 0.0);
        Length length2 = null;
        Assertions.assertNotEquals(length1, length2);
    }

    @Test
    public void givenGallonFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(Length.Unit.GALLON, 0.0);
        Length length2 = new Length(Length.Unit.GALLON, 0.0);
        boolean result = length1 == length2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenGallonFromSameRef_ifEqual_ShouldReturnTrue() {
        Length gallon = new Length(Length.Unit.GALLON, 0.0);
        boolean result = gallon == gallon;
        Assertions.assertTrue(result);
    }

    @Test
    public void given0Literand0Liter_ShouldReturnEqual() {
        Length length1 = new Length(Length.Unit.LITER, 0.0);
        Length length2 = new Length(Length.Unit.LITER, 0.0);
        Assertions.assertEquals(length1, length2);
    }

    @Test
    public void given0Literand1Liter_ShouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.LITER, 0.0);
        Length length2 = new Length(Length.Unit.LITER, 1.0);
        Assertions.assertNotEquals(length1, length2);
    }

    @Test
    public void given0LiterAndNull_ShouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.LITER, 0.0);
        Length length2 = null;
        Assertions.assertNotEquals(length1, length2);
    }

    @Test
    public void givenLiterFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(Length.Unit.LITER, 0.0);
        Length length2 = new Length(Length.Unit.LITER, 0.0);
        boolean result = length1 == length2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLiterFromSameRef_ifEqual_ShouldReturnTrue() {
        Length length = new Length(Length.Unit.LITER, 0.0);
        boolean result = length == length;
        Assertions.assertTrue(result);
    }

    @Test
    void given1GallonAnd3And78Litres_ShouldReturnTrue() {
        Length gallon = new Length(Length.Unit.GALLON, 1.0);
        Length litre = new Length(Length.Unit.LITER, 3.78);
        boolean check = gallon.compare(litre);
        Assertions.assertTrue(check);
    }

    @Test
    public void given0Milliliterand0MilliLiter_ShouldReturnEqual() {
        Length length1 = new Length(Length.Unit.MILLILITER, 0.0);
        Length length2 = new Length(Length.Unit.MILLILITER, 0.0);
        Assertions.assertEquals(length1, length2);
    }

    @Test
    public void given0MilliLiterand1MilliLiter_ShouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.MILLILITER, 0.0);
        Length length2 = new Length(Length.Unit.MILLILITER, 1.0);
        Assertions.assertNotEquals(length1, length2);
    }

    @Test
    public void given0MilliLiterAndNull_ShouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.MILLILITER, 0.0);
        Length length2 = null;
        Assertions.assertNotEquals(length1, length2);
    }

    @Test
    public void givenMilliLiterFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Length length1 = new Length(Length.Unit.MILLILITER, 0.0);
        Length length2 = new Length(Length.Unit.MILLILITER, 0.0);
        boolean result = length1 == length2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMilliLiterFromSameRef_ifEqual_ShouldReturnTrue() {
        Length length = new Length(Length.Unit.MILLILITER, 0.0);
        boolean result = length == length;
        Assertions.assertTrue(result);
    }
}
