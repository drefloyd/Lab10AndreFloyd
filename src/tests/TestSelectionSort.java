package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSelectionSort {

    @Test
    public void testPositive() {
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

        SelectionSort sorter = new SelectionSort();
        assertArrayEquals("The sorted array should be: 2, 7, 8, 9, 10", Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testNegative() {
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = -5;
        arr[2] = -8;
        arr[3] = -2;
        arr[4] = -12;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12;
        Sortedarr[1] = -8;
        Sortedarr[2] = -5;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;

        SelectionSort sorter = new SelectionSort();
        assertArrayEquals("The sorted array should be: -12, -8, -5, -2, -1", Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testMix() {
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

        SelectionSort sorter = new SelectionSort();
        assertArrayEquals("The sorted array should be: -12, -1, 0, 19, 22", Sortedarr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testDuplicate() {
        int[] arr = new int[5];
        arr[0] = 44;
        arr[1] = -1;
        arr[2] = -1;
        arr[3] = 9;
        arr[4] = 44;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -1;
        Sortedarr[1] = -1;
        Sortedarr[2] = 9;
        Sortedarr[3] = 44;
        Sortedarr[4] = 44;

        SelectionSort sorter = new SelectionSort();
        assertArrayEquals("The sorted array should be: -1, -1, 9, 44, 44", Sortedarr, sorter.basicSelectionSort(arr));
    }
}
