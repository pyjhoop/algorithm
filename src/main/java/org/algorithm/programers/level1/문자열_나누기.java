package org.algorithm.programers.level1;

public class 문자열_나누기 {
    public static void main(String[] args) {
        String s = "aaabbaccccabba";

        int answer = 0;
        String[] arr = s.split("");
        String initX = "";
        int x = 0;
        int y = 0;

        for(int i = 0; i < arr.length; i++) {
            if(x == 0){
                initX = arr[i];
                x++;
                continue;
            }

            if(!arr[i].equals(initX)){
                y++;
                if(x == y) {
                    answer++;
                    initX = "";
                    x = 0;
                    y = 0;
                }
            }
        }

        if(x > 0 || y > 0) answer++;

        System.out.println(answer);
    }
}
