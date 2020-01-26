package com.doit.ds.chapter02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구하기");
		//System.out.print("사람 수: ");
		//int num = sc.nextInt();
		
		// 연습문제 Q1 : 사람수도 난수로 생성
		int num = rd.nextInt(10); 
		
		int height[] = new int[num];
		
		for (int i=0; i<num; i++) {
			height[i] = 100 + rd.nextInt(90); //난수
			System.out.println("height["+i+"]:"+height[i]);
		}
		
		System.out.println("최대값:"+maxOf(height));
		sc.close();
	}
}
