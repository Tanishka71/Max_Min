package com.bridgelabz.max;

public class Max_Min<T extends Comparable> {
	
	public T findMax(T num1,T num2,T num3) {
		T max= num1.compareTo(num2)>0 ?num1:num2;
		max=max.compareTo(num3)>0 ? max:num3;
		return max;
	}
	 public static void main(String[] args) {
		 
		 //Test Case 1 where first number is max
		 Max_Min<Float> ob1=new Max_Min<>();
		 Float result1=ob1.findMax(12.2f,6.5f,4.4f);
	        System.out.println("Test Case 1 Result: " + result1);
		 
		 //Test Case 2 where second number is max
		 Max_Min<Float> ob2=new Max_Min<>();
		 Float result2=ob2.findMax(1.1f,6.3f,4.9f);
	        System.out.println("Test Case 2 Result: " + result2);
		 
		 //Test Case 3 where second number is max
		 Max_Min<Float> ob3=new Max_Min<>();
		 Float result3=ob3.findMax(1.3f,6.4f,14.5f);
	        System.out.println("Test Case 3 Result: " + result3);
	 }
	

}
