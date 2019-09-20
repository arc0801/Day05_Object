package com.arc.ex1_school;

import java.util.Scanner;

public class StudentView {


	//메서드명이 viewAll
	//학생 전체 정보 출력
	public void viewAll(Student [] students) {

		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<students.length;i++) {
			this.viewOne(students[i]);
		}//for

	}//viewAll

	
	
	//viewOne
	public void viewOne(Student student) {
		if(student != null) {
			System.out.println(student.getName());
			System.out.println(student.getNum());
			System.out.println(student.getKor());
			System.out.println(student.getEng());
			System.out.println(student.getMath());
			System.out.println(student.getSum());
			System.out.println(student.getAvg());
			System.out.println("======");
		}else {
			System.out.println("해당 학생이 없어요.");
		}//if
		
	}//viewOne
}
