package Lab8;

import java.util.Scanner;

class TaxCalculator //class
{   //instance variable
	private String empName;
	private boolean isIndian;
	private double empSal;
	
    //Initialize the scanner 
	Scanner sc=new Scanner(System.in);
	
	public double calculateTax(double taxAmount) throws CountryNotValidException,EmployeeNameInvalidException,
	TaxNotEligibleException  //declare exception
	{
		//java Scanner input example
		System.out.println("Enter Employee Name :");
		String empName=sc.nextLine();
		System.out.println("Enter You indian or not by using true/false :");
		boolean isIndian=sc.nextBoolean();
		System.out.println("Enter Emolyee Salary :");
		double empSal=sc.nextDouble();
		//checking if file is scanner input
		if(isIndian==false)
		{
			 // throw an exception
			throw new CountryNotValidException("Country not valid: The employee should be an Indian Citizen for calculating tax.");
		}
		
		else if(empName.isEmpty() && empName !=null)
		{
			 // throw an exception
			throw new EmployeeNameInvalidException("Employee name not valid: The employee name cannot be empty.");
		}
		else if(empSal>100000 && isIndian==true)
		{
			taxAmount=empSal*8/100;
			
		}
		else if(empSal>50000 || empSal<100000 && isIndian==true)
		{
			taxAmount=empSal*6/100;
		}
		else if(empSal>30000 || empSal<50000 && isIndian==true)
		{
			taxAmount=empSal*5/100;
		}
		else if(empSal>10000 || empSal<30000 && isIndian==true)
		{
			taxAmount=empSal*4/100;
		}
		if(empSal<=1000)
		{
			 // throw an exception
			throw new TaxNotEligibleException("Not eligible for Tax calculation: The employee does not need to pay tax.");
		}
		System.out.println("Tax Amount is "+taxAmount); //print tax amount
		return taxAmount;
	}
}

//Main Class
public class CalculatorSimulator {
	//main method
	public static void main(String[] args)  {
		//try-catch exception 
		try
		{
			//Object of class
		TaxCalculator tc=new TaxCalculator();
			tc.calculateTax(0);
		} catch (CountryNotValidException e)
		{
			System.out.println(e.getMessage());
		} 
		catch (TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
		} 
		catch(EmployeeNameInvalidException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

//output:
 /* Test Case 1:
 * Enter Employee Name :
   Ron
   Enter You indian or not by using true/false :
   False
   Enter Emolyee Salary :
   34000
   Country not valid: The employee should be an Indian Citizen for calculating tax
 */

/* Test Case 2:
 * Enter Employee Name :
   Tim
   Enter You indian or not by using true/false :
   True
   Enter Emolyee Salary :
   1000
   Not eligible for Tax calculation: The employee does not need to pay tax.
 */

/* Test Case 3:
 * Enter Employee Name :
   Jack
   Enter You indian or not by using true/false :
   True
   Enter Emolyee Salary :
   55000
   Tax Amount is 3300.0
 */

/* Test Case 4:
 * Enter Employee Name :
   
   Enter You indian or not by using true/false :
   True
   Enter Emolyee Salary :
   30000
   Employee name not valid: The employee name cannot be empty
 */

