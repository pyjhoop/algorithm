package 조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2525 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());

        // m+c > 60 이면 나머지와 몫을 구해서 몫은 h+몫, m = 나머지
        // h+몫이 >23 - 24

        if(m+c < 60)
        {
            System.out.printf("%d %d", h, m+c);
        }else
        {
            int rest = (m+c)%60;
            int head = (m+c)/60;

            m = rest;
            h += head;
            if(h > 23){
                h -= 24;
                System.out.printf("%d %d",h,m);
            }else {
                System.out.printf("%d %d",h,m);
            }
        }

    }
}
