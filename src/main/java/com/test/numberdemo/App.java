package com.test.numberdemo;

/**
 * Number Game Code
 * @author Stanley He
 *
 */
public class App {

	private static final String str1 = "Fizz";
	private static final String str2 = "Buzz";
	private static final String str3 = "FizzBuzz";

	public static void main(String[] args) {
	    System.out.println("=========================Stage 1 Start==============================");
		printStage1();
		System.out.println("=========================Stage 1 end==============================");

		System.out.println("=========================Stage 2 Start==============================");
		printStage2();
		System.out.println("=========================Stage 2 end==============================");

	}
    /**
           * 检查数字a中是否包含数字b
     * @param a
     * @param b
     * @return boolean: true-包含  false-不包含
     */
	public static boolean checkNumberIncluded(int a, int b) {
		String strA = Integer.toString(a);
		String strB = Integer.toString(b);

		if (strA.contains(strB)) {
			return true;
		}

		return false;
	}
    
	/**
	  *  检查数字a中是否包含数字b和c
	 * @param a
	 * @param b
	 * @param c
	 * @return boolean: true: 包含  false:不包含
	 */
	public static boolean checkNumberIncluded(int a, int b, int c) {
		String strA = Integer.toString(a);
		String strB = Integer.toString(b);
		String strC = Integer.toString(c);
		if (strA.contains(strB) && strA.contains(strC)) {
			return true;
		}

		return false;
	}

	/**
	 * Print the numbers from 1 to 100: 
	 * a number is Fizz if it's divisible by 3, 
	 * a number is Buzz if it's divisible by 5, 
	 * a number is FizzBuzz if it's divisible by both 3 and 5
	 */
	public static void printStage1() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(str3);
			} else {
				if (i % 3 == 0) {
					System.out.println(str1);
				} else if (i % 5 == 0) {
					System.out.println(str2);
				} else {
					System.out.println(i);
				}
			}
		}
	}

	
	/**
	 * Print the numbers from 1 to 100: 
	 * a number is Fizz if it's divisible by 3, or if it has a 3 in it. 
	 * a number is Buzz if it's divisible by 5, or if it has a 5 in it. 
	 * a number is FizzBuzz if it's divisible by 3 or 5, or if it has a 3 or 5 in it.
	 */
	public static void printStage2() {
		for (int i = 1; i <= 100; i++) {

			if ((i % 3 == 0 && i % 5 == 0) || checkNumberIncluded(i, 3, 5)) {
				System.out.println(str3);
			} else {
				if (i % 3 == 0 || checkNumberIncluded(i, 3)) {
					System.out.println(str1);
				} else if (i % 5 == 0 || checkNumberIncluded(i, 5)) {
					System.out.println(str2);
				} else {
					System.out.println(i);
				}
			}

		}
	}	
}
