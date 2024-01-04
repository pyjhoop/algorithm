package 알고리즘_강의.스택;
import java.util.*;
import java.io.*;

public class boj_10828 {

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    static int temp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            String str = br.readLine();
            solution(str);
        }

        System.out.println(sb);


    }

    public static void solution(String str){
        switch (str){
            case "pop":
                temp = (stack.isEmpty())? -1 : stack.pop();
                addInteger(temp);
                break;
            case "size":
                temp = stack.size();
                addInteger(temp);
                break;
            case "empty":
                temp = (stack.isEmpty())? 1: 0;
                addInteger(temp);
                break;
            case "top":
                temp = (stack.isEmpty())? -1: stack.peek();
                addInteger(temp);
                break;
            default:
                temp = Integer.parseInt(str.replace("push ",""));
                stack.push(temp);
        }
    }

    public static void addInteger(int temp){
        sb.append(temp).append("\n");
    }
}
