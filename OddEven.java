package Javatraining;

import java.util.*;

public class OddEven {

public static void main(String []args) {

	int n,i;

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number of even numbers to be printed");

	n=sc.nextInt();

	System.out.println("even numbers are: ");

	System.out.println("even:");

	for(i=0;i<=n*2;i++)

	{

		if(i%2==0) 

		{

			

			System.out.println(i);

		}

			}

	

}

}
