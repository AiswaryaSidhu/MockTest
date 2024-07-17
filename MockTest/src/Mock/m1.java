package Mock;

import java.util.HashMap;
import java.util.TreeSet;

public class m1 {

	public static void main(String[] args) {
		//m1.scanner();
		m1 ob=new m1();
		ob.smallest();
		ob.tables();
		ob.hashmap();
		m1.treeset();
		System.out.println(ob.name("Aiswarya"));
		m1.details("Vibish", 14, "HillFort school");
		m1.details("Rithich", 12, "PMMHSS");
		ob.product(10, 20);
		ob.product(10, 230, 4550);
		m1.fifth();
		ob.num();
		m1.odd();
	
	}
	//Find smallest of three numbers
	public void smallest() {
		int x=10;
		int y=100;
		int z=1000;
		if(x<y && x<z) {
			System.out.println("x is smallest");
		}else if(y<x && y<z) {
			System.out.println("y is smallest");
		}else {
			System.out.println("z is smallest");
		}
	}
	//print 9th table in reverse order using for loop
	public void tables() {
	int a=90;
	while(a>=9) {
		System.out.println(a);
		a=a-9;
	}
	}
	//Create a hashmap, key should be of integer datatype and element should be of String data type, add elements, remove elements and display key alone
	public void hashmap() {
		HashMap<Integer,String> m=new HashMap();
		m.put(1, "Aishu");
		m.put(2, "Sidhu");
		m.put(3, "Hara");
		m.put(4, "Juwin");
		m.put(5, "Fam");
		System.out.println(m);
		m.remove(5);
		System.out.println(m);
		System.out.println(m.keySet());
	}
	//Create a tree set of boolean data type, add elements, iterate through it
	public static void treeset() {
		TreeSet<Boolean> t=new TreeSet<>();
		t.add(true);
		t.add(false);
		t.add(false);
		for(Boolean x:t) {
			System.out.println(x);
		}
		System.out.println(t);
	}
	//create a non static method that returns your name
	public String name(String n) {
		return n;
	}
	//Create a static method and display student name, age, and school name (use parameters)
	public static void details(String name, int age, String school) {
		System.out.println("Student name is :"+name);
		System.out.println("Student age is :"+age);
		System.out.println("Student school is :"+school);
	}
	//overload non static method and find  product of two numbers and three numbers
	public void product(int a, int b) {
		System.out.println("Product of 2 numbers are :"+a*b);
	}
	public void product(int x, int y, int z) {
		System.out.println("Product of 3 numbers are :"+x*y*z);
	}
	//print 5th table using while loop
	public static void fifth() {
		int a=5;
		while(a<=50) {
			System.out.println(a);
			a=a+5;
		}
	}
	// use conditional operator and find smallest of two numbers
	public void num() {
		int a=10;
		int b=20;
		System.out.println(a<b ? "a is smaller" : "b is bigger");
	}
	//Print odd numbers from 41 to 49 using do while loop
	public static void odd() {
		int a=41;
		while(a<=49) {
			System.out.println(a);
			a=a+2;
		}
	}
}
