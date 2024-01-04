package 알고리즘_강의.스택;
import java.io.*;
import java.util.*;

public class boj_9012 {
    private static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // testCase
        int n = Integer.parseInt(br.readLine());

        // test
        String temp;
        for(int i = 0; i < n; i++){
            temp = br.readLine();
            stack.clear();
            boolean flag = true;

            for(Character ch : temp.toCharArray()){
                if(ch == '(' || ch == '['){
                    stack.push(ch);
                } else if(ch == ']') {
                    if(stack.isEmpty() || stack.peek() != '['){
                        sb.append("NO").append("\n");
                        flag = false;
                        break;
                    }else {
                        stack.pop();
                    }
                } else {
                    if(stack.isEmpty() || stack.peek() != '('){
                        sb.append("NO").append("\n");
                        flag = false;
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }

            if(flag){
                if(stack.isEmpty()){
                    sb.append("YES").append("\n");
                }else {
                    sb.append("NO").append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
