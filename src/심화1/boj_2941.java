package 심화1;
import java.io.*;
public class boj_2941 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 크로아티아 알파벳 배열
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 값 입력
        String input = br.readLine();

        //
        int count = 0;

        // 배열을 돌면서 특정 값이 있으면 replace해주기
        for(String s : arr){
            if(input.contains(s)){
                int before = input.replaceAll(" ","").length();
                input = input.replaceAll(s," ");
                int after = input.replaceAll(" ","").length();

//                System.out.println("input : "+input);
//                System.out.println("before : "+before);
//                System.out.println("after : "+after);
//
//                System.out.println(input.replaceAll(" ",""));
//                System.out.println((before-after)/s.length());

                count += (before-after)/s.length();
            }

        }

        System.out.println(count + input.replaceAll(" ","").length());


    }
}
