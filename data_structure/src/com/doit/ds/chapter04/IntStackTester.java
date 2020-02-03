package com.doit.ds.chapter04;

import java.util.Scanner;

//int형 스택 사용 예시
public class IntStackTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack stack = new IntStack(64); //최대 64개를 푸시할 수 있는 스택
		
		
		while (true) {
			System.out.println("현재 데이터 수 : "+ stack.size() + "/" + stack.capacity());
			System.out.print("(1)push\t(2)pop\t(3)peek\t(4)dump\t(5)quit :");
			
			int menu = sc.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch (menu) {
			
			case 1:
				System.out.print("입력데이터 : ");
				x = sc.nextInt();
				try {
					stack.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x = stack.pop();
					System.out.println("pop 결과 데이터 : " + x);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
				
			case 3:
				try {
					x = stack.peek();
					System.out.println("peek 결과 데이터 : " + x);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}			
				break;
				
			case 4:
				stack.dump();
				break;
			default:
				break;
			}
		}
	}
}
