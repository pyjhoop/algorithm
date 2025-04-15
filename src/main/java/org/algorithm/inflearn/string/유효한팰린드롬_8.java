package org.algorithm.inflearn.string;

import java.io.*;
public class 유효한팰린드롬_8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
        br.close();
    }

    public static String solution(String str) {
        str = str.toLowerCase();
        StringBuilder res = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                res.append(c);
            }
        }

        String origin = res.toString();
        String reverse = res.reverse().toString();
        if(origin.equals(reverse)) {
            return "YES";
        }else {
            return "NO";
        }
    }
}
