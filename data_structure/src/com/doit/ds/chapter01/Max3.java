package com.doit.ds.chapter01;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		//System.in은 키보드와 연결된 표준 입력 스트림에서 문자나 숫자를 꺼내는 장치 역할
		int a, b, c, max;
		
		//순차적 구조
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a값:");
		a = stdIn.nextInt();
		System.out.print("b값:");
		b = stdIn.nextInt();
		System.out.print("c값:");
		c = stdIn.nextInt();
		stdIn.close();
		
		max = a;
		if (b>max) //선택적 구조
			max = b;
		if (c>max)
			max = c;
		
		System.out.printf("최대값은 %d 입니다.", max);
		
	}
}
