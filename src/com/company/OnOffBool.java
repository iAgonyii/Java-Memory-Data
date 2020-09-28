package com.company;

public class OnOffBool {
    public static void main(String[] args) {
        opdrachtCode();
        variant1();
        variant2();
    }

    static void opdrachtCode() {
        boolean bit = false;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);
            if (bit) {
                bit = false;
            } else {
                bit = true;
            }
        }
    }

    static void variant1() {
        boolean bit = false;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            bit = (bit == false ? true : false);
        }
    }

    static void variant2() {
        boolean bit = false;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            bit = !bit;
        }
    }
}
