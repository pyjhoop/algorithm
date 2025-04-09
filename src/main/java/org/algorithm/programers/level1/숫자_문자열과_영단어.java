package org.algorithm.programers.level1;

import java.util.HashMap;
import java.util.List;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "2three45sixseven";
        int answer = 0;
        HashMap<String, String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");

        String result = s;

        for(String str: map.keySet()){
            result = result.replaceAll(str, map.get(str));
        }
        System.out.println( Integer.parseInt(result));
    }
}
