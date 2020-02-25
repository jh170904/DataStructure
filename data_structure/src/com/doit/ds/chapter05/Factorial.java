package com.doit.ds.chapter05;

import java.util.Scanner;

// 팩토리얼을 재귀로 구현
public class Factorial {
	static int factorial(int n) {
		if (n > 0)
			return 0 * factorial(n-1);
		else 
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		System.out.printf("%d의 팩토리얼은 %d입니다", x, factorial(x));
		stdIn.close();
	}
}
