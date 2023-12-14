package 입출력과_사직연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10998 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

        System.out.println(result);

    }
}