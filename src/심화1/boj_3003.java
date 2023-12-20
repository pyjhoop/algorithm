package 심화1;
import java.io.*;
public class boj_3003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = {1,1,2,2,2,8};

        String str = br.readLine();
        String[] sArr = str.split(" ");

        for(int i = 0; i < sArr.length; i++){
            arr[i] -= Integer.parseInt(sArr[i]);
        }

        for(int a : arr){
            sb.append(a).append(" ");
        }

        System.out.println(sb);
    }
}
