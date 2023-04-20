package lab;

public class DuplicateValueExample { //class of duplicate value
	public static void main(String[] args) {  
			int[]arr=new int[] {5,2,7,7,5}; //declaring and initializing
			//for loop 
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) //checking duplicate value
						System.out.println("Duplicate value:"+arr[j]);//print
				}
			}

		}

	}


