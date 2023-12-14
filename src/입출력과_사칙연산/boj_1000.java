package 입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class boj_1000 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        System.out.println(result);

    }
}