package 문자열;
import java.io.*;
public class boj_10809 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        // 배열 생성후 -1로 초기화
        int[] arr = new int['z'-'a' + 1];

        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'a';
            if(arr[index] != -1) continue;
            arr[index] = i;
        }

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);

    }
}
