package org.algorithm.inflearn.string;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 가장짧은문자거리_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
        br.close();
    }

    public static String solution(String str) {
        String[] arr = str.split(" ");
        String string = arr[0];
        String target = arr[1];
        StringBuilder res = new StringBuilder();

        int[] indexArr = new int[string.length()];

        int p = 1000;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == target.charAt(0)) {
                p = 0;
                indexArr[i] = p;
            }else {
                indexArr[i] = ++p;
            }
        }

        for(int i = string.length() - 1; i >= 0; i--) {
            if(string.charAt(i) == target.charAt(0)) {
                p = 0;
                indexArr[i] = p;
            }else {
                int temp = indexArr[i];
                p += 1;
                indexArr[i] = Math.min(p, temp);
            }
        }

        for(int i : indexArr) {
            res.append(i).append(" ");
        }


        return res.toString();
    }
}
