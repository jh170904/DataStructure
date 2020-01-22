package com.doit.ds.chapter02;

public class IntArrInit {
	//구성 자료형이 int형인 배열 
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};	// 배열 초기자에 의해 생성
		for(int i=0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}