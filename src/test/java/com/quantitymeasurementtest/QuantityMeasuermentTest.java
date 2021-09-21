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
    public void givenFeetofSameValue_ShouldReturnEqual(){
        Feet feet = new Feet(1.0);
        Feet feet1 = new Feet(1.0);
        Assertions.assertEquals(feet, feet1);
    }

    @Test
    public void givenFeetofDifferentValue_ShouldReturnNotEqual(){
        Feet feet = new Feet(1.0);
        Feet feet1 = new Feet(2.0);
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }
}
