package org.algorithm.inflearn.string;
import java.io.*;
public class 회문문자열_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = solution(input);

        System.out.println(result);
        br.close();
    }

    public static String solution(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        if(str.contentEquals(sb)) {
            return "YES";
        }else {
            return "NO";
        }
    }
}
