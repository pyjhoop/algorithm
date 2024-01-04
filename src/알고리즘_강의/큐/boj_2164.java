package 알고리즘_강의.큐;
import java.io.*;
import java.util.*;
public class boj_2164 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            queue.offer(i+1);
        }

        while(queue.size() != 1){
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
        br.close();
    }
}
