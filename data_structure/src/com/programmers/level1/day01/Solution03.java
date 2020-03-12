package com.programmers.level1.day01;
/*
	x��ŭ ������ �ִ� n���� ����
	���� ����
	�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	n�� 1000 ������ �ڿ����Դϴ�.
*/
public class Solution03 {
  public long[] solution(int x, int n) {
      long[] answer = new long[n];
      long next = 0;
      for(int i=0; i<n;i++){
          next += x;
          answer[i] = next;
      }
      return answer;
  }
}