// This lab is done by:
//Alsharari, Naif & Baksh, Mohammad
// Import the scanner function so we can get input from the user.
import java.util.Scanner;
public class MainProgram {
	public static void main(String[] args){
		// Assign the Scanner function to a var. so we can use it 
		Scanner Input = new Scanner(System.in);
		// We ask the user several question to get info so we calculate the savings.
		System.out.println(" Enter the number of yeras you want to work: ");
		// now we use the scanner to assign the input from the user to a variable.
		double numberOfYears = Input.nextDouble();
		System.out.println("What is the expected annual return during working years:(IN PERCENTAGE FORMAT) ");
		double AnnualReturn = Input.nextDouble();
		System.out.println("Number of years retires: ");
		double RetiredYears = Input.nextDouble();
		System.out.println("Waht is the required income: ");
		double RequiredIncome = Input.nextDouble();
		System.out.println("What is the monthly social secutiry income ? ");
		double MonthlySSIncome = Input.nextDouble();
		System.out.println("What is your annual retirment saving rate ?(IN PERCENTAGE FORMAT)");
		double AnnualRetirment = Input.nextDouble();
		// Define the variables .
		double TotalSaving,SaveMonthly;
		// Calculate the results 
		TotalSaving = (RequiredIncome-MonthlySSIncome)*((1-(1/(Math.pow(1+(AnnualRetirment/100)/12,RetiredYears*12 )))))/((AnnualRetirment/100)/12);
		SaveMonthly = TotalSaving*(((AnnualReturn/100)/12)/((Math.pow(1+(AnnualReturn/100)/12, numberOfYears*12))-1));
		// Printing out the result to the user
		System.out.printf("The save per month is $%,.2f", SaveMonthly);
		System.out.printf("\nTotal savings is $%,.2f", TotalSaving);
		

		
	}

}
