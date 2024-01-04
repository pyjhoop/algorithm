package 알고리즘_강의.스택;
import java.io.*;
import java.util.*;

public class boj_2493 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<int[]> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){

            int building = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()){
                int temp = stack.peek()[1];

                if(temp > building){
                    sb.append((stack.peek()[0]+1)+" ");
                    stack.push(new int[]{i, building});
                    break;
                }else if (building > temp){
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                sb.append("0 ");
                stack.push(new int[]{i, building});
                continue;
            }

        }

        System.out.println(sb);

    }

}
