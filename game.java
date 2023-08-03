import java.util.*;

class Car{

	static void car(){

		System.out.println("Car details: ");

	}

}

class Merc extends Car{

	static void Merc(){

		System.out.println(" ");

		System.out.println("Merc");

		System.out.println("C class");

		System.out.println("A class");

		System.out.println("S class");

	}

}



class Bmw extends Car{

	static void Bmw() {

		System.out.println(" ");

		System.out.println("BMW");

		System.out.println("3 Series");

		System.out.println("5 Series");

		System.out.println("7 Series");

		

	}

}





class Lambo extends Car{

	static void Lambo() {

		System.out.println(" ");

		System.out.println("Lambo");

		System.out.println("Aventador");

		System.out.println("Garlado");

		System.out.println("Murshilago");

		

		

	}

}





public class Main {

	public static void main(String[] args) {

		

		Car obj=new Car();

		obj.car();

		

		Merc obj1= new Merc();

	    obj1.Merc();

	    

	    Bmw obj2= new Bmw();

	    obj2.Bmw();

	    

	    Lambo obj3= new Lambo();

	    obj3.Lambo();

		

	}

} 
