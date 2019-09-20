package com.arc.obj2_method;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {
		MethodTest2 m2 = new MethodTest2();

		int [] nums = {1,2,3,4};
		

		m2.info1(nums);

		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		
	}//main
}
