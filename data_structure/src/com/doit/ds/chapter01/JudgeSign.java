package com.doit.ds.chapter01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int n = stdIn.nextInt();
		stdIn.close();
		
		if (n>0)
			System.out.println(n+"는 양수입니다.");
		else if (n<0)
			System.out.println(n+"는 양수입니다.");
		else
			System.out.println(n+"는 0입니다.");
	}
}
