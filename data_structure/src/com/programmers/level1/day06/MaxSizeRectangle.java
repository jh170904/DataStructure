package com.programmers.level1.day06;

public class MaxSizeRectangle {
	/*
	 * 1와 0로 채워진 표(board)가 있습니다. 
	 * 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 
	 * 표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. 
	 * (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)
	 * */
    public int solution(int [][]board) {
        int answer = 0;
        int row = board.length;     // 행
        int col = board[0].length;  // 열
        int dp[][] = new int[1001][1001];	//동적 크기를 담을 배
        for (int i=1; i<=row; ++i) {
            for (int j=1; j<=col; ++j) {
                if (board[i-1][j-1] != 0){
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1])) + 1;
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }
        return answer * answer;
    }
}
