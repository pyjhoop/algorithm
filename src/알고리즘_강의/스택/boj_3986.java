package 알고리즘_강의.스택;
import java.io.*;
import java.util.*;

public class boj_3986 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // AABB ABAB x  ABBA
        // 두개씩 짝을 짓는데 만약에 사이에 다른 값이 홀수개가 들어온다면 실패
        // ABBBA 실패 ABBABB 성공
        //쌍을 짓는다는 스택을 생각하면 됨
        Stack<String> stack = new Stack<>();

        //testCase
        int n = Integer.parseInt(br.readLine());

        //저장 배열
        String[] arr;
        int resultCount = 0;

        for(int i = 0; i < n; i++){
            arr = br.readLine().split("");
            stack.clear();
            stack.push(arr[0]);

            for(int j = 1; j < arr.length; j++){
                if(stack.isEmpty()){
                    stack.push(arr[j]);
                }else if(arr[j].equals(stack.peek())){
                    stack.pop();
                } else {
                    stack.push(arr[j]);
                }
            }

            if(stack.isEmpty()){
                resultCount++;
            }

        }

        System.out.println(resultCount);
    }
}
