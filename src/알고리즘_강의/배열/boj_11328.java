package 알고리즘_강의.배열;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11328 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        char[] arr1;
        char[] arr2;

        for(int i = 0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());

            arr1 = st.nextToken().toCharArray();
            arr2 = st.nextToken().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String result1 = new String(arr1);
            String result2 = new String(arr2);

            if(result1.equals(result2)){
                sb.append("Possible").append("\n");
            }else {
                sb.append("Impossible").append("\n");
            }
        }

        System.out.println(sb);
    }
}
