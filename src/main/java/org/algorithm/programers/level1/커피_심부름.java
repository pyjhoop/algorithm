package org.algorithm.programers.level1;

public class 커피_심부름 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        int price = 0;
        for(String str: order){
            price += str.contains("cagelatte") ?  4500 :  5000;
        }

        System.out.println(price);

    }
}
