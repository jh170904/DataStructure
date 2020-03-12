package com.algo.algorithm.day05;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sol3 {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i=0;i<n;i++){
            for(int j=1; j<=n;j++){
                System.out.print("#");
            }
            for(int j=n; j<0;j--){
            	System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

