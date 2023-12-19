package 배열;
import java.io.*;
import java.util.*;

public class boj_10810 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        int i, j, k;

        for(int p = 0; p < m; p++){
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            for(int q = i-1; q < j; q++){
                arr[q] = k;
            }
        }

        for(int a: arr){
            sb.append(a).append(" ");
        }

        System.out.println(sb);

    }
}
