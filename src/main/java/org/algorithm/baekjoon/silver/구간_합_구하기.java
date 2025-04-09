package org.algorithm.baekjoon.silver;

import java.io.*;
import java.util.*;
public class 구간_합_구하기 {
    public static void main(String[] args) throws IOException {

        /**
         * i 번째부터 j번째 수까지의 합 -> 부분합 -> 부부합 배열을 구하면 빠르게 구할수 있다.
         * 
         * N, M은 10^5승 M은 무조건 실행되야하기에 logN 또는 O(1)이 사용되야한다. 
         * 합 배열을 만들면 조회는 O(1)이기에 합배열 생성 해서 활용해보자
         *
         * 수도코드
         * 정수타입 N, M을 입력받는다.
         * N개의 숫를 입력받아서 정수타입 배열인 arr에 저장한다.
         * Sum 배열을 만들어서 합 배열을 만든다.
         * 구간합 수식인 S(j) - S(i-1)을 통해 i ~ j 사이의 합을 구한다.
         * 구한 값을 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] S = new int[N+1];
        for(int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(S[b] - S[a-1]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
