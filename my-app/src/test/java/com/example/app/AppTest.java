package com.example.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testOneTriplet() {
        App app = new App();
        List<List<Integer>> result = app.threeSum(new int[]{-1, 0, 1, 2});
        assertEquals(1, result.size());
        assertTrue(result.contains(Arrays.asList(-1, 0, 1)));
    }


    
    public void testMultipleTriplets() {
        App app = new App();
        List<List<Integer>> result = app.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(List.of(-1,0,1));
        expectedList.add(List.of(-1,1,2));

        assertEquals(expectedList, result);
    }
}
