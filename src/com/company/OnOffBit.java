package com.company;

public class OnOffBit {
    public static void main(String[] args) {
        opdrachtCode();
        variant1();
        variant2();
    }

    static void opdrachtCode() {
        byte bit = 0;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            if (bit == 0) {
                bit = 1;
            } else {
                bit = 0;
            }
        }
    }

    static void variant1() {
        byte bit = 0;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            bit = (byte) (1 - bit);
        }
    }

    static void variant2() {
        byte bit = 0;
        for (int i = 0; i < 20; i += 2) {
            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            bit = (byte)(bit == 0 ? 1 : 0);
        }
    }
}

