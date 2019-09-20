package com.arc.obj1;

public class ObjectMain2 {

	public static void main(String[] args) {
		int [] nums;
		
		//System.out.println(nums);
		//모든 변수는 사용하려면 초기화를 해야 함
		
		//지역변수의 초기화는 개발자가 직접 해야 함
		
		nums = new int[3];
		
		//heap 영역에 만들어지는 변수는
		//개발자가 초기화 하지 않으면 반자동으로 초기화 됨.
		
		//초기값
		//reference type : null;
		
		String [] names = new String[2];
		
		
		System.out.println(nums[0]);
		System.out.println(names[0]);
	}//main
}
