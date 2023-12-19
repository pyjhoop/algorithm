package 문자열;
import java.io.*;
public class boj_5622 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count = 0;

        String[] arr = str.split("");
        for(int i = 0; i < arr.length; i++){
            count += solution(arr[i]);
        }

        System.out.println(count);


    }

    public static int solution(String s){
        switch (s){
            case "A":
            case "B":
            case "C": return 3;
            case "D":
            case "E":
            case "F": return 4;
            case "G":
            case "H":
            case "I": return 5;
            case "J":
            case "K":
            case "L": return 6;
            case "M":
            case "N":
            case "O": return 7;
            case "P":
            case "Q":
            case "R":
            case "S": return 8;
            case "T":
            case "U":
            case "V": return 9;
            case "W":
            case "X":
            case "Y":
            case "Z": return 10;
            default: return 0;

        }
    }
}
