package com.stx.exercise.p1;

import java.util.Scanner;

public class Jianglehu2 {
    public static void main(String[] args) {
        int num;
        System.out.println("请输入数量:");
        Scanner scanner = new Scanner(System.in);
        //从键盘获取数量
        num=scanner.nextInt();
        if (num >= 1000) {
            System.out.println("红色区");

        } else if (num >= 500) {
            System.out.println("橙色区");
        } else if (num >= 100) {
            System.out.println("蓝色区");
        } else {
            System.out.println("白色区");
        }
        }

}
