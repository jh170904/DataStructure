package com.doit.ds.chapter01;

import java.util.Scanner;

public class Test {
	
	final static Scanner SCANNER = new Scanner(System.in);
	
	/**
	 * 연습문제 Q1
	 */ 
	static int searchMax(int a, int b, int c, int d) {
		System.out.println("************** searchMax");
		int max = a;
		
		if (b>max) {
			max = b;
		}
		if (c>max) {
			max = c;
		}
		if (d>max) {
			max = d;
		}
		
		return max;
	}
	
	/**
	 * 연습문제 Q2
	 */ 
	static int searchMin(int a, int b, int c) {
		System.out.println("************** searchMin");
		int min = a;
		
		if (b<min) {
			min = b;
		}
		if (c<min) {
			min = c;
		}
		return min;
	}
	
	/**
	 * 연습문제 Q3
	 */ 
	static int searchMin(int a, int b, int c, int d) {
		System.out.println("************** searchMin");
		int min = a;
		int arr[] = {b,c,d};		
		for (int i : arr) {
			if(min > i) {
				min = i;
			}
		}		
		return min;
	}
	
	/**
	 * 연습문제 Q4
	 */ 
	static int searchMed(int a, int b, int c) {
		System.out.println("************** searchMed");
		if (a >= b) {
			if (a <= c) {
				return a;
			} else if ( b >= c) {
				return b;
			} else {
				return c;
			}
		} else if (a > c) {
			return a; 
		} else if (b > c) {
			return c;
		} else {
			return b;
		}
	}
	
	/**
	 * 연습문제 Q5
	 * OR조건이면 조건에 해당하는지 모두 확인해야 하므로 효율이 떨어진다
	 */
	static int med3(int a, int b, int c) {
		System.out.println("************** med3");
		TimeUtil time = new TimeUtil();
		int result;
		
		time.start();
		if ((b >= a && a <= c) || (c >= a && a <= b)) {
			result = a; 
		} else if ((a > b && c < b) || (a < b && c > b)) {
			result = b;
		} else {
			result = c;
		}
		time.end();
		
		return result;
	}
	
	/**
	 * 연습문제 Q7
	 */
	static void sum7() {
		System.out.println("************** sum7");
		
		StringBuffer sb = new StringBuffer("");
		int i = 1;
		int sum = 0;
		
		// 사전 판단 반복 구조.
		while (i <= 7) {
			sum += i;
			sb.append(i++).append(" + ");
		}
		
		sb.append("= ").append(sum);
		System.out.println(sb.toString());
	}
	
	/**
	 * 연습문제 Q8 : 가우스의 덧셈
	 */
	static void sumGauss() {
		System.out.println("************** sumGauss");
		int n;
		int result;
		System.out.println("1부터 합계를 구할 정수");
		System.out.print("n:");
		
		n = SCANNER.nextInt();
		result = (1+n) * n/2;
		
		System.out.printf("1부터 %d까지 합(가우스 덧셈): %d\n",n, result);
	}
	
	/**
	 * 연습문제 Q9
	 */
	static int sumOf() {
		System.out.println("************** sumOf");

		System.out.println("합계를 구할 두 정수");
		System.out.print("a:");
		int a = SCANNER.nextInt();

		System.out.print("b:");
		int b = SCANNER.nextInt();
		
		int sum = 0;
		int startNum = a<b?a:b; 
		int endNum = a>b?a:b; 
		for(int i = startNum;i<=endNum ;i++) {
			sum += i;
		}
		
		System.out.printf("%d부터 %d까지의 합 : %d\n", a, b, sum);
		return sum;
	}
	
	/**
	 * 연습문제 10
	 */
	static void subOf() {
		System.out.println("************** subOf");
		
		System.out.print("a: ");
		int a = SCANNER.nextInt();
		
		System.out.print("b: ");
		int b = SCANNER.nextInt();
		
		while (a> b) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b: ");
			b = SCANNER.nextInt();
		}
		
		System.out.printf("b - a 는 %d입니다.\n", b-a);
		return;

	}
	
	/**
	 * 연습문제 Q11
	 */
	static int numLength() {

		System.out.println("************** numLength");
		int num = 0;
		System.out.println("양의 정수를 입력하세요.");
		do {
			System.out.print("num:");
			num = SCANNER.nextInt();
		}while(num <= 0);
		
		int len = 1;
		while(num/10>0){
			num = num/10;
			len++;
		}
		System.out.printf("이 수의 자릿수는 %d입니다.\n",len);
		return len;
	}
	
	
	public static void main(String[] args) {
		System.out.println("최대값: " + searchMax(5,99,2,6));
		System.out.println("3개 중 최소값: " + searchMin(99,2,6));
		System.out.println("4개 중 최소값: " + searchMin(99,2,1,6));
		System.out.println("3개 중 중앙값: " + searchMed(99,2,40));
		
		sum7();
		sumGauss();
		sumOf();
		subOf();
		numLength();
		
		SCANNER.close();
	}
}
