package com.company;

public class Main {

    public static void main(String[] args) {
        byte myNewByteLiczba = 10;
        short myNewShortLiczba = 23232;
        int myNewIntLiczba = 123233;
        long myNewLongLiczba = 50000L + 10L * (myNewByteLiczba + myNewShortLiczba + myNewIntLiczba);
        System.out.println(myNewLongLiczba);

    }
}
