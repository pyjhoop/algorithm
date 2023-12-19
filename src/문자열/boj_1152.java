package 문자열;
import java.io.*;
public class boj_1152 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();
        String[] arr = str.split(" ");
        if(str.equals("")){
            System.out.println(0);
        }else{

            System.out.println(arr.length);
        }
    }
}
