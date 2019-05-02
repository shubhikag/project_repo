package com.test.project.DemoJunit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
             System.out.println( "Hello everyone!" );
    }
    public int square(int x)
    {
    	return x*x;
    }
    public int countA(String word)
    {
    	int count=0;
    	for(int i=0;i<word.length();i++)
    	{
    		if(word.charAt(i)=='a' || word.charAt(i)=='A' )
    		{
    			count++;
    		}
    	}
    	return count;
    }
}
