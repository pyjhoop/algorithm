package org.algorithm.programers.level1;

import java.util.*;
public class 신고_결과_받기 {
    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] answer = new int[id_list.length];
        Map<String, Integer> idMap = new HashMap<>();
        Map<String, Set<String>> reportMap = new HashMap<>();

        // idMap 세팅
        for(int i = 0; i < id_list.length; i++){
            idMap.put(id_list[i], i);
        }

        //reportMap 세팅
        for(int i = 0; i < report.length; i++) {
            String[] arr = report[i].split(" ");
            String reporter = arr[0];
            String receiver = arr[1];
            if(reportMap.get(receiver) == null){
                Set<String> list = new HashSet<>();
                list.add(reporter);
                reportMap.put(receiver, list);
            }else {
                Set<String> list = reportMap.get(receiver);
                list.add(reporter);
                reportMap.put(receiver, list);
            }
        }

        // reportMap 반복문 돌면서 List 사이즈가 k 이상이면 reporter index++;
        for(String reporter: reportMap.keySet()){
            Set<String> set = reportMap.get(reporter);
            if(set.size() >= k){
                for(String s: set){
                    Integer index = idMap.get(s);
                    answer[index]++;
                }
            }
        }

        System.out.println(answer);
    }
}
