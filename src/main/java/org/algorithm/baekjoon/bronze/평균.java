package org.algorithm.baekjoon.bronze;

import java.io.*;
import java.util.Arrays;

public class 평균 {

    /** 수도 코드
     *  정수 N에 입력받을 성적의 개수를 입력받는다.
     *  N개의 성적을 입력 받고 String[] arr에 split(" ");으로 초기화한다.
     *  Arrays.sort()로 정렬한 뒤 최대값 max에 arr[N-1]을 해준다.
     *  실수 sum을 0.0으로 초기화한다.
     *  for(N개 만큼 반복)
     *  {
     *      sum += Double.parseDouble(arr[i]/max*100);
     *  }
     *  System.out.println(sum/N);
     *
     * **/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Arrays.sort(arr);
        double max = Double.parseDouble(arr[N-1]);

        double sum = 0.0;

        for(int i =0; i < N; i++) {
            sum += Double.parseDouble(arr[i])/max*100;
        }

        System.out.println(sum/N);

    }
}
