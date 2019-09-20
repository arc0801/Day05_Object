package com.arc.obj2_method;

public class MethodTest4 {

	public int info(int num1, int num2) {
		int sum = num1 + num2;
		
		return sum+10;
		//void ;리턴할 게 없다.
		//return 만나면 프로그램 끝남. 맨 마지막에 써야함.
		
		//System.out.println("");
		
	}//info
	//sale
	//금액을 받아서 20% 할인된 금액을 계산해서 리턴
	
	
	
	
	public int sale(int price) {
		price = (int)(price*0.8);
		
		return price;
		
	}//sale
	
	
	
}
