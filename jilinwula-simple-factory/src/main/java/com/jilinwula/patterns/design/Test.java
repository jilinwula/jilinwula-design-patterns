package com.jilinwula.patterns.design;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入要运算的数字:");
        Scanner scanner = new Scanner(System.in);
        double one = Double.parseDouble(scanner.nextLine());

        System.out.println("请输入运算符:（+、-、*、/）");
        String operator = scanner.nextLine();

        System.out.println("请输入要运算的数字:");
        double two = Double.parseDouble(scanner.nextLine());
        double result = 0;

        Operator o = OperatorFactory.createOperator(operator);
        o.setOne(one);
        o.setTwo(two);
        System.out.println(String.format("运算的结果为:%s", o.returnResult()));

    }
}
