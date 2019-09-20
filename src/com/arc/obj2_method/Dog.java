package com.arc.obj2_method;

import java.util.Scanner;

public class Dog {

	public void bark(int size, int count) {
		//매개변수 - 지역변수
		//대형견 - 컹컹 - 60 이상
		//중형견 - 멍멍 - 30 이상 60 미만
		//소형견 - 왈왈 - 30 미만
		String sound = null;

		if(size>=60) {
			sound = "컹컹";
		}else if(size>=30) {
			sound = "멍멍";
		}else{
			sound = "왈왈";
		}//if

		for(int i=0;i<count;i++) {
			System.out.println(sound);
		}//for

	}//main

}
