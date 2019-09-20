package com.arc.obj2_method;

import java.util.Scanner;

public class DogMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("개의 크기를 입력하세요.");
		int s = sc.nextInt();
		System.out.println("횟수를 지정하세요.");
		int count = sc.nextInt();
		
		
		
		d.bark(s,count); //인자값(argument)
		
		
	}//main
}
