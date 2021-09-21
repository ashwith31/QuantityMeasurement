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
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        double actualResult = feet1.ftToInConversion();
        double expectedResult = 12;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given2Feetand12Inch_WhenCompared_ShouldReturnNotEqual(){
        Length feet1 = new Length(Length.Unit.FEET, 4.0);
        double actualResult = feet1.ftToInConversion();
        double expectedResult = 12;
        Assertions.assertNotEquals(actualResult, expectedResult);
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
    public void given0Inchand1Inch_ShouldReturnEqual() {
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
}
