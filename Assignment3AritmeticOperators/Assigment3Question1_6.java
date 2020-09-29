package Assignment3AritmeticOperators;

public class Assigment3Question1_6 {

	public static void main(String[] args) {
		//Question-1
		double gallon=1;
		double liter=gallon*4.54;
		System.out.println("15 gallon is " + 15*liter);
		
		// Question-2
		int birthday=2000;
		int currentday=2020;
		int age=currentday-birthday;
		System.out.println("Hey man! based on your input, your age is " + age + ":)");
		
		//Question-3
		double width=4.5;
		double length=7.9;
		double area=width*length;
		System.out.println("The area of rectangle is: " +area);
		
		//Question-4
		int num1=10, num2=20;
		System.out.println("n1=" +num1);
		System.out.println("n2=" +num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("n1=" +num1);
		System.out.println("n2=" +num2);
			
		//Question-5
		int inputSeconds=360;
		int seconds=inputSeconds%60;
		int minutes=(inputSeconds%360)/60;
		int hours=inputSeconds/360;
		System.out.println(hours + "hours " + minutes + "minutes and " + seconds +"seconds");
		
		//Question-6
		int limit=10000;
		int mgcafein=500;
		int safeDrinkLimit=limit/mgcafein;
		System.out.println("Miligrams in drink: " + mgcafein );
		System.out.println("It would take about " + safeDrinkLimit + " drinks for lethal overdose" );
		
		
		
	}

}	

