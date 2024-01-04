package 알고리즘_강의.스택;
import java.io.*;
import java.util.*;

public class boj_10773 {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int temp;
        for(int i = 0; i < testCase; i++){
            temp = Integer.parseInt(br.readLine());
            addStack(temp);
        }

        int result = sum();

        System.out.println(result);


    }

    public static void addStack(int temp){
        if(temp != 0){
            stack.add(temp);
        } else {
            stack.pop();
        }
    }

    public static int sum(){
        int sum = 0;

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        return sum;
    }
}
