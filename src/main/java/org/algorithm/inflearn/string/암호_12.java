package org.algorithm.inflearn.string;

import java.io.*;
public class 암호_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        System.out.println(solution(input, n));
        br.close();
    }

    public static String solution(String input, int n) {
        // 7자리씩 substring
        // # = 1, * = 0으로 전환후에 Integer.toBi?
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            String temp = input.substring(i * 7, (i+1) * 7);
            String temp2 = "";
            for(char c: temp.toCharArray()) {
                if(c == '#') {
                    temp2 = temp2 + "1";
                }else {
                    temp2 = temp2 + "0";
                }
            }
            int result = Integer.parseInt(temp2, 2);

            sb.append((char) result);
        }
        return sb.toString();
    }
}
