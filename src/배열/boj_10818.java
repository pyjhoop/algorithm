package 배열;

import java.io.*;
import java.util.*;
public class boj_10818 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int init = Integer.parseInt(st.nextToken());

        int min = init;
        int max = init;

        for(int i = 1; i < n; i++){
            int temp = Integer.parseInt(st.nextToken());

            if(temp > max){
                max = temp;
            }else if(min > temp){
                min = temp;
            }

        }

        System.out.println(min + " " + max);
    }
}
