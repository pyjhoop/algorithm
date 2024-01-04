package 알고리즘_강의.큐;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class boj_10845 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        //입력 횟수
        int n = Integer.parseInt(br.readLine());

        String input;
        int temp;
        // 반복문을 통한 입력
        for(int i = 0; i < n; i++){
            input = br.readLine();

            switch (input) {
                case "pop":
                    temp = (queue.isEmpty())? -1: queue.poll();
                    sb.append(temp).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    temp = (queue.isEmpty())? 1 : 0;
                    sb.append(temp).append("\n");
                    break;
                case "front":
                    temp = (queue.isEmpty())? -1 : queue.peek();
                    sb.append(temp).append("\n");
                    break;
                case "back":
                    temp = (queue.isEmpty())? -1 : ((LinkedList<Integer>)queue).peekLast();
                    sb.append(temp).append("\n");
                    break;
                default:
                    input = input.replace("push ","");
                    queue.offer(Integer.parseInt(input));
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }
}
