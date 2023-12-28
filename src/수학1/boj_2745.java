package 수학1;
import java.io.*;
import java.util.*;

public class boj_2745 {
    public static void main(String[] arg) throws Exception{
        // 2진이든 모든 진수를 10진수로 변경시키는 방법은 해당 진수의 값은
        // 1001 -> 1*2^3 + 0*2^2 + 0*2^1 + 1*2^0

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        String[] arr = str.split("");
        long temp = 0;
        long total = 0;
        for(int i = 0; i < arr.length; i++){
            if(str.charAt(i) >='A'){
                temp = str.charAt(i) -'A' +10;
            }else{
                temp = str.charAt(i) - '0';
            }

            total += (long) (temp* Math.pow(n, str.length()-1-i));
        }

        System.out.println(total);

    }
}
