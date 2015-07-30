package com.endava.graduates.trainings.utils;

/**
 * Created by rpanait on 7/30/2015.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class StringUtilsTestCase {
    @Test
    public void toUpperCase() {
        String actual =StringUtils.toUpperCase("abc");
        String expected = "ABC";
        assertEquals(expected,actual);
    }
    @Test
    public void concatStrings() {
        String actual =StringUtils.concatStrings("So", "rin");
        String expected = "Sorin";
        assertEquals(expected,actual);
    }
    @Test
     public void substringValue() {
        String actual =StringUtils.substringValue("Sorin", 3);
        String expected = "in";
        assertEquals(expected,actual);
    }
    @Test
    public void substringValue2() {
        String actual =StringUtils.substringValue("Sorin", 7);
        String expected = "";
        assertEquals(expected,actual);
    }
}
