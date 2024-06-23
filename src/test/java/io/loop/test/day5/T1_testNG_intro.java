package io.loop.test.day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class T1_testNG_intro {

    @Test(priority = 1)
    public void test2(){
        System.out.println("Test 2 is running");
    }


    @Test(priority = 2)
    public void test1(){
        System.out.println("Test 1 is running");
        String actual = "Feyruz";
        String expected = "Nadir";
        Assert.assertEquals(actual, expected, "Massage from actual");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod
    public void therDownMethod(){
        System.out.println("After method is running");
    }

    @BeforeClass
    public void setUp(){
    System.out.println("Before class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }


}
