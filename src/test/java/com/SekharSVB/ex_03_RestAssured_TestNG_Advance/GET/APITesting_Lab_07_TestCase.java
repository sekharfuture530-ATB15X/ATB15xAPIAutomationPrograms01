package com.SekharSVB.ex_03_RestAssured_TestNG_Advance.GET;

import org.testng.annotations.Test;

public class APITesting_Lab_07_TestCase {

    @Test
    public void test_01(){

        System.out.println("test01...........");
    }

    @Test(enabled = false)
    public void test_02(){
        System.out.println("test02...........");

    }
    @Test
    public void test_03(){

        System.out.println("test03...........");
    }
    @Test(enabled = true)
    public void test_04(){

        System.out.println("test04...........");
    }
}
