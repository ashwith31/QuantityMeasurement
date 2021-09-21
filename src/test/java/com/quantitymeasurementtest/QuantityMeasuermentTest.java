package com.quantitymeasurementtest;

import com.quantitymeasurement.Feet;
import com.quantitymeasurement.Inch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasuermentTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFeetFromSameRef_ifEqual_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    void givenDifferentType_ifNotEquals_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        boolean newfeet = true;
        Assertions.assertNotEquals(feet, newfeet);
    }

    @Test
    void givensameType_ifEquals_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        Assertions.assertEquals(feet, feet1);
    }

    @Test
    public void givenFeetofSameValue_ShouldReturnEqual() {
        Feet feet = new Feet(1.0);
        Feet feet1 = new Feet(1.0);
        Assertions.assertEquals(feet, feet1);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual(){
        Feet feet1 = new Feet(1.0);
        double actualResult = feet1.ftToInConversion();
        double expectedResult = 12;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given2Feetand12Inch_WhenCompared_ShouldReturnNotEqual(){
        Feet feet1 = new Feet(4.0);
        double actualResult = feet1.ftToInConversion();
        double expectedResult = 12;
        Assertions.assertNotEquals(actualResult, expectedResult);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromDifferent_RefFeet_ifNotEqual_ShouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenInchFromSameRef_ifEqual_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchandDifferentType_ifNotEquals_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        boolean newinch = true;
        Assertions.assertNotEquals(inch, newinch);
    }

    @Test
    void givensameInchType_ifEquals_ShouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        Assertions.assertEquals(inch, inch1);
    }


}
