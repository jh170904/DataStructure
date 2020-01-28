package com.doit.ds.chapter03;

import java.util.Scanner;

//선형검색
public class SeqSearch {
	static int seqSearchWhile(int[] a, int n, int key) {
		int i = 0;
		while (true) {
			if (i == n) {
				return -1;	//검색실패
			}
			if (a[i] == key) {
				return i; 	//검색성공(인덱스 반환)
			}
			i++;
		}
	}
	
	
	static int seqSearchFor(int[] a, int n, int key) {
		for (int i=0; i<n; i++) {
			if (a[i] == key) {
				return i; 	//검색성공(인덱스 반환)
			}
		}
		return -1;			//검색실패
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.printf("x[%d]:", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색 키 : ");
		int key = sc.nextInt();
		int idx = seqSearchWhile(x, num, key);
		
		if (idx == -1) {
			System.out.println("검색 결과 일치하는 요소가 없습니다.");
		} else {
			System.out.printf("%d는 x[%d]에 있습니다.\n", key, idx);
		}
	}
}
