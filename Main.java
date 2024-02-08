public class Main {
  public static void main(String[] args) {
    // DO NOT DELETE CODE IN MAIN METHOD!!
    // YOU MAY ADD IF YOU'D LIKE TO CREATE MORE TEST CASES

    // --- ** COMPLETE THE STATIC METHODS BELOW ** ---

    int [] tester1 = {7,13,-25,111,32,61,43,7,0,-7};
    int [] tester2 = {-7,-6,-5,-4,-3};
    int [] tester21 = {-7, -6, -5, -4, -3};
    String [] tester3 = {"St.Brown", "Goff", "Hutchinson", "Gibbs", "Melifonwu"};
    String [] tester4 = {"Taylor", "Swift", "D'Andre", "Swift"};

    // #1 
    System.out.println("\nTESTING #1");
    System.out.print("Correct: -25 \t Result: ");
    System.out.println(findMin(tester1)); 

    // #2 
    System.out.println("\nTESTING #2");
    System.out.print("Correct: 3 \t Result: ");
    System.out.println(findMaxIndex(tester1)); 

    // #3
    System.out.println("\nTESTING #3");
    System.out.print("Correct: 242 \t Result: ");
    System.out.println(arraySum(tester1)); 

    // #4
    System.out.println("\nTESTING #4");
    System.out.print("Correct: 24.2 \t Result: ");
    System.out.println(arrayAverage(tester1)); 

    // #5
    System.out.println("\nTESTING #5");
    System.out.print("Correct: 7 \t Result: ");
    System.out.println(mode(tester1));

    // #6
    System.out.println("\nTESTING #6");
    System.out.print("Correct: true \t Result: ");
    System.out.println(hasAtLeastOnePositive(tester1));

    System.out.print("Correct: false \t Result: ");
    System.out.println(hasAtLeastOnePositive(tester2));

    // #7 
    System.out.println("\nTESTING #7");
    System.out.print("Correct: false \t Result: ");
    System.out.println(allAreNegative(tester1));

    System.out.print("Correct: true \t Result: ");
    System.out.println(allAreNegative(tester2));

    // #8 
    System.out.println("\nTESTING #8");
    System.out.print("Correct: false \t Result: ");
    System.out.println(isStrictlyIncreasing(tester1));

    System.out.print("Correct: true \t Result: ");
    System.out.println(isStrictlyIncreasing(tester2));

    // #9 
    System.out.println("\nTESTING #9");
    System.out.print("Correct: false \t Result: ");
    System.out.println(containsDuplicates(tester3));
    System.out.print("Correct: true \t Result: ");
    System.out.println(containsDuplicates(tester4));

    // #10
    System.out.println("\nTESTING #10");
    System.out.print("Correct: 1 \t Result: ");
    System.out.println(countFourLetterWords(tester3));

    // #11
    System.out.println("\nTESTING #11");
    System.out.print("Correct: -6 -5 -4 -3 -7  \t Result: ");
    shiftLeft(tester2);
    for (int i : tester2) {
      System.out.print(i + " ");
    }

    // #12
    System.out.println("\n\nTESTING #12");
    System.out.print("Correct: -3 -4 -5 -6 -7  \t Result: ");
    reverseArray(tester21);
    for (int i : tester21) {
      System.out.print(i + " ");
    }
  }
  // #1 - complete the method to find the minimum value in the array
  public static int findMin(int[] numbers) {
    int min = Integer.MAX_VALUE;

    for (int n : numbers) {
      if (n < min) {
        min = n;
      }
    }
    
    return min; // this is just a place holder for now
  } 
  
  // #2 - complete the method to find the maximum value INDEX in the array
  public static int findMaxIndex(int[] numbers) {
    int max = Integer.MIN_VALUE;
    int returnIndex = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
        returnIndex = i;
      }
    }

    
    return returnIndex; // this is just a place holder for now
  }

  // #3 - find the sum of all numbers in the array
  public static int arraySum(int[] numbers) {
    int sum = 0;

    for (int n : numbers) {
      sum += n;
    }
    return sum; // this is just a place holder for now
  }

  // #4 - find the average of all numbers in the array (CALL the arraySum method to help)
  public static double arrayAverage(int[] numbers) {
    double sum = 0;

    for (int n : numbers) {
      sum += n;
    }
    
    return sum / (numbers.length); // this is just a place holder for now
  }

  // #5 - find the mode all numbers in the array 
  public static int mode(int[] arr) {
    int mode = 0, mC = 0;
    for (int i = 0; i < arr.length; i++) {
      int c = 0;

      for (int j = 0; j < arr.length; j++) {
        if (arr[j] == arr[i]) {
          c++;
        }
      }

      if (c > mC) {
        mC = c;
        mode = arr[i];
      }      
    }
    return mode; // this is just a place holder for now
  }

  // #6 - determine if at least one element is positive
  public static boolean hasAtLeastOnePositive(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        return true;
      }
    }
    return false; // this is just a place holder for now
  }

  // #7 - determine if ALL elements are negative
  public static boolean allAreNegative(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 0) {
        return false;
      }
    }
    return true; // this is just a place holder for now
  }

  // #8 - determine if all elements of the array are in strictly increasing
  public static boolean isStrictlyIncreasing(int[] nums) {
      for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] >= nums[i + 1]) {
          return false;
        }
      }
    return true; // this is just a place holder for now
  }

  // #9 - determine if the array contains duplicate elements
  public static boolean containsDuplicates(String[] words) {
    int dupeCounter = 0;
    for (int i = 0; i < words.length; i++) {
      dupeCounter = 0;
      for (int j = 0; j < words.length; j++) {
        if (words[i].equals(words[j])) {
          dupeCounter++;
        }
      }
    }
    return dupeCounter > 1; // this is just a place holder for now
  }

  // #10 - determine the number of elements that are four letter words
  public static int countFourLetterWords(String[] words) {
    int four = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() == 4) {
        four++;
      }
    }
    return four; // this is just a place holder for now
  }

  // #11 - rotate the elements of the array to the left 
  public static void shiftLeft(int[] arr) {
    int temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = temp;
  }

  // #12 - reverse the contents of the array 
  public static void reverseArray(int[] arr) {
    int temp[] = new int[arr.length];

    int j = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      temp[j] = arr[i];
      j++;
    }

    // Copy the elements from temp to arr
    for (int i = 0; i < arr.length; i++) {
      arr[i] = temp[i];
    }
  }
}
