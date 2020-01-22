package com.doit.ds.chapter02;

public class IntArr {
	// 구성요소의 자료형이 int형인 배열
	// 구성요솟수는 5 : new 에 의해 본체를 생성
	
	public static void main(String[] args) {
		int[] arr = new int[5];	// 배열 선언
		arr[1] = 37;
		arr[2] = 51;
		arr[4] = arr[1] * 2;
		
		for(int i=0; i< arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
