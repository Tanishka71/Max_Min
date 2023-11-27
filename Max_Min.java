package com.bridgelabz.max;

/*@desc:generic class using data type T*/
public class Max_Min<T extends Comparable> {
	
	
   private T obj1;
   private T obj2;
   private T obj3;

	Max_Min(T obj1,T obj2,T obj3){
		this.obj1=obj1;
		this.obj2=obj2;
		this.obj3=obj3;
	}
	public T testMaximum() {
		return findMax(obj1, obj2, obj3);
	}
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
		// Test Case 1: Max at 1st position (String)
	        Max_Min<String> stringMax_Min = new Max_Min<>("Apple", "Peach", "Banana");
	        String result1 = stringMax_Min.testMaximum();
	        System.out.println("Test Case 1 Result: " + result1);
 
        // Test Case 2: Max at 2nd position (Float)
	        Max_Min<Float> floatMax_Min = new Max_Min<>(1.1f, 8.6f, 6.2f);
	        Float result2 = floatMax_Min.testMaximum();
	        System.out.println("Test Case 2 Result: " + result2);

	   // Test Case 3: Max at 3rd position (Integer)
	        Max_Min<Integer> integerMax_Min = new Max_Min<>(4, 1, 7);
	        Integer result3 = integerMax_Min.testMaximum();
	        System.out.println("Test Case 3 Result: " + result3);
	 }

}
