package com.endava.graduates.trainings.patterns;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rpanait on 7/30/2015.
 */
public class SuperAgentPatternTestCase {
    List<String> inputList,inputList2nd;
    SuperAgentPattern sagent;

    @Before
    public void setUp() {
        inputList = new ArrayList<String>();
        sagent = new SuperAgentPattern();
    }
    @Test
    public void checkIfSuperAgentTestCaseNull() {
        inputList.add("Super Secret Agent");
        Boolean actual = sagent.checkIfSuperAgent(inputList);
        assertEquals(true, actual);
    }
    @Test
    public void checkIfSuperAgentTestCase1() {
        Boolean actual = sagent.checkIfSuperAgent(inputList2nd);
        assertEquals(false, actual);
    }
    @Test
    public void checkIfSuperAgentTestCase2() {
        inputList.add("Agent");
        Boolean actual = sagent.checkIfSuperAgent(inputList);
        assertEquals(false, actual);
    }

}
