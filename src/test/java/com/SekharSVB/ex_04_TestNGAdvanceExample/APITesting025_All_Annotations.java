package com.SekharSVB.ex_04_TestNGAdvanceExample;

import org.testng.annotations.*;

public class APITesting025_All_Annotations {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1. BeforeSuite - Setup system property / DB connection");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2. BeforeTest - Initialize test-level configs");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3. BeforeClass - Launch browser");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("4. BeforeMethod - Login / Navigate to URL");
    }

    @Test
    public void test1() {
        System.out.println("5. Test1 - Execute test case 1");
    }

    @Test
    public void test2() {
        System.out.println("6. Test2 - Execute test case 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("7. AfterMethod - Logout / Take screenshot");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("8. AfterClass - Close browser");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("9. AfterTest - Clean test data");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("10. AfterSuite - Generate reports");
    }
}
