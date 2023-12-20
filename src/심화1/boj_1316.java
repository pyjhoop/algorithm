package 심화1;
import java.io.*;

public class boj_1316 {
    public static void main(String[] args) throws IOException {
        //동일한 단어가 1개 이상 존재하면 이전 값과 비교해서 이전값이랑 다르면 아님
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String str;
        int[] sArr;
        int count = 0;

        for(int i = 0; i < t; i++){
            str = br.readLine();
            sArr = new int['z' - 'a' + 1];
            for(int j = 0; j < str.length(); j++)
            {
                int index = str.charAt(j) - 'a';

                if(sArr[index] == 0){
                    sArr[index] = 1;
                }else {
                    if(str.charAt(j) != str.charAt(j-1)){
                        break;
                    }
                }

                if(j == str.length()-1){
                    count++;
                }
            }

        }

        System.out.println(count);
    }
}
