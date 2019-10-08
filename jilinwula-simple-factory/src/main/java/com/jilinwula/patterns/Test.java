package com.jilinwula.patterns;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入要运算的数字:");
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());

        System.out.println("请输入运算符:（+、-、*、/）");
        String operator = scanner.nextLine();

        System.out.println("请输入要运算的数字:");
        int two = Integer.parseInt(scanner.nextLine());

        AbstractOperation abstractOperation = SimpleFactory.createOperation(operator);
        abstractOperation.setA(one);
        abstractOperation.setB(two);

        System.out.println(abstractOperation.count());
    }
}
