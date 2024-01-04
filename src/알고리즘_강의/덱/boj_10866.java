package 알고리즘_강의.덱;
import java.io.*;
import java.util.*;

public class boj_10866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        String input;
        int value;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            input = st.nextToken();

            switch (input){
                case "push_front" :
                    value = Integer.parseInt(st.nextToken());
                    deque.offerFirst(value);
                    break;
                case "push_back" :
                    value = Integer.parseInt(st.nextToken());
                    deque.offerLast(value);
                    break;
                case "pop_front" :
                    value = (deque.isEmpty())? -1 : deque.pollFirst();
                    sb.append(value).append("\n");
                    break;
                case "pop_back" :
                    value = (deque.isEmpty())? -1 : deque.pollLast();
                    sb.append(value).append("\n");
                    break;
                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    value = (deque.isEmpty())? 1 : 0;
                    sb.append(value).append("\n");
                    break;
                case "front" :
                    value = (deque.isEmpty())? -1 : deque.peekFirst();
                    sb.append(value).append("\n");
                    break;
                case "back" :
                    value = (deque.isEmpty())? -1 : deque.peekLast();
                    sb.append(value).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
