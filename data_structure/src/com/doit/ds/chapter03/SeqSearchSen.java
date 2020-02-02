package com.doit.ds.chapter03;

import java.util.Scanner;

//선형검색(보초법)
public class SeqSearchSen {
	static int seqSearchSenWhile(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;//보초를 추가
		while (true) {
			if (a[i] == key) 
				break;
			i++;
		}
		return i == n ? -1 : i; //검색결과 인덱스가 길이와 일치할 경우 키 존재. 
	}

	/**
	 * 연습문제 Q1
	 */
	static int seqSearchSenFor(int[] a, int n, int key) {
		int i;
		a[n] = key;//보초를 추가
		
		for(i=0; i<a.length; i++) {
			if (a[i] == key) 
				break;
		}
		return i == n ? -1 : i; //검색결과 인덱스가 길이와 일치할 경우 키 존재. 
	}
	
	/**
	 * 연습문제 Q2
	 */
	static int seqSearchSenPrint(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;//보초를 추가
		System.out.print("  |");
		for(int j=0; j<n; j++) {
			System.out.printf("%2d",j);//인덱스 출력
		}
		System.out.print("\n--+------------------------\n");
		
		for(i=0; i<n; i++) {
			System.out.print("  | ");
			for(int k=0; k<i; k++) {
				System.out.print("  ");//공백 출력
			}
			System.out.printf("*\n%2d|",i);
			for(int j=0; j<n; j++) {
				System.out.printf("%2d",a[j]);//값 출력
			}
			System.out.println();
			if (a[i] == key) 
				break;
		}
		return i == n ? -1 : i; //검색결과 인덱스가 길이와 일치할 경우 키 존재. 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int x[] = new int[num+1];	//전체요솟수+1
		
		for (int i=0; i<num; i++) {
			System.out.printf("x[%d]:", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색 키 : ");
		int key = sc.nextInt();
		//int idx = seqSearchSenWhile(x, num, key);
		//int idx = seqSearchSenFor(x, num, key);
		int idx = seqSearchSenPrint(x, num, key);
		
		if (idx == -1) {
			System.out.println("검색 결과 일치하는 요소가 없습니다.");
		} else {
			System.out.printf("%d는 x[%d]에 있습니다.\n", key, idx);
		}
	}
}
