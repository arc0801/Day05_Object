package com.arc.ex1_school;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu=null;
		
		//배열
		//데이터타입 [] 변수명
		Student [] students = new Student[2];
		
		//한 명의 학생을 생성
		for(int i=0;i<2;i++) {
			stu = new Student();
			//데이터를 입력하고
			//students[i]=new Student();
			System.out.println("학생의 이름을 입력하세요.");
			//students[i].name=sc.next(); // -> 아무것도 안 담김.error
			stu.setName(sc.next());
			System.out.println("학생의 번호를 입력하세요.");
			stu.setNum(sc.nextInt());
			System.out.println("학생의 국어점수를 입력하세요.");
			stu.setKor(sc.nextInt());
			System.out.println("학생의 영어점수를 입력하세요.");
			stu.setEng(sc.nextInt());
			System.out.println("학생의 수학점수를 입력하세요.");
			stu.setMath(sc.nextInt());
			
			stu.setSum(students[i].getKor() + students[i].getEng() + students[i].getMath());
			stu.setAvg(students[i].getSum()/3.0);

			students[i]=stu;
			
			/*
			System.out.println("이름 : "+si.name);
			System.out.println("번호 : "+si.num);
			System.out.println("국어점수 : "+si.kor);
			System.out.println("영어점수 : "+si.eng);
			System.out.println("수학점수 : "+si.math);
			System.out.println("총점 : "+si.sum);
			System.out.println("평균 : "+si.avg);
			*/
		}//for

		//각 정보를 출력하세요.
		for(int i=0;i<students.length;i++) {
		
		System.out.println("이름 : "+students[i].getName());
		System.out.println("번호 : "+students[i].getNum());
		System.out.println("국어점수 : "+students[i].getKor());
		System.out.println("영어점수 : "+students[i].getEng());
		System.out.println("수학점수 : "+students[i].getMath());
		System.out.println("총점 : "+students[i].getSum());
		System.out.println("평균 : "+students[i].getAvg());
		
		}
		

	}//main

}
