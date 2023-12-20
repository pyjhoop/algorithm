package 심화1;
import java.io.*;
public class boj_10988 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);

        if(str.equals(sb.reverse().toString())){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
