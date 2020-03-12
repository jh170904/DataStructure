package com.programmers.level1.day02;

/*
 * 모의고사 - TODO 다시풀기
 문제 설명
 수포자는 수학을 포기한 사람의 준말입니다. 
 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 제한 조건
 시험은 최대 10,000 문제로 구성되어있습니다.
 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 * 
 * */

public class Solution11 {
	public int[] solution(int[] answers) {
		int[] answer;
		int[] count = new int[3]; // 정답수 
		int topCount = 1;
		int max = 0;
		int supoja2[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int supoja3[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int k = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == ((i + 1) % 5))
				count[0]++;// 1번 수포자 정답 
			if (answers[i] == supoja2[i % 8])
				count[1]++;// 2번 수포자 정답 
			if (answers[i] == supoja3[i % 10])
				count[2]++;// 3번 수포자 정답 
		}

		// 가장 높은 점수와 인원 수 찾기 
		for (int j = 0; j < 3; j++) {
			if (count[j] == max) {
				topCount++;
			}

			if (count[j] > max) {
				max = count[j];
				topCount = 1;// 최대치갱신으로 초기화 
			}
		}

		// 배열 변환 
		answer = new int[topCount];
		for (int j = 0; j < 3; j++) {
			if (count[j] == max) {
				answer[k++] = j + 1;
			}
		}
		return answer;
	}
}