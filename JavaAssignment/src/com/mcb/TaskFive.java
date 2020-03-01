package com.mcb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description 
 * Q5:(Full Stack)
 * Given an array of characters, e.g [a,a,b,c,a,b,b,b,c,c,c, a,a,a,a,a,c, c,c ,b, b]
 * find the longest contiguous sequence of characters
 * answer:
 * a : 5
 * @author vabatra
 *
 */
public class TaskFive {

	public static void main(String[] args) {

		String arr[] = {"a","a","b","c","a","b","b","b","c","c","c","a","a","a","a","a","c","c","c","b","b"};
		String s = arr[0];
		String variable = arr[0];
		List<Integer> indexes = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			if (s != arr[i]) {
				indexes.add(variable.length());
				variable = "";
			}
			else {
				variable = variable + arr[i];
			}
		}
		Collections.sort(indexes);
		System.out.println(indexes.get(indexes.size()-1));
	}

}
