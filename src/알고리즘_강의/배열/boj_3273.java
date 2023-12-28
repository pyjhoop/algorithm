package 알고리즘_강의.배열;
import java.io.*;
import java.util.*;

public class boj_3273 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());

        // 배열 초기화
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int startIndex = 0;
        int endIndex = n-1;
        int count = 0;
        while(startIndex != endIndex){
            int sum = arr[startIndex] + arr[endIndex];

            if(sum > x){
                endIndex--;
            }else if(sum < x){
                startIndex++;
            }else if(sum == x){
                count++;
                startIndex++;
            }
        }

        System.out.println(count);


    }
}
