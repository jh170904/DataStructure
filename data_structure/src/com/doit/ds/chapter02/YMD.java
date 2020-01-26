package com.doit.ds.chapter02;

import java.util.Scanner;

/**
 * 연습문제 Q11
 * 서기 년월일을 필드로 갖는 클래스 생성
 */
public class YMD {		
	int y;	//년
	int m;	//월
	int d;	//일
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //윤년
		};
	
	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	//서기 year년은 윤년인가 (1:윤년/2:평년)
	static int isLeap(int year) {
		return (year%4==0 && year%100!=0 || year%400==0) ? 1:0;
	}
	
	//n일 뒤의 일자를 반환
	public void after(int n) {
		//1년 초과 확인
		if(n > 365) {
			this.y += (n/365);
			n %= 365;
		}
		while(n>0) {
			if (n > (mdays[isLeap(this.y)][this.m-1] - this.d)) {
				n -= (mdays[isLeap(this.y)][this.m-1] - this.d);
				this.m++;
				this.d = 0;
			} else {
				this.d += n;
				n = 0;
			}
		}
		print();
	}
	
/*	public void after(int n) {
		//일자계산
		if (n > (mdays[isLeap(this.y)][this.m-1] - this.d)) {
			n -= (mdays[isLeap(this.y)][this.m-1] - this.d);
			this.m++;
			this.d = 0;
		} else {
			this.d += n;
			n = 0;
		}

		//월 계산
		while(n>0) {
			if(n > mdays[isLeap(this.y)][this.m]) {
				n -= mdays[isLeap(this.y)][this.m++];
			} else {
				if(this.d+n<mdays[isLeap(this.y)][this.m]) {
					this.d += n;
					n = 0;
				} else {
					this.d += n;
					n = 0;
				}
			}
		}
	}
*/
	public void print() {
		StringBuffer sb = new StringBuffer("일자는 ");
		sb.append(this.y).append("년 ")
			.append(this.m).append("월 ")
			.append(this.d).append("일 입니다.");
		System.out.println(sb.toString());
	}
	
	//n일 앞의 날짜를 반환
	public void before(int n) {
		//1년 초과 확인
		if(n > 365) {
			this.y -= (n/365);
			n %= 365;
		}
		while(n>0) {
			if (n > this.d) {
				n -= this.d;
				this.m--;
				this.d = mdays[isLeap(this.y)][this.m-1];
			} else {
				this.d -= n;
				n = 0;
			}
		}
		print();		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		int year, month, day;
		System.out.println("특정연도의 경과 일수를 구합니다.");
		do {
			do {
				System.out.print("년:");
				year = sc.nextInt();
			} while (year<0);
			do {
				System.out.print("월:");
				month = sc.nextInt();
			} while (month< 0 && month > 12);
			do {
				System.out.print("일:");
				day = sc.nextInt();
			} while (day<0 && day>mdays[isLeap(year)][month]);
			
			YMD ymd = new YMD(year, month, day);
			System.out.print("현재 일자에서 157일 이후:");
			ymd.after(157);
			
			System.out.print("현재 일자에서 430일 이전:");
			ymd.before(430);
			
			System.out.print("한 번 더 할까요? (1:Y/0:N):");
			retry = sc.nextInt();
		} while(retry == 1);
		
		sc.close();
	}
}