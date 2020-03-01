package com.mcb;

/**
 * @description Q3:(Full Stack) Given a array of UNORDERED numbers, write a
 *              program to find the largest difference between any 2 numbers in
 *              the array. You are NOT allowed to sort the array. e.g. [ 10, 11,
 *              5 , 6, 8, 9, 4 , 3, 15, 6 , 4 , 5 ,1 , 0 , 4 , 7] largest
 *              difference = 15 - 0 = 15.
 * 
 * @author vabatra
 *
 */
public class TaskThree {

	public static void main(String[] args) {

		int a[] = { 10, 11, 5, 6, 8, 9, 4, 3, 15, 6, 4, 5, 1, 0, 4, 7 };

		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("largest difference = " + max + " - " + min + " = " + (max - min)); 
	}

}
