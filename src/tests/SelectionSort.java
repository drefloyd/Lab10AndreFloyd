package tests;

public class SelectionSort {
	private int temp;
  
  public SelectionSort() {
  }

    public int[] basicSelectionSort(int[] x){
        for (int i = 0; i < x.length - 1; i++) {
            int lowestIndex = i;

            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            if (lowestIndex != i) { 
            temp = x[lowestIndex];
            x[lowestIndex] = x[i];
            x[i] = temp;
        }
    }
        return x;
    }
}

