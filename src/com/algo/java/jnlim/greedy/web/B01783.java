package com.algo.java.jnlim.greedy.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 병든 나이트
 */
public class B01783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int result = 0;

        if (N == 1) {
            result = 1;
        } else if (N == 2) {
            result = Math.min((M + 1) / 2, 4);
        } else if (N >= 3) {
            if (M < 7) {
                result = Math.min(M, 4);
            } else {
                result = M - 2;
            }
        }

        System.out.println(result);
    }
}
