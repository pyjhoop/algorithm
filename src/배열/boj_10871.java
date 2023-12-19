package 배열;
import java.io.*;
import java.util.*;

public class boj_10871 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(x > temp){
                sb.append(temp).append(" ");
            }
        }

        System.out.println(sb);
    }
}
