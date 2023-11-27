package com.bridgelabz.max;

/*@desc:generic class using data type T*/
public class Max_Min<T extends Comparable> {
	
	/*
	 * @desc:compares three objects and gives the max out of the three
	 * @param:T type
	 * @return:T type
	 */
	public T findMax(T obj1,T obj2,T obj3) {
		T max= obj1.compareTo(obj2)>0 ?obj1:obj2;
		max=max.compareTo(obj3)>0 ? max:obj3;
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
	       Max_Min<Float> finder2 = new Max_Min<>();
	        Float result2 = finder2.findMax(12.3f, 24.3f, 1.8f);
	        System.out.println("Test Case 2 Result: " + result2);

	        // Test Case 3: Max at 3rd position
	       Max_Min<Integer> finder3 = new Max_Min<>();
	        Integer result3 = finder3.findMax(1, 2 ,3);
	        System.out.println("Test Case 3 Result: " + result3);
	    }

}
