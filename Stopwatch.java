package com.BridgeLabz.com.BridgeLabz;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type ' a ' to Start :");
        long start = System.currentTimeMillis();
        sc.nextLine();
        System.out.print("Type ' b ' to Stop :");
        long stop = System.currentTimeMillis();
        sc.nextLine();
       
        long Elapsedtime = (stop - start) / 1000;
        System.out.print("Elapsed Time was: "+Elapsedtime+" Seconds");
    }
}

