package 심화1;
import java.io.*;
public class boj_1157 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        // A ~ Z 까지 개수를 넣을 배열 생성
        int[] arr = new int['Z' - 'A' + 1];

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'A';
            arr[index] = arr[index] + 1;
        }

        // 가장 많은 알파벳 숫자 및 해당 알파벳
        int max = 0;
        String alp = "";
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
                alp = (char)(i+'A') + "";
            }
        }

        // 가장 큰 수가 여러개 있는지 찾기
        int count = 0;
        for(int i : arr){
            if(max == i) count++;
        }

        if(count > 1){
            System.out.println("?");
        }else{
            System.out.println(alp);
        }


    }
}
