package com.doit.ds.chapter02;
//배열의 모든 요소의 합을 구하여 출력함(확장 for문. for-each문)
public class ArraySumForIn {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		for (int i=0; i <a.length; i++) {
			System.out.printf("a[%d]=%3.1f\n", i, a[i]);
		}
		double sum = 0;
		for(double i : a)
			sum += i;
		System.out.printf("\n모든 요소의 합은 %3.1f입니다.\n",sum);
	}
}
