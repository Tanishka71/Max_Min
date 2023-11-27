package com.bridgelabz.max;

public class Max_Min<T extends Comparable> {
	
	public T findMax(T num1,T num2,T num3) {
		T max= num1.compareTo(num2)>0 ?num1:num2;
		max=max.compareTo(num3)>0 ? max:num3;
		return max;
	}
	 public static void main(String[] args) {
		 
		 //Test Case 1 where first number is max
		 Max_Min<Integer> ob1=new Max_Min<>();
		 Integer result1=ob1.findMax(12,6,4);
	        System.out.println("Test Case 1 Result: " + result1);
		 
		 //Test Case 2 where second number is max
		 Max_Min<Integer> ob2=new Max_Min<>();
		 Integer result2=ob2.findMax(1,6,4);
	        System.out.println("Test Case 2 Result: " + result2);
		 
		 //Test Case 3 where second number is max
		 Max_Min<Integer> ob3=new Max_Min<>();
		 Integer result3=ob3.findMax(1,6,14);
	        System.out.println("Test Case 3 Result: " + result3);
	 }
	

}
