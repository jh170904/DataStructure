package com.doit.ds.chapter02;
//신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함

import java.util.Scanner;

public class PhysicalExamination {
	static final int VMAX = 21; //시력분포(0.0에서 0.1단위로 21개)
	
	static class PhyscData {
		//필드
		String name;	//이름
		int height;		//키
		double vision;	//시력
		
		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		//키 평균 구하기
		static double avgHeight(PhyscData[] dat) {
			double sum = 0;
			for (int i=0; i < dat.length; i++)
				sum += dat[i].height;
			
			return sum / dat.length;
		}
		
		//시력 분포 구하기
		static void distVision(PhyscData[] dat, int[] dist) {
			int i = 0;
			dist[i] = 0;
			for (i=0; i<dat.length; i++) {
				if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10.0)
					dist[(int)(dat[i].vision * 10)]++;
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PhyscData[] x = {
					new PhyscData("가가가", 162, 0.3),
					new PhyscData("나나나", 173, 0.8),
					new PhyscData("다다다", 175, 2.0),
					new PhyscData("라라라", 171, 1.5),
					new PhyscData("마마마", 168, 0.4),
					new PhyscData("바바바", 174, 1.2),
					new PhyscData("사사사", 169, 0.8),
			};
			
			int[] vdist = new int[VMAX]; //시력분포
			
			System.out.println("  신체검사 리스트  ");
			System.out.println("이름     키   시력");
			System.out.println("-------------------");
			for (int i=0; i <x.length; i++) {
				System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			}
			System.out.printf("\n평균 키 : %5.1fcm\n", avgHeight(x));
			
			distVision(x, vdist);
			System.out.println("\n시력분포");
			for (int i=0; i < VMAX; i++) {
				System.out.printf("%3.1f ~ :%2d명\t", i/10.0, vdist[i]);
				if ((i+1)%5==0) {
					System.out.println();
				}
			}
			/**
			 * 연습문제 Q10
			 * 시력 분포를 기호문자 *을 이용해 출력되도록 작성
			 */
			System.out.println("\n\n시력분포(*)");
			for (int i=0; i < VMAX; i++) {
				System.out.printf("%3.1f ~ : ", i/10.0);
				for (int j=0; j<vdist[i]; j++)
					System.out.print("*");
				
				if ((i+1)%5==0) {
					System.out.println();
				} else {
					System.out.print("\t");
				}
			}
			
		}
	}
}
