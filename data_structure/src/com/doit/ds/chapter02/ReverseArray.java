package com.doit.ds.chapter02;

import java.util.Scanner;

//배열 요소의 값을 읽어 들여 역순으로 정렬
public class ReverseArray {
	//배열 요소 a[idx1]와 a[idx2]의 값을 바꾸기
	static void swap(int[] a, int idx1, int idx2 ) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp; 
	}
	
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int a[]) {
		for(int i=0; i < a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for (int i=0; i < num; i++) {
			System.out.printf("x[%d]:",i);
			x[i] = sc.nextInt();
		}
		
		reverse(x);	//역순으로 정렬
		
		System.out.println("요소룰 역순으로 정렬");

		for (int i=0; i < num; i++) {
			System.out.printf("x[%d]: %d\t",i, x[i]);
		}
		
		sc.close();
	}
}
