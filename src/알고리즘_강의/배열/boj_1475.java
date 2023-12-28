package 알고리즘_강의.배열;
import java.io.*;

public class boj_1475 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int[] arr = new int[10];

        for(char ch : n.toCharArray()){
            arr[ch - '0']++;
        }
        int min = (int) Math.ceil((arr[6] + arr[9])/2.0);
        int result = min;

        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
            if(i == 6 || i == 9){
                continue;
            }
            if(arr[i] > min) {
                result = arr[i];
                min = arr[i];
            }

        }

        System.out.println(result);
        br.close();


    }
}
