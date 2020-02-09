package com.doit.ds.chapter04;

import java.util.Scanner;

//int형 스택 사용 예시
public class IntStackTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack stack = new IntStack(64); //최대 64개를 푸시할 수 있는 스택
		
		
		while (true) {
			System.out.println("현재 데이터 수 : "+ stack.size() + "/" + stack.capacity());
			System.out.print("(1)push\t(2)pop\t(3)peek\t(4)dump\n");
			System.out.print("(5)indexOf\t(6)clear\t(7)isEmpty\t(8)isFull\t(9)quit :");
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
				
			case 5:
				//indexOf
				System.out.print("입력데이터 : ");
				int search = sc.nextInt();
				x = stack.indexOf(search);
				if (x > 0) {
					System.out.printf("%d는 스택에 [idx:%d] 존재합니다.", search, x);
				}
				break;
			case 6:
				//clear
				stack.clear();
				break;
			case 7:
				//isEmpty
				System.out.println("스택은 "+ (stack.isEmpty()?"비었습니다":"비지 않았습니다."));
				break;
			case 8:
				//isFull
				System.out.println("스택은 "+ (stack.isFull()?"꽉 찼습니다":"꽉 차지 않았습니다."));
				break;
			default:
				break;
			}
		}
		
		sc.close();
	}
}
