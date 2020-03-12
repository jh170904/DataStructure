package com.doit.ds.list;

import java.util.EmptyStackException;

class Stack<T>{
	class Node<T>{ //같은 타입을 담는 노드 선
		private T data;
		private Node<T> next;
		public Node(T data){ // 생성자를 통해 멤버변수 저장 
			this.data = data;
		}
	}
	
	private Node<T> top;//포인터 
	
	public T pop(){//맨위에 있는 데이터를 반하는 메소
		if (top == null){
			throw new EmptyStackException();
		}
		T item = top.data; //맨 위에 있는 데이터를 반환하기 전에 그 다음 데이터를 top으로 이동 
		top = top.next;
		return item;
	}
	
	public void push(T item){//데이터 입력 
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}
	
	public T peek(){//맨 위에 있는 데이터를 반환하는 메소드. 단, 데이터가 사라지지 않음.  
		if (top == null){
			throw new EmptyStackException();
		}
		return top.data;
	}
}

public class Test1 {
	public static void main(String[] args){
	Stack<Integer> st = new Stack<Integer>();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.peek());
	System.out.println(st.pop());
	System.out.println(st.peek());
	System.out.println(st.pop());
	System.out.println(st.pop());

	}
}