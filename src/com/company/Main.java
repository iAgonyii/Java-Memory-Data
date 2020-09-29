package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // outOfMemory();
        // stackOverflow();
        opdracht1C_2();
    }

    static void outOfMemory() {
        long[] l = new long[Integer.MAX_VALUE];
    }

    static void stackOverflow() {
        stackOverflow();
    }

    static void opdracht1C_1() {
        // Eerst deel je 1 door 42 en daarna vermenigvuldig je 42 met de uitkomst waardoor je weer terug komt op 1 of 1.0
        // Bij deze methode komt geen afrondingsfout voor en daarom komt er true uit.
        // Daarom geeft dit true.

        int i = 42;
        float f = 1.0f / i;
        System.out.println((i*f==1.0f));
    }

    static void opdracht1C_2() {
        // Het gaat hier om een afrondingsfout. Omdat floats minder accuraat zijn dan doubles, gebeurd er hier iets met de decimalen van de float waardoor
        // verkeerd wordt afgerond. Daarom geeft deze false terug. Bij de methode hierboven, die true teruggeeft, komt geen afrondingsfout voor.

        int i = 41;
        float f = 1.0f / i;
        System.out.println((i*f==1.0f));
    }
}

