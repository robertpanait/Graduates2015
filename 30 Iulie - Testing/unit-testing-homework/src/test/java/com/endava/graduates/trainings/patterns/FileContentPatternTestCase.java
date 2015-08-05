package com.endava.graduates.trainings.patterns;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by rpanait on 7/30/2015.
 */
public class FileContentPatternTestCase {
    FileContentPattern input;
    @Before
    public void setUp() {
        input= new FileContentPattern();
    }
    @Test
    public void testverifyContentNull() throws Exception{
        String actual = input.verifyContent(null,1);;
        assertNull(actual);
    }
    @Test
    public void testverifyContent1() throws Exception {
        String actual =input.verifyContent("agent",1);
        String expected ="Secret Agent";
        assertEquals(expected, actual);
    }
    @Test
    public void testverifyContent2() throws Exception {
        String actual =input.verifyContent("superAgent",6);
        String expected ="Super Secret Agent";
        assertEquals(expected,actual);
    }
    @Test(expected = Exception.class)
    public void testverifyContent3() throws Exception {
        input.verifyContent("superAgent", 3);
    }
    @Test
    public void testverifyContent4() throws Exception {
        String expected = input.verifyContent("agt", 3);
        assertNull(expected);
    }
    @Test
    public void testverifyContent5() throws Exception {
        String actual =input.verifyContent("agent",7);
       // String expected ="Secret Agent";
        assertEquals(null, actual);
    }

}
