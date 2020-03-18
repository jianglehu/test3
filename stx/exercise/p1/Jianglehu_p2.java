package com.stx.exercise.p1;

import java.util.Scanner;

public class Jianglehu_p2 {
    /**
     * 功能描述:根据身高和体重获取BMI
     * @param weight    体重(kg)
     * @param height    身高(m)
     */
    public static float getBMI(float weight, float height) {
        return weight / (height * height);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高(m),输入完成后使用回车键结束:");
        float height = scanner.nextFloat();
        System.out.println("请输入体重(kg),输入完成后使用回车键结束:");
        float weight = scanner.nextFloat();
        float BMI=getBMI(weight, height);
        if (BMI >=28) {
            System.out.println("肥胖");
        } else if (BMI >= 24 && BMI < 28) {
            System.out.println("超重");
        } else if (BMI >= 18.5 && BMI < 24) {
            System.out.println("健康体重");
        } else {
            System.out.println("轻体重,多吃肉");
        }
    }
}
