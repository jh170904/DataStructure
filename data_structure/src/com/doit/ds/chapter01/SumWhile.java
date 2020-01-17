package com.doit.ds.chapter01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int sum = 0;
		int i = 1;
		
		System.out.println("1부터 n까지의 정수 합 구하기");
		System.out.print("n:");
		n = stdIn.nextInt();
		stdIn.close();
		
		// 사전 판단 반복 구조.
		while (i <= n) {
			sum += i;
			i++;
		}
		
		// 연습문제 Q6
		System.out.printf("증가값 i: %d\n", i);
		System.out.printf("1부터 %d까지의 정수 합 : %d", n, sum);
	}
}
