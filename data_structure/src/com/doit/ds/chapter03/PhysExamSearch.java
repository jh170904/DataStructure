package com.doit.ds.chapter03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

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
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.heigth > o2.heigth) ? 1 : (o1.heigth < o2.heigth) ? -1 : 0;
			}
		}
		
		private static class VisionOrderComparator implements Comparator<PhyscData> {
			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.vision > o2.vision) ? -1 : (o1.vision < o2.vision) ? 1 : 0;
			}
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PhyscData[] x = {
				new PhyscData("가가가", 162, 0.9d),
				new PhyscData("나나나", 183, 0.4d),
				new PhyscData("다다다", 175, 0.5d),
				new PhyscData("라라라", 179, 1.5d),
				new PhyscData("마마마", 188, 0.4d),
				new PhyscData("바바바", 194, 1.2d),
				new PhyscData("사사사", 159, 0.8d)
			};
			int idx = 0;
			
			while(true) {
				System.out.print("검색조건? 키(1)/시력(2):");
				int search = sc.nextInt();
				
				
				switch (search) {
				case 1:
					System.out.print("키가 몇cm인 사람을 찾고 있나요? :");
					int height = sc.nextInt();
					idx = Arrays.binarySearch(
							x,								//배열 x에서 탐색
							new PhyscData("", height, 0.0),	//키가 height인 요소
							PhyscData.HEIGHT_ORDER			//PhyscData.HEIGHT_ORDER에 의해 검색
							);
					break;
				case 2:
					System.out.print("특정 시력을 가진 사람을 찾고 있나요? :");
					double vision = sc.nextDouble();
					idx = Arrays.binarySearch(
							x,								//배열 x에서 탐색
							new PhyscData("", 0, vision),//시력이 vision인 요소
							PhyscData.VISION_ORDER 			//PhyscData.HEIGHT_ORDER에 의해 검색
							);
					
					break;
				}
				
				if (idx < 0) {
					System.out.println("검색 결과 일치하는 요소가 없습니다.");
				} else {
					System.out.println("x["+idx+"]에 있습니다.\n");
					System.out.println("찾은데이터 : "+x[idx].toString());
				}
								
				System.out.print("계속하나요? [Y:1/N:0] >>>>>>>>>>>>>");
				if (sc.nextInt()>0) {
					continue;
				} else {
					break;
				}
			
			}
			
			sc.close();
			
		}
	}
}
