package com.arc.obj2_method;

public class MethodMain1 {

	public static void main(String[] args) {
		//클래스의 멤버들을 사용하려면 먼저 객체를 생성!!!!!!!!!
		MethodTest1 m1 = new MethodTest1();
		//멤버메서드 info1 호출(사용)
		m1.info1();
		int num = 1000;
		
		
		
		
		
		//info2 호출
		/*
		* MethodTest1 m2 = new MethodTest1();
		* m2.info2();
		* 아래것과 사용하는 때가 조금 다름. 구분 잘 해야 함.
		*/
		m1.info2();
		
		
		

	}//main

}
