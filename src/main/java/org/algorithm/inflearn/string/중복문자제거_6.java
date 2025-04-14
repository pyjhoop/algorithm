package org.algorithm.inflearn.string;

import java.io.*;
import java.util.*;
public class 중복문자제거_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = solution(input);
        System.out.println(result);
        br.close();

    }

    public static String solution(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                result.append(c);
                map.putIfAbsent(c, 0);

            }
        }
        return result.toString();
    }
}
