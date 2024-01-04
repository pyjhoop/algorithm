package 알고리즘_강의.연결리스트;
import java.io.*;
import java.util.Stack;

public class boj_1406 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        String input = br.readLine();

        for(Character s: input.toCharArray()){
            stack1.add(s);
        }


        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String temp = br.readLine();


            if(temp.contains("P")){
                char[] arr = temp.replace("P ","").toCharArray();

                stack1.add(arr[0]);

            }else if(temp.equals("L")){

                if(!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }

            }else if(temp.equals("D")){

                if(!stack2.isEmpty()){
                    stack1.add(stack2.pop());
                }

            }else{

                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }

        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }


        while(!stack2.isEmpty()){
            sb.append(stack2.pop());
        }
        System.out.println(sb);

    }
}
