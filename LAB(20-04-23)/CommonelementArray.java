package lab;
/*Write a Java program to find common elements from 
three sorted (in non-decreasing order) arrays.*/
public class CommonelementArray {//class
	//Static method of declaring and initializing
	public static void  commonElements(int arr1[], int arr2[], int arr3[]) {
		//for loop
	for(int i = 0; i < arr1.length; i++) {
	for(int j = 0; j < arr2.length; j++) {
	for(int k = 0; k < arr3.length; k++) {
	if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) { //logic of common elements
	System.out.println(arr1[i]); //print
	}
	}}}
	}
	//main
	public static void main(String[] args) {
		//declaring and initializing
		int arr1[] = {10, 20, 40, 80, 60, 50}; 
        int arr2[] = {6, 7, 20, 80, 100}; 
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
        System.out.println("Common Elements:");//print
        commonElements(arr1, arr2, arr3); //Checking common elements
	}
	}

