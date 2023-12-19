package 배열;
import java.util.*;
import java.io.*;

public class boj_10813 {
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        int k, j, temp;

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            temp = arr[j-1];
            arr[j-1] = arr[k-1];
            arr[k-1] = temp;
        }

        for(int a: arr){
            sb.append(a).append(" ");
        }
        System.out.println(sb);

    }
}
