package 심화1;
import java.io.*;
public class boj_2444 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 2*n -1; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i < n; i++){
            for(int j = n-i; j < n; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
