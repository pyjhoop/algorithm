package org.algorithm.programers.level1;

import java.math.BigInteger;
import java.util.*;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {

        String[] strings = {"sun","bed","car"};
        int n = 1;
        HashMap<String, List<String>> map = new HashMap<>();


        // map 세팅
        for(int i = 'a'; i <= 'z'; i++) {
            map.put(String.valueOf((char)i), new ArrayList<>());
        }

        // map 세팅
        for(String str: strings) {
            String key = String.valueOf(str.charAt(n));
            map.get(key).add(str);
        }

        // map 정렬
        for(List<String> list: map.values()) {
            list.sort(Comparator.reverseOrder());
        }

        // maptoList
        List<String> answer = new ArrayList<>();
        for(int i = 'a'; i <= 'z'; i++) {
            answer.addAll(map.get(String.valueOf((char)i)));
        }

        for(String set: map.keySet()) {

        }


        String[] arr = answer.toArray(new String[0]);

    }
}
