package 알고리즘_강의.배열;
import java.io.*;
// 숫자의 개수
public class boj_2577 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        br.close();

        String total = String.valueOf(a * b * c);

        int[] arr = new int[10];

        for(int i = 0; i < total.length(); i++){
            int index = total.charAt(i) - '0';
            arr[index] += 1;
        }

        for(int i: arr){
            System.out.println(i);
        }
    }
}
