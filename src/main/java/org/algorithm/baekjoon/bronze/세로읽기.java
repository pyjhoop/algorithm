package org.algorithm.baekjoon.bronze;

import java.io.IOException;
import java.util.*;

public class 세로읽기 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[5];
        int maxLength = 0;

        // 5개의 문자열 입력 받기
        for (int i = 0; i < 5; i++) {
            strings[i] = sc.nextLine();
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
            }
        }

        StringBuilder result = new StringBuilder();

        // 세로로 읽기
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < strings[j].length()) {
                    result.append(strings[j].charAt(i));
                }
            }
        }

        // 결과 출력
        System.out.println(result.toString());
    }
}
