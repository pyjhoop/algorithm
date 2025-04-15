package org.algorithm.inflearn.string;

import java.io.*;
public class 숫자만추출_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
        br.close();
    }

    public static int solution(String str) {
        str = str.replaceAll("[^0-9]","");
        return Integer.parseInt(str);
    }
}
