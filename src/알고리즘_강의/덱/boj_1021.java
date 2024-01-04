package 알고리즘_강의.덱;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class boj_1021 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());

        // n, m 초기화
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 2, 3번횟수 count 선언
        int count = 0;

        //deque 1~n 까지 데이터 삽입
        for(int i =1; i <= n; i++){
            deque.offerLast(i);
        }

        // 위치 입력 받고
        // m만큼 일단 반복
        st = new StringTokenizer(br.readLine());
        int temp;
        int index;
        int size;
        for(int i = 0; i < m; i++){

            // 1 2 3 4 5중 4를 찾아라 하면 오른쪽으로 2번 이동이 왼쪽으로 3번 이동보다 최소값이야
            // 이걸 결정하는 건 size와 index size / index >=2 면 왼쪽으로 이동 반대면 오른쪽으로 이동
            // 왼쪽은 0 부터 <=index까지 반복해서 이동 후 count
            // 오른쪽은 size - index 만큼 오른쪽 이동 후 count

            index = 0;
            size = deque.size();
            temp = Integer.parseInt(st.nextToken());

            // temp의 index 찾기
            for(int j : deque){
                if(j == temp) break;
                index++;
            }

            // 3가지의 조건
            if (index ==0) {
                deque.pollFirst();
            } else if ((size / index) >= 2) {
                for(int k = 0; k < index; k++){
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
                deque.pollFirst();
            } else {
                for(int k = 0; k < (size - index); k++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
                deque.pollFirst();
            }

        }

        System.out.println(count);


    }
}
