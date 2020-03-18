package com.stx.exercise.p2;

import java.util.Scanner;

public class Two_Jianglehu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectNumber;
        while (true) {
            System.out.println("**********************");
            System.out.println("    客户信息管理");
            System.out.println("**********************");
            System.out.println("    1.注册");
            System.out.println("    2.登录");
            System.out.println("    3.退出");
            System.out.println("**********************");
            System.out.println("请选择(1-3):");
            selectNumber = scanner.nextInt();
            if (selectNumber == 1) {
                System.out.println("你已经注册成功,输入1返回主页菜单,输入其他则停留在当前界面继续输入");
                while (true) {
                    selectNumber = scanner.nextInt();
                    if (selectNumber == 1) {
                        break;
                    }
                    System.out.println("输入1返回主菜单");
                }
            } else if (selectNumber == 2) {
                System.out.println("你已经登录成功,输入1返回主页菜单,输入其他则停留在当前界面继续输入");
                while (true) {
                    selectNumber = scanner.nextInt();
                    if (selectNumber == 1) {
                        break;
                    }
                    System.out.println("输入1返回主菜单");

                }
            } else if (selectNumber == 3) {
                break;
            }

        }
    }
}

