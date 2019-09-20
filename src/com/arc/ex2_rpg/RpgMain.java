package com.arc.ex2_rpg;

public class RpgMain {

	public static void main(String[] args) {
		//객체 생성
		/*
		Sword s1 = new Sword();
		s1.name="단검";
		s1.power=10;
		s1.level=1;
		*/
		Knight k1 = new Knight();
		k1.name="기사";
		k1.hp=10000;
		k1.level=1;
		//k1.sword=s1;
		k1.sword= new Sword();
		k1.sword.name="단검";
		k1.sword.power=10;
		k1.sword.level=1;
		System.out.println(k1.sword.name);
		
		
		
		
		
		
		
	}//main
}
