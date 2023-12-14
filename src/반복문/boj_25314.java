package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_25314 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int loop = n/4;

        for(int i = 0; i < loop; i++){
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb);
    }
}
