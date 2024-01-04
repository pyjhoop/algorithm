package 알고리즘_강의.연결리스트;
import java.io.*;
import java.util.Stack;

public class boj_5397 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            stack1.clear();
            stack2.clear();

            char[] arr = br.readLine().toCharArray();

            for(char c: arr){

                if(c == '>'){
                    if(!stack2.isEmpty()){
                        stack1.add(stack2.pop());
                    }
                } else if (c == '<') {
                    if(!stack1.isEmpty()){
                        stack2.add(stack1.pop());
                    }
                } else if (c == '-') {
                    if(!stack1.isEmpty()){
                        stack1.pop();
                    }
                } else {
                    stack1.add(c);
                }
            }
            while(!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }

            while(!stack2.isEmpty()){
                sb.append(stack2.pop());
            }
            sb.append("\n");
        }



        System.out.println(sb);


    }
}
