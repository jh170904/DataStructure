package com.doit.ds.chapter03;

//public interface Comparable<T> {
//  public int compareTo(T o);
//}

//자연정렬(natural ordering)
public class A implements Comparable<A>{

	@Override
	public int compareTo(A c) {
		//this가 c보다 크면 양의 값 반환
		//this가 c보다 작으면 음의 값 반환
		//this가 c와 같으면 0 반환
		return 0;
	}

	@Override
	public boolean equals(Object c) {
		//this가 c와 같으면 true 반환
		//this가 c와 다르면 false 반환
		return false;
	}
}
