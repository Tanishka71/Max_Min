package com.bridgelabz.max;

/*@desc:generic class using data type T*/
public class Max_Min<T extends Comparable> {
	
	/*
	 * @desc:compares three parameters and gives the max out of the three
	 * @param:T type
	 * @return:T type
	 */
	public T findMax(T str1,T str2,T str3) {
		T max= str1.compareTo(str2)>0 ?str1:str2;
		max=max.compareTo(str3)>0 ? max:str3;
		return max;
	}
	
	/*
	 * @desc:main function which has the designed test cases1,2,3
	 * @param:none
	 * @return:none
	 */
	 public static void main(String[] args) {
		 
		   // Test Case 1: Max at 1st position
	       Max_Min<String> finder1 = new Max_Min<>();
	        String result1 = finder1.findMax("Apple", "Peach", "Banana");
	        System.out.println("Test Case 1 Result: " + result1);

	        // Test Case 2: Max at 2nd position
	       Max_Min<String> finder2 = new Max_Min<>();
	        String result2 = finder2.findMax("Orange", "Grapes", "Kiwi");
	        System.out.println("Test Case 2 Result: " + result2);

	        // Test Case 3: Max at 3rd position
	       Max_Min<String> finder3 = new Max_Min<>();
	        String result3 = finder3.findMax("Cherry", "Strawberry", "Blueberry");
	        System.out.println("Test Case 3 Result: " + result3);
	    }

}
