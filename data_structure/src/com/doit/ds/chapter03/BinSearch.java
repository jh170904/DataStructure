package com.doit.ds.chapter03;

import java.util.Scanner;

//이진검색
public class BinSearch {
	
	static int binSearch(int[] arr, int n, int key) {
		int pl = 0;			// 검색범위 첫번째 인덱스
		int pr = n-1;		// 검색범위 마지막 인덱스
		do {
			int pc = (pl+pr)/2;		// 중앙 인덱스
			if (arr[pc] == key) {
				return pc;			// 검색 성공
			} else {
				pr = pc -1;//검색범위를 첫번째인덱스~중앙값으로 좁힘
			}
		} while (pl <= pr);
		
		return -1;//검색실패
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
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
		int idx = binSearch(x, num, key);
		
		if (idx == -1) {
			System.out.println("검색 결과 일치하는 요소가 없습니다.");
		} else {
			System.out.printf("%d는 x[%d]에 있습니다.\n", key, idx);
		}
	
	}
}
