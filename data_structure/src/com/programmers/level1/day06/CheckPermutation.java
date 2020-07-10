package com.programmers.level1.day06;

public class CheckPermutation {
	
	/*
	 * 문제 설명
	길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
	1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
	
	제한사항
	배열의 길이는 10만 이하입니다.
	배열의 원소는 0 이상 10만 이하인 정수입니다.
	*/
    public boolean solution(int[] arr) {
        boolean answer = true;
        
        // 1. 전체 숫자가 존재하는 배열 생성
        int[] fullArray = new int[arr.length];    
        for(int i=0; i<arr.length; i++){
            fullArray[i] = i+1;
        }
        
        // 2. 인덱스와 값 일치 확인
        for (int element : arr){
            if (element > arr.length) {
                answer = false; // 최대치 초과
                break;
            } else if (fullArray[element-1] == -1){
                answer = false; // 중복값 존재
                break;
            } else {
                fullArray[element-1] = -1;
            }
        }
        
        for (int element : fullArray) {
            if (element > -1) {
                answer = false; // 누락 숫자 존재
            }
        }
        return answer;
    }
}
