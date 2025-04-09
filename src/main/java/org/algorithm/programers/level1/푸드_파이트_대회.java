package org.algorithm.programers.level1;

public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++){
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String answer = sb.toString() + "0" + sb.reverse().toString();
        System.out.println(answer);


    }
}
