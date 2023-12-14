package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2439 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int a = 0;
        int b = 0;
        String temp;

        while((temp = br.readLine()) != null){
            st = new StringTokenizer(temp);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
