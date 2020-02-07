package com.itacademy.day4.warmup2;

import java.util.Scanner;

public class ExceptionApp {
    Scanner scan = new Scanner(System.in);

    try {
        stringToBigDecimal(amount);
    } catch (NumberFormatException e) {
        System.out.println("Whoops: amount was not a num");
    } catch (Exception e) {
        System.out.println("Smth bad happened");
    } finally {
        System.out.println("execution is complete");
    }
        scan.close();
}
