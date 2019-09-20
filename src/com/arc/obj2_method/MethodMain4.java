package com.arc.obj2_method;

public class MethodMain4 {

	public static void main(String[] args) {
		MethodTest4 m4 = new MethodTest4();
		
		int num = m4.info(10, 20);
		
		System.out.println(num);
		
		
		
		
		int price=20000;
		
		price = m4.sale(price);
		price = m4.sale(price);
		
		System.out.println(price); //12800
		
	}//main
	
}
