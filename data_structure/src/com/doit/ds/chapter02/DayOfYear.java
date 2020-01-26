package com.doit.ds.chapter02;

import java.util.Scanner;

//해당년도의 경과 일수를 구함
public class DayOfYear {
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //윤년
	};
	
	//서기 year년은 윤년인가 (1:윤년/2:평년)
	static int isLeap(int year) {
		return (year%4==0 && year%100!=0 || year%400==0) ? 1:0;
	}
	
	//서기 y년 m월 d일의 그해 경과 일수를 구함
	static int dayOfYear(int y, int m, int d) {
		int days = d; //일수
		System.out.print(days+"일+ ");
		for (int i=1; i<m; i++) {
			days += mdays[isLeap(y)][i-1]; //평년이면 0, 윤년이면 1
			System.out.printf("%d(idx:%d) " , mdays[isLeap(y)][i-1], (i-1));
		}
		return days;
	}
	
	/**
	 * 연습문제 Q8 
	 * 변수 i와 days 없이 while문을 사용하여 구현
	 */ 
	static int dayOfYearWhile(int y, int m, int d) {

		System.out.print(d+"일+ ");
		while (--m > 0) {
			d += mdays[isLeap(y)][m-1]; 
			System.out.printf("%d(idx:%d) ", mdays[isLeap(y)][m-1], (m-1));
		}
		return d;
	}
	
	/**
	 * 연습문제 Q9
	 * 서기 y년 m월 d일의 그해 남은 일수를 구함
	 */ 
	static int leftDayOfYear(int y, int m, int d) {
		int days = mdays[isLeap(y)][m-1]-d;
		for (int i=m; i<12; i++) {
			days += mdays[isLeap(y)][i]; //평년이면 0, 윤년이면 1
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		int year, month, day;
		System.out.println("특정연도의 경과 일수를 구합니다.");
		do {
			System.out.print("년:");
			year = sc.nextInt();
			System.out.print("월:");
			month = sc.nextInt();
			System.out.print("일:");
			day = sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			System.out.printf("연습문제8: 그 해 %d일째입니다.\n", dayOfYearWhile(year, month, day));
			System.out.printf("연습문제9: 그 해 남은 일자는 %d일입니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1:Y/0:N):");
			retry = sc.nextInt();
		} while(retry == 1);
		
		sc.close();
	}
}
