package com.doit.ds.chapter02;
// 1000 이하의 소수를 열거
public class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0;				//나눗셈 횟수
		int ptr = 0;					//찾은 소수의 갯수
		int prime[] = new int[500]; 	//소수점을 저장하는 배열. 짝수는 소수가 아니므로 500보다 클 수 없음
		
		prime[ptr++] = 2;				//2는 소수
		
		for(int n=3;n<=1000; n+=2) {
			int i;
			for(i=1; i<ptr; i++) { 		//이미 찾은 소수로 나누어보기
				counter++;
				if (n%prime[i]==0)
					break;	//나누어 떨어지면 소수가 아니므로 반복 불필요
			}
			if(ptr==i) 
				prime[ptr++] = n; //마지막까지 나누어떨어지지 않아 소수이므로 배열에 저장
		}
		
		for(int i=0; i <ptr; i++)
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);//14622
	}
}
