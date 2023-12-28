package 이차원배열;
import java.io.*;
import java.util.*;
public class boj_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = 0;
        String place="0 0";

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 9; j++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp >= max){
                    max = temp;
                    place = (i+1)+" "+(j+1);
                }
            }
        }

        System.out.println(max);
        System.out.println(place);
    }
}
