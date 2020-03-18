package com.stx.exercise.p1;

public class Jianglehu1 {

    public static void main(String[] args) {
        int num=300;
        if (num >= 1000) {
            System.out.println("红色区");

        } else if (num >= 500) {
            System.out.println("橙色区");
        } else {
            System.out.println("蓝色区");
        }
    }
}
