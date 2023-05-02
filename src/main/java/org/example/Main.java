package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 3)); // 2+3
        System.out.println(intsCalc.sub(22, 10)); // 22-10
        System.out.println(intsCalc.mult(6, 7)); // 6*7
        System.out.println(intsCalc.div(5, 5)); // 5/5
        System.out.println(intsCalc.pow(2, 8)); // 2^8
    }
}