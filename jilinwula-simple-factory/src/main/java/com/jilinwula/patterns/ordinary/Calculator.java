package com.jilinwula.patterns.ordinary;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("请输入要运算的数字:");
        Scanner scanner = new Scanner(System.in);
        double one = Double.parseDouble(scanner.nextLine());

        System.out.println("请输入运算符:（+、-、*、/）");
        String operator = scanner.nextLine();

        System.out.println("请输入要运算的数字:");
        double two = Double.parseDouble(scanner.nextLine());
        double result = 0;

        switch (operator) {
            case "+":
                result = one + two;
                break;
            case "-":
                result = one - two;
                break;
            case "*":
                result = one * two;
                break;
            case "/":
                result = one / two;
                break;
        }
        System.out.println(String.format("运算的结果为:%s", result));

    }

}
