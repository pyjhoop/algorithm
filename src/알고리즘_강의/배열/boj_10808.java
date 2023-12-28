package 알고리즘_강의.배열;
import java.io.*;


public class boj_10808 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int['z' - 'a' + 1];

        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - 'a';
            arr[index] += 1;
        }

        for(int i: arr){
            System.out.print(i+" ");
        }

    }
}
