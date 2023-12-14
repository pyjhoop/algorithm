package 조건문;

import java.io.*;
import java.util.*;
public class boj_2884 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m >= 45)
        {
            System.out.printf("%d %d\n",h,(m-45));
        }else
        {
            if(h ==0){
                System.out.printf("%d %d\n",23,(60-(45-m)));
            }else{
                System.out.printf("%d %d",(h-1),(60-(45-m)));
            }
        }

    }
}
