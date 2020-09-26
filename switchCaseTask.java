package day7controlStatements;

public class switchCaseTask {

	public static void main(String[] args) {
		//task 37
		String laptop="hp";
		switch (laptop) {
	case "apple":
		System.out.println("Apple-no virus");
		break;
	
	case "dell":
		System.out.println("Toug one");
		break;
	
	case "acer":
		System.out.println("Not recommend");
		break;
	
	default:
		System.out.println("do not buy that one");
		}
		
		//task:38
		
		String day="monday";
		switch (day) {
		case "monday":
			System.out.println("1-Monday");
		case "tuesday":
			System.out.println("2-Tuesday");
		case "wednesday":
			System.out.println("3-Wednesday");
		case "thursday":
			System.out.println("4-Thursday");
		case "friday":
			System.out.println("5-Monday");
		
		}
		
		char light='G';
		switch (light) {
		case 'R':
			System.out.println("red");
			break;
		case 'O':
			System.out.println("orange");
			break;
		case 'G':
			System.out.println("green");
			break;
		}
		

	}

}
