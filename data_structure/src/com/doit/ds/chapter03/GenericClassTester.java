package com.doit.ds.chapter03;
//제네릭 클래스의 예

public class GenericClassTester {
	//제네릭 클래스의 파라미터를 T라고 작성
	
	static class GenericClass<T>{
		private T xyz;
		
		//생성자
		GenericClass(T t) {
			this.xyz = t;
		}
		
		T getXyz () {
			return xyz;
		}
	}
	

	public static void main(String[] args) {
		// 파라미터에 String을 넘길 수도 있고 Integer도 넘길 수 있음
		GenericClass<String> str = new GenericClass<String>("ABC");
		GenericClass<Integer> number = new GenericClass<Integer>(123);
		
		System.out.println(str.getXyz());
		System.out.println(number.getXyz());
	}
}
