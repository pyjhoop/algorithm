package org.algorithm.inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 문자찾기_1 {

    // ** 설명 ** //
    //한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
    //대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

    // ** 입력 ** //
//    첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//    문자열은 영어 알파벳으로만 구성되어 있습니다.


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char ch = br.readLine().charAt(0);
        System.out.println(solution(str, ch));

        br.close();
    }

    public static int solution(String str, char ch) {
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        int answer = 0;

        for(char c: str.toCharArray()){
            if(c == ch) answer++;
        }
        return answer;
    }

    /** Note
     * char의 대문자 또는 소문자 변경은 Character.toUpperCase(); Character.toLowerCase();
     **/


}
