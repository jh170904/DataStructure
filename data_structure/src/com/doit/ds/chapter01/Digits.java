package com.doit.ds.chapter01;

import java.util.Scanner;

public class Digits {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("2자릿수의 정수를 입력하세요");
		
		do {
			System.out.print("입력 : ");
			n = sc.nextInt();
		}while(n < 10 || n >99);//단축구조
		
		System.out.printf("변수 n의 값은 %d가 되었다!!\n", n);
		
		sc.close();
	}
}
