package 알고리즘_강의.스택;
import java.io.*;
import java.util.*;

public class boj_4949 {
    public static Stack<String> stack = new Stack<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();

            if(str.equals(".")){
                break;
            }

            String result = solution(str);
            sb.append(result).append("\n");

        }
        System.out.println(sb);


    }

    private static String solution(String str){
        String[] arr = str.split("");
        String temp;
        stack.clear();
        for(String s: arr){
            if(s.equals("(")  || s.equals("[")){
                stack.push(s);
            }else if(s.equals("]")) {
                if(stack.isEmpty() || !stack.peek().equals("[")){
                    return "no";
                }else {
                    stack.pop();
                }
            }else if(s.equals(")")){
                if(stack.isEmpty() || !stack.peek().equals("(")){
                    return "no";
                }else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return "yes";
        }else {
            return "no";
        }

    }
}
