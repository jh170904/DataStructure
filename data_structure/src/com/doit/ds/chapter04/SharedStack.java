package com.doit.ds.chapter04;
/*
 * 연습문제Q3 하나의 배열을 공유하여 
 * 2개의 스택을 구현하는 int형 데이터용 스택  만들기
 * 스택에 저장하는 데이터는 int형 값으로 배열의 처음과 끝을 사용하세요
 * */
public class SharedStack {
	
	private int max;		//스택용량
	private int ptrFront;	//스택포인터
	private int ptrTail; 	//스택포인터
	private int[] stk;		//스택본체

}
