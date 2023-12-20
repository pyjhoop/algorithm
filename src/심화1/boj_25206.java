package 심화1;
import java.io.*;
import java.util.StringTokenizer;

public class boj_25206 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String grade;
        double sum = 0.0;
        double aGrade = 0.0;
        int totalCount = 0;
        double totalGrade = 0.0;

        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            aGrade = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            if(grade.equals("P")){
                continue;
            }else{
                sum += aGrade*getGrade(grade);
                totalCount++;
                totalGrade += aGrade;
            }
        }
        System.out.println(sum / totalGrade);
    }

    public static double getGrade(String s){
        switch (s){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0.0;
        }
    }
}
