package com.arc.ex1_school;

import java.util.Scanner;

public class SchoolMenu {

	//메뉴 선택 역할

	//메서드명은 start
	//선택 메뉴가 실행
	//
	public void start() {

		Scanner sc = new Scanner(System.in);
		int i =0;
		boolean check = true;
		Student [] students = null;
		StudentView v = new StudentView();
		StudentInput si = new StudentInput();

		while(check) {
			System.out.println("1. 성적입력");
			System.out.println("2. 전체조회");
			System.out.println("3. 학생검색");
			System.out.println("4. 학생삭제");
			System.out.println("5. 종      료");

			int select = sc.nextInt();

			switch(select) {
			case 1:
				students = si.makeStudents();
				break;

			case 2:
				v.viewAll(students);
				break;

			case 3:

				//findByNum이 실행
				Student student = si.findByNum(students);
				//								(보내줄 값)
				v.viewOne(student);
				break;

			case 4:
				students = si.deleteStudent(students);
				break;

			default:
				check=!check;
			}//switch

		}//while

		
		
		
	}//start
}
