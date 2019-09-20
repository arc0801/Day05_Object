package com.arc.obj2_method;

public class MethodTest2 {

	
	public void info1(int [] nums) {
		//n개의 정수를 받아서 합계, 평균 출력
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums [i];
		}//for
		
		avg = (double)sum/nums.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
		
		//nums[0] = 51;
		//nums[1] = 52;
		
		nums = new int[2];
		nums[0]=100;
		nums[1]=200;
		
	}//info1
}
