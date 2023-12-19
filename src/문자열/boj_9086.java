package 문자열;
import java.io.*;

public class boj_9086 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        String s;

        for(int i = 0; i < t; i++){
            s = br.readLine();
            sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
        }

        System.out.println(sb);
    }
}
