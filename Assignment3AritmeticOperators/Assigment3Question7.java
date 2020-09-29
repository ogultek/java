package Assignment3AritmeticOperators;

import java.util.Scanner;

public class Assigment3Question7 {

	public static void main(String[] args) {
		
		Scanner item=new Scanner(System.in);
		int price,num1,num2,num3, amount;
		
		System.out.println("What is the prices of item" );
		price=item.nextInt();
		System.out.println("your item for " + price + " cent gave me a dollar");
		System.out.println("your change is ");
		amount=100-price;
		num1=amount/25;
		amount=amount%25;
		num2=amount/10;
		num2=amount%10;
		num3=amount%5;
		num3=amount/5;
		
		System.out.println(num1+ " quartes");
		System.out.println(num2 +" dimes");
		System.out.println(num3 + " nikels)");
		
		
		

	}

}
