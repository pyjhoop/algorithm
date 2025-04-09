package org.algorithm.baekjoon.silver;
import java.io.*;
import java.util.*;

public class 균형잡힌_세상 {
    static Deque<Character> stack = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();

        while(true){
            String str = br.readLine();
            if(str.equals(".")) break;

            if(checkMatch(str)){
                sb.append("yes\n");
            }else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);
        br.close();
    }

    // 배열 사용할때 크기랑 시간은 어떻게 나오는지도 체크해보자
    private static boolean checkMatch(String str) {
        stack.clear();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '['){
                stack.addLast(c);
            }else if(c == ')'){
                if (stack.isEmpty() || stack.peekLast() != '(') {
                    return false;
                }
                stack.pollLast();
            }else if(c == ']'){
                if (stack.isEmpty() || stack.peekLast() != '[') {
                    return false;
                }
                stack.pollLast();
            }
        }
        return stack.isEmpty();
    }
}
