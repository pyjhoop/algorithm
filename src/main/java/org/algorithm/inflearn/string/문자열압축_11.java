package org.algorithm.inflearn.string;
import java.io.*;
public class 문자열압축_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
        br.close();
    }

    public static String solution(String input) {
        char temp = ' ';
        int cnt = 1;
        StringBuilder sb = new StringBuilder();

        for(char c: input.toCharArray()) {
            if(temp == c) {
                cnt++;
            }else {
                if(cnt != 1) sb.append(cnt);
                sb.append(c);
                temp = c;
                cnt = 1;
            }
        }
        if(cnt != 1) sb.append(cnt);
        return sb.toString();
    }
}
