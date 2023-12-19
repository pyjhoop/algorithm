package 배열;
import java.io.*;
import java.util.*;

public class boj_10807 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int loop = Integer.parseInt(br.readLine());
        int total = 0;

        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        for(int i = 0; i < loop; i++){
            if(v == Integer.parseInt(st.nextToken())){
                total++;
            }
        }

        System.out.println(total);
    }
}
