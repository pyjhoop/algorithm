package 알고리즘_강의.스택;
import java.io.*;
import java.util.*;
public class boj_1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int inputSize = Integer.parseInt(br.readLine());

        // 1~n까지 push 또는 pop 해서 값이 나오냐?
        int start = 0;

        for(int i = 0; i < inputSize; i++){

            int value = Integer.parseInt(br.readLine());

            if(value > start){
                for(int j = start +1; j <= value; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }

                start = value;
            } else if(stack.peek() != value){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");


        }
        System.out.println(sb);

    }
}
