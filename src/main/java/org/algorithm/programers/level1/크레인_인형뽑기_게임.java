package org.algorithm.programers.level1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class 크레인_인형뽑기_게임 {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        int[][] arr = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};

        int[] moves = {1,5,3,5,1,2,1,4};

        int answer = 0;

        for(int i = 0; i < moves.length; i++) {
            int pickIndex = moves[i]-1;
            int temp = 0;

            for(int j = 0; j < arr.length; j++) {
                if(arr[j][pickIndex] != 0) {
                    temp = arr[j][pickIndex];
                    arr[j][pickIndex] = 0;
                    break;
                }
            }

            if(temp != 0 && stack.isEmpty()){
                stack.addLast(temp);
            }else if(temp != 0){
                int last = stack.peekLast();
                if(temp == last) {
                    answer += 2;
                    stack.pollLast();
                }else{
                    stack.addLast(temp);
                }
            }

        }

        System.out.println(answer);


    }
}
