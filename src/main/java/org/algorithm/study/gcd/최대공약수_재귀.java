package org.algorithm.study.gcd;

public class 최대공약수_재귀 {
    public static void main(String[] args) {

        int result = gcd(2,100);
        System.out.println(result);

    }

    public static int gcd(int a, int b) {
        if(a != 0 && b != 0){
            if(a > b) {
                return gcd(a%b, b);
            }else {
                return gcd(a, b%a);
            }
        }
        return a+ b;

    }
}
