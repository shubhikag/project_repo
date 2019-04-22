package com.test.project.DemoJunit;

import static org.junit.Assert.*;

import org.junit.Test;



public class AppTest 

{
    @Test
    public void Testsquare()
    {
    	App a = new App();
    int output = a.square(6);	
    assertEquals(36, output);
    }
    @Test
    public void TestAlphabet()
    {
    	App a = new App();
    	int output = a.countA("alphabet");
    	assertEquals(2, output);
    }
    @Test
    public void Test2()
    {

    	App a = new App();
    	int output = a.countA("shubhika");
    	assertEquals(1, output);
    }
}
