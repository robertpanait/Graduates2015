package com.endava.graduates.trainings.services;

import com.endava.graduates.trainings.file.FileRead;
import com.endava.graduates.trainings.file.FileReadInterface;
import com.endava.graduates.trainings.file.StubFileRead;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by rpanait on 7/30/2015.
 */
public class RankServiceTestCase {

    RankService rkservice;
    FileReadInterface fl;
    @Before
    public void setUp() {
        fl=new StubFileRead();
        rkservice = new RankService(fl);
    }
    @Test
    public void testObtaintRankFromFile() throws Exception {
        assertTrue(rkservice.obtaintRankFromFile());
    }

}
