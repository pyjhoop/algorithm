package org.algorithm.programers.level1;

import java.util.HashMap;
import java.util.Map;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        String s = "banana";
        int[] arr = new int[s.length()];
        Map<String, Integer> map = new HashMap<>(){
            {
                for(int i = 'a'; i<= 'z'; i++) {
                    put(String.valueOf((char)i), -1);
                }
            }
        };

        String[] stringArr = s.split("");

        for(int i = 0; i < stringArr.length; i++){
            if(map.get(stringArr[i]) == -1){
                map.put(stringArr[i], i);
                arr[i] = -1;
            }else {
                arr[i] = i - map.get(stringArr[i]);
                map.put(stringArr[i], i);
            }
        }

        System.out.println(stringArr);


    }
}
