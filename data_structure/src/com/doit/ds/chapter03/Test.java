package com.doit.ds.chapter03;

public class Test {
	/**
	 * 연습문제 Q3 key와 일치한 요솟수의 인덱스를 반환하는 메소드
	 */
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int seq = 0;
		for (int i=0; i<n; i++) {
			if (key == a[i]) {
				idx[seq++] = i;
			}
		}
		return seq;
	}
	
	/**
	 * 연습문제 Q4 이진검색의 과정을 자세히 출력하는 메소드
	 */
	static int binSearchPrint(int[] arr, int n, int key) {
		int pl = 0;			// 검색범위 첫번째 인덱스
		int pr = n-1;		// 검색범위 마지막 인덱스
		
		System.out.print("  |");
		for(int j=0; j<n; j++) {
			System.out.printf("%2d",j);//인덱스 출력
		}
		System.out.print("\n--+------------------------\n");
		
		do {
			int pc = (pl+pr)/2;		// 중앙 인덱스

			System.out.print("  | <-");
			for(int k=0; k<pc-1; k++) {
				System.out.print("  ");//공백 출력
			}
			System.out.print("+");
			for(int k=0; k<pc-1; k++) {
				System.out.print("  ");//공백 출력
			}
			System.out.print("->\n");
			
			System.out.printf("%2d|",pc);//현재 인덱스 출력
			for(int j=0; j<n; j++) {
				System.out.printf("%2d",arr[j]);//값 출력
			}
			System.out.println();
			
			if (arr[pc] == key) {
				return pc;			// 검색 성공
			} else {
				pr = pc -1;//검색범위를 첫번째인덱스~중앙값으로 좁힘
			}
		} while (pl <= pr);
		
		return -1;//검색실패
	}
	
	/**
	 * 연습문제 Q5 이진검색중 같은값을 같는 요소가 있을 경우 가장 앞에 요소를 반환.
	 */
	static int binSearchX(int[] arr, int n, int key) {
		int pl = 0;			// 검색범위 첫번째 인덱스
		int pr = n-1;		// 검색범위 마지막 인덱스
		do {
			int pc = (pl+pr)/2;		// 중앙 인덱스
			if (arr[pc] == key) {
				
				for(int i=pc; i>pl; i--) {
					if (arr[i] == key) {
						pc = i;
					}
				}
				return pc;			// 검색 성공
			} else {
				pr = pc -1;//검색범위를 첫번째인덱스~중앙값으로 좁힘
			}
		} while (pl <= pr);
		
		return -1;//검색실패
	}
	
	public static void main(String[] args) {
		// 연습문제3
		int[] arr = {1,9,2,9,4,6,7,9};
		int key = 9;
		int num = 8;
		int[] idx = new int[num];
		int result = searchIdx(arr, num, key, idx);
		StringBuffer sb = new StringBuffer("key와 일치한 요소의 인덱스 :{");
		
		for (int i=0; i<result; i++) {
			sb.append(idx[i]);
			if(i == result-1) {
				sb.append("}\n");
			} else {
				sb.append(", ");
			}
		}
		System.out.println(sb.toString());
		
		// 연습문제4
		int[] arr2 = {1,2,3,5,6,8,9};
		int key2 = 2;
		int num2 = 7;
		int result2 = binSearchPrint(arr2, num2, key2);
		if (result2 == -1) {
			System.out.println("검색 결과 일치하는 요소가 없습니다.\n");
		} else {
			System.out.printf("%d는 x[%d]에 있습니다.\n\n", key2, result2);
		}
		
		
		// 연습문제5
		int[] arr3 = {1,3,5,7,7,7,7,8,8,9,9};
		int key3 = 7;
		int num3 = 11;
		int result3 = binSearchX(arr3, num3, key3);
		if (result3 == -1) {
			System.out.println("검색 결과 일치하는 요소가 없습니다.\n");
		} else {
			System.out.printf("첫번째 %d는 x[%d]에 있습니다.\n\n", key3, result3);
		}
	}
}
