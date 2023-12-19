package 문자열;
import java.io.*;
import java.util.*;
public class boj_2675 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 테스트 케이스
        int t = Integer.parseInt(br.readLine());

        // 케이스별로 값 입력 받기
        int n;
        String str;
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            str = st.nextToken();

            String[] arr = str.split("");
            for(int j = 0; j < arr.length; j++){
                for(int k = 0; k < n; k++){
                    sb.append(arr[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
