package com.doit.ds.chapter04;
/*
 * 연습문제Q2 Generic Stack 클래스 생성하기
 * */
public class Gstack<T extends Object> {

	private int max;	//스택용량
	private int ptr; 	//스택포인터
	private T[] stk;	//스택본체
	
	//생성자
	public Gstack (int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (T[])new Object[capacity];// 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {		// 생성할 수 없음
			max = 0;
		}
	}
	
	//스택에 x를 푸시
	public T push(T x) throws Exception {
		if (ptr >= max) {
			throw new Exception();
		}
		return stk[ptr++] = x;//스택 포인터 증가. 반환값은 푸시한 값
	}
	
	//스택에 데이터를 팝.(정상에 있는 데이터를 꺼냄)
	public T pop() throws Exception{
		if (ptr <= 0) {
			throw new Exception();//스택이 비어있음
		}
		return stk[--ptr];
	}
	
	//스택에 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public T peek() throws Exception{
		if (ptr <= 0) {
			throw new Exception();//스택이 비어있음
		}
		return stk[ptr-1];//데이터의 입력이나 출력이 없으므로 스택 포인터는 변화없음
	}
	
	//스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(T x) {
		for(int i=ptr-1;i>=0;i--) { //top부터 선형검색
			if(stk[i] == x) {
				return i;//검색성공
			}	
		}
		return -1;//검색실패
	}
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	//스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}
	
	//스택안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		} else {
			for(int i=0; i <ptr; i++) {
				System.out.print(stk[i]+" ");
			}
			System.out.println();
		}
	}
}
