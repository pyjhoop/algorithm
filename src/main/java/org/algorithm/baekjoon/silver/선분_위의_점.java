package org.algorithm.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 선분_위의_점 {

    /**수도 코드
     * 점의 위치 가 주어짐.
     * 선분의 시작 점과 끝점이 주어지고
     * 선분위에 점이 몇개씩 있는지 출력하는 문제
     *
     * 1 3 10 20 30
     * 1 10
     * 20 60
     * 3 30
     * 2 15
     * 4 8
     *
     * M번의 반복 안에서 범위 내의 점의 개수를 찾아야함.
     * 1번째 트라이 에서 정렬된 점 배열에서
     * 1 크거나 같은 최소값의 인덱스 구하고
     * 10 보다 작거나 같은 최대값의 인덱스를 구해서
     * rightIndex - leftIndex + 1 하면 점의 개수가 나온다.
     *
     * 정수 N, M에 입력을 받는다.
     * 정수형 배열 arr에 점 N개를 입력받고 오름차순 정렬한다.
     * M번의 반복을 통해 선분의 범위를 입력받는다.
     * 시작점보다 크거나 같은 점의 최소값의 인덱스를 찾는다.
     * 끝점보다 작거나 같은 점의 최대값의 인덱스를 찾는다.
     * 끝점 인덱스 - 시작점 인덱스 + 1 하면 점의 개수가 출력된다.
     *
     * **/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 0;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            left = Integer.parseInt(st.nextToken());
            right = Integer.parseInt(st.nextToken());

            int leftValue = leftBinarySearch(arr, left);
            int rightValue = rightBinarySearch(arr, right);

            sb.append(rightValue - leftValue + 1).append("\n");

        }

        System.out.println(sb);
    }

    public static int leftBinarySearch(int[] arr, int left) {
        int start = 0;
        int end = arr.length - 1;
        int result = arr.length;
        while(start <= end) {
            int mid = (start + end)/ 2;
            if(arr[mid] >= left){
                result = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static int rightBinarySearch(int[] arr, int right) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] <= right) {
                result = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return result;
    }
}
