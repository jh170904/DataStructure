package com.doit.ds.list;

public class SingleLinkedList {
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.retieve();
		ll.delete(2);
		ll.retieve();
	}
}

//단방 LinkedList 만들
class LinkedList{
	Node header;
	static class Node{
		int data;
		Node next = null;
	}
	LinkedList(){
		header = new Node();
	}

	// 데이터 추가 
	void append(int d){
		Node end = new Node();
		end.data = d; 			// 포인터 
		Node n = header;
		while(n.next!=null){ 	// 마지막 노드가 아닐때까지 반복 
			n=n.next;
		}
		n.next = end;			// 마지막 노드로 데이터 추
	}
	// 데이터 삭제 
	void delete(int d){
		Node n = header; 				//포인터 
		while(n.next != null){ 			//마지막 노드가 아닐떄까지 반복 
			if(n.next.data == d){
				n.next = n.next.next; 	//포인터를 다다음 노드로 변경, 연결 링크 변경
			}else{
				n = n.next;
			}
		}
	}
	// 전체 노드를 출력 
	void retieve(){
		Node n = header.next;//헤더의 다음번 데이터부터 출력 
		while(n.next!=null){
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println(n.data);
	}
}


