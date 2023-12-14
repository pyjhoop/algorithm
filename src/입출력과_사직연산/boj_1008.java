package 입출력과_사직연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1008 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double result = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken());

        System.out.println(result);

    }
}