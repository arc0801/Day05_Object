package com.arc.ex1_school;

public class Student {

	//성적 관리 프로그램
	
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	/*
	//setter
	public void set멤버변수명(멤버변수명과 같은 데이터 타입) {
		내부데이터=외부데이터
	}
	
	//getter
	public 멤버변수명과 같은 데이터 타입 get멤버변수명() {
		return 멤버변수명;
	}
	
	//name setter
	public void setName(String name) {
		this.name=name;
	}
	
	//name getter
	public String getName() {
		return this.name;
	}
	*/
	
	//접근지정자 [그 외 지정자] 리턴타입 메서드명([매개변수들 선언[){}
	//접근지정자 -> public
	//그외지정자 -> 생략
	//리턴타입 -> void
	//매개변수 -> 생략
	//info
	
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public static void info() {
		System.out.println("Info Start");
		System.out.println("Info Finish");
	
	}
	
	
}
	
