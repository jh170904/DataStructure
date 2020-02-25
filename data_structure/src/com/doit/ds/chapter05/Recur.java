package com.doit.ds.chapter05;

import java.util.Scanner;

import com.doit.ds.chapter04.IntStack;

//재귀함수 이해하기
public class Recur {

	static void recur(int n) {
		if (n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	/**
	 * 꼬리재귀 제거
	 */
	static void recur2(int n) {
		IntStack s = new IntStack(n);
		while(true) {
			if(n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			
			if(!s.isEmpty()) {
				n = s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			
			break;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 x: ");
		int x = stdIn.nextInt();
		
		recur(x);
		
		stdIn.close();
	}
}
