package 알고리즘_강의.배열;
import java.io.*;
public class boj_1919 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        // 배열 만든뒤 배열의 최소값 만큼 개수를 차감해야해.
        char[] arr1 = new char['z' - 'a' + 1];
        char[] arr2 = new char['z' - 'a' + 1];

        for(char ch : str1.toCharArray()){
            arr1[ch -'a']++;
        }
        for(char ch : str2.toCharArray()){
            arr2[ch -'a']++;
        }
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                count += Math.abs(arr1[i]- arr2[i]);
            }
        }

        System.out.println(count);
        br.close();


    }
}
