package 알고리즘_강의.연결리스트;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1158 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> queue1 = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++){
            queue1.add(i);
        }
        sb.append("<");

        while(queue1.size() != 1){
            for(int i = 0; i < k-1; i++){
                queue1.add(queue1.poll());
            }

            sb.append(queue1.poll()+", ");
        }

        sb.append(queue1.poll()+">");

        System.out.println(sb);

    }
}
