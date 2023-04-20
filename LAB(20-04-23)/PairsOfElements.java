package lab;

public class PairsOfElements {//class
	public static void  main(String[] args)
	  {
		//declaring and initializing
		value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);  
}
	//Static method of declaring and initializing
static void  value(int inputArray[], int inputValue)
  {
	//print 
  System.out.println("Pairs of elements  in array whose sum "+inputValue+" is equal to values : ");
 //for loop
  for (int i =  0; i < inputArray.length; i++)
  {
  for (int j  = i+1; j < inputArray.length; j++)
  {
  if(inputArray[i]+inputArray[j] == inputValue) //Logic of sum number
  {
  System.out.printf("(%d,%d) %n",inputArray[i],inputArray[j]);
  }
  }
  }
  }	
}