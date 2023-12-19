package 배열;
import java.util.*;
import java.io.*;
public class boj_2562 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int maxNum = 0;
        int max = 0;
        String temp;


        while((temp = br.readLine()) != null){
            index++;

            if(Integer.parseInt(temp) > max){
                max = Integer.parseInt(temp);
                maxNum = index;
            }

        }

        System.out.println(max);
        System.out.println(maxNum);
    }
}
