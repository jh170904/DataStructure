package com.doit.ds.chapter01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.println("1부터 n까지의 정수 합 구하기");

		System.out.print("n:");
		n = stdIn.nextInt();
		stdIn.close();
		
		//for문을 종료한 이후에도 변수를 사용하려면 for문 바깥에 변수선언
		for(int i=0; i <= n; i++) { // 초기화부분에서 선언한 변수는 for문안에서만 유효하다.
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 정수 합 : %d", n, sum);
	}
}
