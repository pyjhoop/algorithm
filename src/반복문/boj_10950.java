package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class boj_10950 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int loop = Integer.parseInt(br.readLine());
        int a, b;

        for(int i = 0; i < loop; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }

        System.out.println(sb);
    }
}
