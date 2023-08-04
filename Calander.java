import java.util.*;

public class Calander {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	System.out.println("Enter day as Number ");

	int day=sc.nextInt();

	System.out.println("Enter number to be added");

	int num= sc.nextInt();

	int c=num+day;

	if (c%7==0) {

		System.out.println("Same day: "+ day);

	}

	else if(c%7==1) {

		System.out.println("Resulting day is Monday");

	}

	else if( c%7==2) {

		System.out.println("Resulting day is Tuesday");

	}

	else if( c%7==3) {

		System.out.println("Resulting day is Wednesday");

	}

	else if( c%7==4) {

		System.out.println("Resulting day is Thursday");

	}



	else if( c%7==5) {

		System.out.println("Resulting day is friday");

	}

	else if( c%7==3) {

		System.out.println("Resulting day is Saturday");

	}

	else if( c%7==3) {

		System.out.println("Resulting day is Sunday");

	}

	else {

		System.out.println("Invalid Input");

	}

}

}

