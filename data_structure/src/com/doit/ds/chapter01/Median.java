package com.doit.ds.chapter01;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		TimeUtil time = new TimeUtil();
		int result;
		
		time.start();
		if (a>=b)
			if (b>=c)
				result = b;
			else if (a<=c)
				result = a;
			else
				result = c;
		else if (a>c)
			result = a;
		else if (b>c)
			result = c;
		else
			result = b;
		
		time.end();
		return result;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		//System.in은 키보드와 연결된 표준 입력 스트림에서 문자나 숫자를 꺼내는 장치 역할
		int a, b, c;
		
		System.out.println("세 정수의 중앙값 구하기");
		System.out.print("a값:");
		a = stdIn.nextInt();
		System.out.print("b값:");
		b = stdIn.nextInt();
		System.out.print("c값:");
		c = stdIn.nextInt();
		stdIn.close();
		
		System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
		System.out.println("중앙값은 " + Test.med3(a,b,c) + "입니다.");
	}
}
