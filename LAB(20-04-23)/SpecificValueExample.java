package lab;

public class SpecificValueExample { //class for specific value
	//Static method of declaring and initializing
 public static boolean values(int[] arr, int i) {
      for (int n : arr) {//for loop each for print
         if (i== n) { //if for print
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
      System.out.println(values(my_array1, 2013));//checking specific value
      System.out.println(values(my_array1, 1898));//checking specific value
   }
}

