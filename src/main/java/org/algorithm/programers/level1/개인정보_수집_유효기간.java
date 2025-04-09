package org.algorithm.programers.level1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보_수집_유효기간 {
    public static void main(String[] args) {

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        LocalDate todays = LocalDate.parse(today.replaceAll("\\.", "-"));

        Map<String, String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(String term: terms) {
            String[] arr = term.split(" ");
            map.put(arr[0], arr[1]);
        }



        for(int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            String date = arr[0];
            String term = arr[1];

            LocalDate privacyDate = LocalDate.parse(date.replaceAll("\\.", "-"));
            String month = map.get(term);
            LocalDate expireDate = privacyDate.plusMonths(Integer.parseInt(month)).minusDays(1);
            if(expireDate.isBefore(todays)){
                list.add(i+1);
            }

        }

        list.stream().sorted().toArray();


    }
}
