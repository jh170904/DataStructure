package com.doit.ds.chapter05;

import java.util.Scanner;

//하노이의 탑
public class Hanoi {
	//no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) {
		if (no > 1) {
			move(no-1, x, 6-x-y);
		}
		System.out.printf("원반[%d]를 %d기둥에서 %d기둥으로 옮김\n", no, x, y);
		if (no > 1) {
			move(no-1, 6-x-y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("하노이의 탑");

		System.out.print("원반개수를 입력하세요 x: ");
		int n = stdIn.nextInt();

		move(n,1,3);
		
		stdIn.close();
	}
	
}
