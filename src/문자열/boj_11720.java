package 문자열;
import java.io.*;
public class boj_11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String[] arr = s.split("");

        int sum = 0;

        for(String str : arr){
            sum += Integer.parseInt(str);
        }

        System.out.println(sum);
    }
}
