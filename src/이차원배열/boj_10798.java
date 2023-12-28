package 이차원배열;
import java.io.*;
public class boj_10798 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
        String[][] arr = new String[15][5];
        String[] sArr;
        int length = 0;

        for(int i = 0; i < 5; i++){
            input = br.readLine();

            sArr = input.split("");

            for(int j = 0; j < sArr.length; j++){
                arr[i][j] = sArr[j];
            }

        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < 5; j++){
                sb.append(arr[j][i]);
            }
        }

        System.out.println(sb);
    }
}
