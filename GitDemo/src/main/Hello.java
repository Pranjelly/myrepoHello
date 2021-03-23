package main;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		add(30,40);
		
	}
	
	public static void add(int num1,int num2){
	      System.out.println(num1+num2);
	}
	
	public static void diff(int num1,int num2){
	      System.out.println(num1-num2);
	}
	
	public static void prod(int num1,int num2){
	      System.out.println(num1*num2);
	}
	

	public static void mod(int num1,int num2){
	      System.out.println(num1%num2);
	}
	
	public static void div(int num1,int num2){
	      System.out.println(num1/num2);
	}
	
	public static void square(int num1){
		System.out.println(num1*num1);
	}
	 
	public static void cude(int num1){
		System.out.println(num1*num1*num1);
	}
	
	public static void four(int num1){
		System.out.println(num1*num1*num1*num1);
	}
	
	public static void area(int lenght , int breath){
		System.out.println(lenght * breath);
	}
}
