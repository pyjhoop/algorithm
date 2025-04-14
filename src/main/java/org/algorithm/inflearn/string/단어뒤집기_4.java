package org.algorithm.inflearn.string;

import java.io.*;
public class 단어뒤집기_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            s = solution(s);
            result.append(s).append("\n");
        }

        System.out.println(result);


    }

    public static String solution(String str) {

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            char temp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = temp;
            lt++;
            rt--;
        }
        return new String(chars);
    }
}
