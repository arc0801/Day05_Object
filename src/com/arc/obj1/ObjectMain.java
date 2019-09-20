package com.arc.obj1;

import java.util.Scanner;

public class ObjectMain {

	public static void main(String[] args) {
		//객체(Object, Instance) 생성
		Scanner sc;
		sc = new Scanner(System.in);
		//클래스명 변수명; -> 일종의 변수선언과 동일
		//클래스명 참조변수명 = new 클래스명();
		
		ObjectTest1 obj = new ObjectTest1();
		//참조변수명.멤버변수명
		obj.money = 10000;
		obj.name = "iu";
		obj.number = "432-11-555";
		
		System.out.println("예금주 : "+obj.name);
		System.out.println("계좌번호 : "+obj.number);
		System.out.println("잔액 : "+obj.money);
		
		//통장 1개를 더 만들고 데이터를 입력하고 출력
		ObjectTest1 obj2 = new ObjectTest1();
		
		obj2.money = 20000;
		obj2.name = "arc";
		obj2.number = "564-56-897";
		
		System.out.println("예금주 : "+obj2.name);
		System.out.println("계좌번호 : "+obj2.number);
		System.out.println("잔액 : "+obj2.money);
		
		System.out.println(obj==obj2);
		
		System.out.println(obj.name==obj2.name);
		//string type(참조->주소값)이기 때문에 같을 수도, 다를 수도 있음
		
		//클래스는 또 다른 의미로 개발자가 만드는 복합 DataType
		obj = obj2;
		
		System.out.println(obj.name);
		System.out.println(obj==obj2);
		obj2.money=10;
		System.out.println(obj.money);//10
		
		
		
	}//main
	
	
	
}
