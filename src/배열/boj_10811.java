package 배열;

import java.io.*;
import java.util.*;
public class boj_10811 {
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n,m;
        int x1, x2, bound;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());

            x1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());

            bound = x2 - x1;
            if(bound %2 == 0){
                for(int j = 0; j < bound/2; j++){
                    int temp = arr[x1+j];
                    arr[x1+j] = arr[x2-j];
                    arr[x2-j] = temp;
                }
            }else{
                for(int j = 0; j < bound /2 +1; j++){
                    int temp = arr[x1+j];
                    arr[x1+j] = arr[x2-j];
                    arr[x2-j] = temp;
                }
            }

        }

        for(int i = 1; i < arr.length; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);

    }
}
