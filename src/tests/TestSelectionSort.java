package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSelectionSort {
	
	@Test
	public void testPositives() {
		testPositive();
	}
	
	@Test
	public void testNegatives() {
        testNegative();
	}
	@Test
	public void testMixed() {
        testMixed();
	}
	@Test
	public void testDuplicates() {
        testDuplicates();
	}
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
          
        assertEquals("The sorted array should be: 2,7,8,9,10", arr, Sortedarr);
        
    }
    
    public void testNegative(){
        
        /** Test data contains negative values only **/
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = -5;
        arr[2] = -8;
        arr[3] = -3;
        arr[4] = -12;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12;
        Sortedarr[1] = -8;
        Sortedarr[2] = -5;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;
        
        /** add tests to check for this unit test **/
          
        assertEquals("The sorted array should be: -12,-8,-5,-2,-1", arr, Sortedarr);
    }
    
    public void testMix(){
        
        /** Test data contains with both positive, negative and zeros **/
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 0;
        arr[2] = 19;
        arr[3] = 22;
        arr[4] = -12;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 19;
        Sortedarr[4] = 22;
        
        /** add tests to check for this unit test **/
          
        assertEquals("The sorted array should be: -12,-1,0,19,22", arr, Sortedarr);
    }
    
    public void testDuplicate(){
        
        /** Test data contains duplicates **/
        int[] arr = new int[5];
        arr[0] = 44;
        arr[1] = -1;
        arr[2] = -1;
        arr[3] = 9;
        arr[4] = 1;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -1;
        Sortedarr[1] = -1;
        Sortedarr[2] = 9;
        Sortedarr[3] = 44;
        Sortedarr[4] = 44;
        
        /** add tests to check for this unit test **/
          
        assertEquals("The sorted array should be: 1,1,9,44,44", arr, Sortedarr);
    }
}
