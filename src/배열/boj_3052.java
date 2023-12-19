package 배열;

import java.io.*;
public class boj_3052 {
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[42];
        int temp, rest;
        int count = 0;

        for(int i = 0; i < 10; i++){
            temp = Integer.parseInt(br.readLine());
            rest = temp % 42;
            arr[rest] = 1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) count++;
        }

        System.out.println(count);
    }
}
