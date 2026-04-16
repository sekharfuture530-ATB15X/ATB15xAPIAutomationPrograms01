package com.SekharSVB.ex_04_TestNGAdvanceExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting020_TestNG_Enabled {

    @Test
    public void test_01(){
        Assert.assertTrue(true);
        System.out.println("false");
    }

    @Test(enabled = false)
    public void test_02(){
        Assert.assertTrue(true);
        System.out.println("enabled");
    }

    @Test
    public void test_03(){
        Assert.assertTrue(true);
        System.out.println("true");
    }
}
