package com.doit.ds.chapter02;

public class CloneArr {
	// 배열의 복제
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = a.clone();
		
		b[3] = 0; // 배열변수 b의 참조가 배열a의 본체가 아니라 복제본임을 확인가능
		
		System.out.print("a = ");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		
		System.out.print("\nb = ");
		for(int i = 0; i < b.length; i++) {
			System.out.printf("%d ", b[i]);
		}
	}
}
