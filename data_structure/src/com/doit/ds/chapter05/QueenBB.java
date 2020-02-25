package com.doit.ds.chapter05;
// 각 행 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열
public class QueenBB {
	static boolean[] flag = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
	static int[] pos = new int[8];			// 각 열의 퀸의 위치

	// 각 열의 퀸의 위치를 출력한다.
	static void print() {
		for (int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	// i열의 알맞은 위치에 퀸을 배치한다.
	static void set(int i) {
		for (int j=0; j<8; j++) {
			if(!flag[j]) {
				pos[i] = j;
				
				if (i==7) {
					print();
				} else {
					flag[j] = true;
					set(i+1);
					flag[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
