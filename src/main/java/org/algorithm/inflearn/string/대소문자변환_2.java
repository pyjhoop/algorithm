package org.algorithm.inflearn.string;

import java.io.*;
public class 대소문자변환_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(solution(str));
        br.close();
    }

    public static String solution(String str) {
        // 먼저 대소문자 차이를 구해야함.
        // 반복문으로 a, z A,Z 사이인지 판단하고 소문자는 +, 대문자는 -
        // 문자 대소문자 판단은 isUpperCase(), isLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(c >= 'a' && c <= 'z') sb.append((char) (c - 32));
            else sb.append((char) (c + 32));
        }
        return sb.toString();
    }

    /** note
     * 문자의 대소문자 판단은 Character.isUpperCase(), Character.isLowerCase()
     * 아스키 코드 대소문자의 아스키 코드 차이는 32고, 대문자가 소문자보다 작은 수를 갖기에 이요하면됨.
     */


}
