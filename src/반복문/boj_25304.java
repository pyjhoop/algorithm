package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_25304 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int total = Integer.parseInt(br.readLine());
        int loop = Integer.parseInt(br.readLine());
        int a, b;
        int sum = 0;

        for(int i = 0; i < loop; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum += a*b;
        }

        if(total == sum){
            bw.write("Yes");
        }else {
            bw.write("No");
        }
        br.close();
        bw.close();

    }
}
