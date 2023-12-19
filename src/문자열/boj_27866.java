package 문자열;

import java.io.*;
public class boj_27866 {
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int index = Integer.parseInt(br.readLine());

        System.out.println(s.charAt(index-1));
    }
}
