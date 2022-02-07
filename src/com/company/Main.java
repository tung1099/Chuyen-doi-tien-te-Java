package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD:");
        usd = scanner.nextDouble();
        double convert = usd * 23000;
        System.out.println("Giá trị VND là: " + convert);
    }
}
