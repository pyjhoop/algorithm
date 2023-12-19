package 배열;

import java.io.*;
public class boj_5597 {
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int[] arr = new int[30];
        for(int i = 0; i < 28; i++){
            n = Integer.parseInt(br.readLine());
            arr[n-1] = 1;
        }

        String temp = "";
        String min, max;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 1){
                temp += i+1+",";
            }
        }

        String[] strArr = temp.split(",");

        if(Integer.parseInt(strArr[0])>Integer.parseInt(strArr[0])){
            max = strArr[0];
            min = strArr[1];
        }else{
            max = strArr[1];
            min = strArr[0];
        }

        System.out.println(min);
        System.out.println(max);

    }
}
