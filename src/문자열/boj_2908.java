package 문자열;
import java.io.*;
import java.util.*;
public class boj_2908 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb1 = new StringBuilder(st.nextToken());
        StringBuilder sb2 = new StringBuilder(st.nextToken());

        int a = Integer.parseInt(sb1.reverse().toString());
        int b = Integer.parseInt(sb2.reverse().toString());

        if(a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }


    }
}
