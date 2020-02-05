package com.doit.ds.chapter02;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	
	static final Scanner sc = new Scanner(System.in);

	/**
	 * 연습문제 Q2 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 메소드
	 */ 
	static class ReverseAndPrintArray {

		//배열 요소 a[idx1]와 a[idx2]의 값을 바꾸기
		static void swap(int[] a, int idx1, int idx2 ) {
			//출력
			for (int i : a) {
				System.out.printf("%d ", i);
			}
			System.out.println();
			
			int temp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = temp; 
		}
		
		//배열 a의 요소를 역순으로 정렬
		static void reverse(int a[]) {
			for(int i=0; i < a.length/2; i++) {
				System.out.printf("%d와 %d를 교환합니다.\n", a[i],a[a.length-i-1]);
				swap(a, i, a.length-i-1);
			}
			System.out.println("역순 정렬을 마쳤습니다.");
		}
	}
	
	/**
	 * 연습문제 Q3
	 * 배열의 모든 요소의 합계를 반환하는 메소드
	 */
	static int sumOf(int[] a) {
		int sum = 0; 
		for (int i : a)
			sum += i;
		return sum;
	}
	
	/**
	 * 연습문제 Q4
	 * 배열a의 모든 요소의 배열b에 복사하는 메소드
	 */
	static void copy(int a[], int b[]) {
		int idx = 0;
		for(int i: a) {
			b[idx++] = i;
		}
	}
	
	/**
	 * 연습문제 Q5
	 * 배열a의 모든 요소의 배열b에 복사하는 메소드
	 */
	static void rcopy(int a[], int b[]) {
		int idx = a.length-1;
		for(int i: a) {
			b[idx--] = i;
		}
	}
	
	/**
	 * 연습문제 Q6 
	 * 배열의 앞쪽에 아랫자리가 아닌 윗자리를 넣어두는 메소드
	 */ 
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Stack<Character> stack = new Stack<Character>();
	
		do {
			stack.push(dchar.charAt(x%r)); // r로 나눈 나머지를 저장
			x /= r; // x=x/r
		} while(x != 0);
		
		do {
			d[digits++] = stack.pop();
		} while(!stack.isEmpty());
		
		return digits;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5, 10, 73, -2, 5, 42};
		Test.ReverseAndPrintArray.reverse(arr);
		
		System.out.printf("sumOf(arr)=%d\n",sumOf(arr));
		
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		copy(a, b);
		System.out.println("배열 a와 b는 " + (ArrayEqual.equals(a, b) ? "같습니다." : "같지 않습니다."));
		
		rcopy(a, b);
		System.out.println("배열 a와 b는 " + (ArrayEqual.equals(a, b) ? "같습니다." : "같지 않습니다."));

	}

}
