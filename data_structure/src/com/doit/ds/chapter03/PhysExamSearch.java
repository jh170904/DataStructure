package com.doit.ds.chapter03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

	static class PhyscData{
		private String name;	//이름
		private int heigth;		//키
		private double vision;	//시력
		
		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.heigth = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + heigth + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator(); 
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.heigth > o2.heigth) ? 1 : 
					(o1.heigth < o2.heigth) ? -1 : 0;
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PhyscData[] x = {
				new PhyscData("가가가", 162, 0.3),
				new PhyscData("나나나", 173, 0.8),
				new PhyscData("다다다", 175, 2.0),
				new PhyscData("라라라", 179, 1.5),
				new PhyscData("마마마", 188, 0.4),
				new PhyscData("바바바", 194, 1.2),
				new PhyscData("사사사", 199, 0.8)
			};
			
			System.out.print("키가 몇cm인 사람을 찾고 있나요? :");
			int height = sc.nextInt();
			int idx = Arrays.binarySearch(
					x,								//배열 x에서 탐색
					new PhyscData("", height, 0.0),	//키가 height인 요소
					PhyscData.HEIGHT_ORDER			//PhyscData.HEIGHT_ORDER에 의해 검색
					);
			
			if (idx < -1) {
				System.out.println("검색 결과 일치하는 요소가 없습니다.");
			} else {
				System.out.println("x["+idx+"]에 있습니다.\n");
				System.out.println("찾은데이터 : "+x[idx].toString());
			}
		}
	}
}
