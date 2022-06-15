import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    // Create a scanner object
    Scanner scanner = new Scanner(System.in);
    
    // Create toolbox object
    toolbox tools = new toolbox();
    
    // Input data
    int[] unsorted = files.read("inputFile.txt");
    String input = "";
    System.out.println("Please select a sorting algorithem from the list:");
    boolean unselected = true;
    
    while(unselected){
      System.out.println("Unsorted, Bubble, Selection, Insertion");
      input = scanner.nextLine();
      if(input.equalsIgnoreCase("unsorted") || input.equalsIgnoreCase("bubble") || input.equalsIgnoreCase("selection") || input.equalsIgnoreCase("insertion")){
        unselected = false;
      }else{
        System.out.println("Please select a listed option.");
      }
    }

    if(input.equalsIgnoreCase("unsorted")){
      // Print the unsorted array
      System.out.println("Unsorted:");
      unsorted = files.read("inputFile.txt");
      tools.PrintArray(unsorted);
      files.write(unsorted, "outputFile.txt");
      return;
    }

    if(input.equalsIgnoreCase("bubble")){
      // Create a new sorted array and print it
      System.out.println("Bubble Sort:");
      unsorted = files.read("inputFile.txt");
      int[] bubSorted = tools.BubSort(unsorted);
      tools.PrintArray(bubSorted);
      files.write(bubSorted, "outputFile.txt");
      return;
    }
    
    if(input.equalsIgnoreCase("selection")){
      // Create a new sorted array and print it
      System.out.println("Selection Sort:");
      unsorted = files.read("inputFile.txt");
      int[] selSorted = tools.SelSort(unsorted);
      tools.PrintArray(selSorted);
      files.write(selSorted, "outputFile.txt");
      return;
    }

    if(input.equalsIgnoreCase("insertion")){
      // Create a new sorted array and print it
      System.out.println("Insertion Sort:");
      unsorted = files.read("inputFile.txt");
      int[] insSorted = tools.InsSort(unsorted);
      tools.PrintArray(insSorted);
      files.write(insSorted, "outputFile.txt");
      return;
    }
  }
}