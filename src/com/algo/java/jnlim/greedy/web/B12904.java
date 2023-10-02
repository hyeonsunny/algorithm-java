package com.algo.java.jnlim.greedy.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A와 B
 */
public class B12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();

        while (true) {
            if (S.length() == T.length()) {
                break;
            }

            if (T.charAt(T.length() - 1) == 'A') {
                T = T.substring(0, T.length() - 1);
            } else if (T.charAt(T.length() - 1) == 'B') {
                T = T.substring(0, T.length() - 1);
                T = new StringBuilder(T).reverse().toString();
            }
        }

        if (S.equals(T)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
