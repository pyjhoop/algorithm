package 배열;
import java.io.*;
import java.util.*;
public class boj_1546 {
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        // 성적 입력 받기
        st = new StringTokenizer(br.readLine());

        // 배열에 성적 입력하기
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최대값 구하기
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }

        // 최대값에 따른 성적 변경하면서 총점 구하기
        double total = 0;
        for(int i = 0; i < arr.length; i++){
            total += ((arr[i]+0.0)/max * 100);
        }

        System.out.println(total / arr.length);
    }
}
