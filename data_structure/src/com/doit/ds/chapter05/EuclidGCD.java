package com.doit.ds.chapter05;

import java.util.Scanner;

// 유클리드 호제법으로 최대 공약수 구하기
public class EuclidGCD {
	//정수 x, y의 최대 공약수를 구해서 반환.
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x%y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("두 수의 최대공약수를 구합니다.");

		System.out.print("정수를 입력하세요 x: ");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요 y: ");
		int y = stdIn.nextInt();
		
		System.out.printf("%d, %d의 최대공약수는 %d입니다", x, y, gcd(x,y));
		stdIn.close();
	}
}
