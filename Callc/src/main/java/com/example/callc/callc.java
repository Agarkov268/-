package com.example.main;

import java.util.Scanner;
public class callc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите операцию, которую хотите выполнить (+, -, *, /)");
        char simvol = scanner.next().charAt(0);

        if (simvol == '+') {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        if (simvol == '-') {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        }
        if (simvol == '*') {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
        if (simvol == '/') {
            double result = (double)a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }
}
