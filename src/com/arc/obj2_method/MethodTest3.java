package com.arc.obj2_method;

public class MethodTest3 {

	//가변 인자값을 받고 싶을때
	//원하는 타입 ... 변수명
	public void info(int ... num) {
		//num = int [] 배열로 만들어줄게!!!
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}//for


	}//info

}
