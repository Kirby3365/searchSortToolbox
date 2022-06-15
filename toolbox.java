public class toolbox {
  int placeholder;

  public int[] SwapArrayIndexes(int[] arr, int firstIndex, int secondIndex) {
    placeholder = arr[firstIndex];
    arr[firstIndex] = arr[secondIndex];
    arr[secondIndex] = placeholder;
    // Return the swapped array
    return arr;
  }

  // All of the sorting arrays below will sort smallest to largest

  public int[] BubSort(int[] unsorted) {
    // Pseudocode "sleleton"/plan for Bubble Sort Code

    // Create a boolean to track whether the array is sorted.
    // SORTED = FALSE
    // loop while not SORTED
    // Assume the loop is sorted
    // SORTED = TRUE
    // Inner Loop
    // loop for I from 1 to ARRAY.length
    // IF ARRAY[I - 1] > ARRAY[I]
    // SWAP ARRAY[I - 1] AND ARRAY[I]
    // Use the swap method you created
    // SORTED = FALSE
    // end IF
    // end inner loop
    // end loop
    // RETURN the now sorted array

    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 1; i < unsorted.length; i++) {
        if (unsorted[i - 1] > unsorted[i]) {
          SwapArrayIndexes(unsorted, i - 1, i);
          sorted = false;
        }
      }
    }

    return unsorted;
  }

  public int[] SelSort(int[] unsorted) {
    //PseudoCode for Selection Sort

    //Outer Loop
    //Loop for unsorted index from 0 to array.length
    //Create a variable to store minimum value AND minimum index
    //int lowestIndex = unsortedIndex
    //int lowestValue = array[lowestIndex]
    //Inner Loop
    //Loop for i from unsortedIndex+1 to array.length
    //If array[i] < lowestValue
    //lowestValue = array[i]
    //lowestIndex = i
    //End If
    //End inner loop
    //Swap (using your swap method) lowestIndex with unsorted
    //End outer loop

    for(int unsortedIndex = 0; unsortedIndex < unsorted.length; unsortedIndex++){
      int lowestIndex = unsortedIndex;
      int lowestValue = unsorted[lowestIndex];
      for(int i = unsortedIndex + 1; i < unsorted.length; i++){
        if(unsorted[i] < lowestValue){
          lowestValue = unsorted[i];
          lowestIndex = i;
        }
      }
      SwapArrayIndexes(unsorted, lowestIndex, unsortedIndex);
    }
    return unsorted;
  }

  public int[] InsSort(int[] unsorted) {
    //PseudoCode for Insertion Sort

    //Loop through unsorted array
    //For loop through array
    //int savedNum = array[i]
    //int j = i - 1
    //Loop While j >= 0 AND array[j] > savedNum
    //array[j + 1] = array[j]
    //j - 1
    //End While Loop
    //array[j + 1] = savedNum
    //End For Loop
    
    for(int i = 1; i < unsorted.length; i++){
      int savedNum = unsorted[i];
      int j = i - 1;
      while(j >= 0 && unsorted[j] > savedNum){
        unsorted[j + 1] = unsorted[j];
        j--;
      }
      unsorted[j + 1] = savedNum;
    }
    
    return unsorted;
  }

  public void PrintArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}