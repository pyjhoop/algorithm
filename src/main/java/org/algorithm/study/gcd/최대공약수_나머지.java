package org.algorithm.study.gcd;

public class 최대공약수_나머지 {
    public static void main(String[] args) {

        int result = gcd(2,100);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        while(a != 0 && b != 0) {
            if(a > b) {
                a %= b;
            }else {
                b %= a;
            }
        }

        return a + b;
    }
}
