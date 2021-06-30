package com.work.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main3(String[] args) {
		int[][] num = {{1,2,3},{4,5,6}};
		for(int i = 0; i < num.length; i++) {
			System.out.println(Arrays.toString(num[i]));
		}
	}

	public static void main2(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("1월", 1);
		map.put("2월", 2);
		map.put("3월", 3);
		map.put("4월", 4);
		map.put("5월", 5);

		System.out.println(map.keySet() +", "+ map.values());
		
	}
	
	public static void main1(String[] args) {

		String[] str1 = { "1", "2", "3", "4", "5" };
		String[] str2 = { "6", "7", "8", "9", "0" };
		
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		
		System.out.println();
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str1));
		arr.addAll(Arrays.asList(str2));

		System.out.println();
		System.out.println(arr.size());
		
		System.out.println();
		for(String list:arr) {
			System.out.println(list);
		}
	}

}
