package org.algorithm.programers.level1;

import java.util.HashMap;
import java.util.Map;

public class 추억_점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] answer = new int[photo.length];
        // 시간복잡도를 줄이기 위해 map 생성
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            String[] arr = photo[i];
            int total = 0;
            for(String str: arr){
               total += map.get(str);
            }
            answer[i] = total;
        }
    }
}
