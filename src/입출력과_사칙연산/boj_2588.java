package 입출력과_사칙연산;

import java.io.*;
public class boj_2588 {

    public static void main(String[] arg) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int b1 = b;

        System.out.println(a*(b1%10));
        b1 /= 10;
        System.out.println(a*(b1%10));
        b1/=10;
        System.out.println(a*b1);
        System.out.println(a*b);

    }

}
