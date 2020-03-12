package com.programmers.level1.day03;

/*
 * 가운데 글자 가져오기
 문제 설명
 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 재한사항
 s는 길이가 1 이상, 100이하인 스트링입니다.
 * 
 * */
public class Solution06 {
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 1) {
			answer = Character.toString(s.charAt(s.length() / 2));
		} else {
			answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
		}
		return answer;
	}
} 