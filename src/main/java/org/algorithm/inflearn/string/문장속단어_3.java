package org.algorithm.inflearn.string;
import java.io.*;
public class 문장속단어_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
        br.close();

    }

    public static String solution(String str) {
        int maxLength = 0;
        String result = "";

//        for(String str2: str.split(" ")){
//            if(str2.length() > maxLength) {
//                maxLength = str2.length();
//                result = str2;
//            }
//        }
        int pos = 0;
        while((pos = str.indexOf(" ")) != -1) {
            String temp = str.substring(0, pos);
            if(temp.length() > maxLength){
                maxLength = temp.length();
                result = temp;
            }

            str = str.substring(++pos);
        }
        if(str.length() > maxLength) result = str;
        return result;
    }
}
