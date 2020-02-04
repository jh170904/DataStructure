package com.doit.ds.chapter04;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue queue = new IntQueue(64);		//최대 64개를 인큐할 수 있는 큐
		
		while (true) {
			System.out.println("현재 데이터 수 :" + queue.size() + "/" + queue.capacity());
			System.out.print("(1)push\t(2)pop\t(3)peek\t(4)dump\t(5)quit :");
			
			int menu = sc.nextInt();
			if(menu == 0)
				break;
			
			int x;
			switch (menu) {
			
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					queue.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x = queue.deque();
					System.out.println("deque 결과 데이터 : " + x);
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었습니다.");
				}
				break;
				
			case 3:
				try {
					x = queue.peek();
					System.out.println("peek 결과 데이터 : " + x);
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었습니다.");
				}			
				break;
				
			case 4:
				queue.dump();
				break;
			default:
				break;
			}
		
		}
	}
}
