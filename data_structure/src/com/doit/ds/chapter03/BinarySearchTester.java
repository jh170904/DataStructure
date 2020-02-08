package com.doit.ds.chapter03;

import java.util.Arrays;
import java.util.Scanner;

//Arrays.binarySearch 메소드로 검색하기
public class BinarySearchTester {
	
	/**
	 * 연습문제 Q6 : 검색에 실패하면 삽입 포인트의 값을 출력하는 프로그램
	 */
	static int binSearch(int[] arr, int n, int key) {
		int pl = 0;			// 검색범위 첫번째 인덱스
		int pr = n-1;		// 검색범위 마지막 인덱스
		int pc;
		do {
			pc = (pl+pr)/2;		// 중앙 인덱스
			if (arr[pc] == key) {
				return pc;			// 검색 성공
			} else if(arr[pc]<key) {
				pl = pc+1;//검색범위를 중앙~뒤로 좁힘
			} else {
				pr = pc-1;//검색범위를 앞~중앙로 좁힘
			}
						
		} while (pl <= pr);

		if(key > arr[pc])
			++pc;
		
		return ++pc * -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 :");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.printf("x[0]:");
		x[0] = sc.nextInt();
		
		for (int i=1; i<num; i++) {
			do {
				System.out.printf("x[%d]:", i);
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]); //직전요소보다 커야만 함
		}
		
		System.out.print("검색 키 : ");
		int key = sc.nextInt();
		//int idx = Arrays.binarySearch(x, key);
		int idx = binSearch(x, num, key);
		
		if (idx < 0) {
			System.out.printf("검색에 실패했습니다. %d의 삽입포인트는 x[%d]에 있습니다.\n", key, idx);
		} else {
			System.out.printf("%d는 x[%d]에 있습니다.\n", key, idx);
		}
	
	}
}
