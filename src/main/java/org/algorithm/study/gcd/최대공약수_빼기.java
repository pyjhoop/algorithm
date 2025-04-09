package org.algorithm.study.gcd;

public class 최대공약수_빼기 {
    public static void main(String[] args) {

        int result = gcd(3,4324);
        System.out.println(result);

    }

    public static int gcd(int a, int b) {
        // 두 값
        while(a != 0 && b != 0) {
            if(a > b) {
                a -= b;
            }else{
                b -= a;
            }
        }

        return a + b;
    }
}
