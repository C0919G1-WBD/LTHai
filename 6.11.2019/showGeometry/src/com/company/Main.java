package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        System.out.println("---Choose your geometry---");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print the isoscles triangle");
        System.out.println("0. Exit");
        do {
            System.out.print("Chọn 1 số: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("--Print the rectangle--");
                    printRectangle();
                    break;
                case 2:
                    System.out.println("--Print 4 kind of square triangle--");
                    printTriangle();
                    break;
                case 3:
                    System.out.println("--Print the isoscles triangle");
                    printIsosclesTriangle();
                    break;
                case 0:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Không có lựa chọn này!!!");
            }
        } while (choose != 0);
    }

    public static void printRectangle() {
        int width = 7;
        int height = 4;
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle() {
        int num = 5;
        //Square up left
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Square up right
        for(int i = 1; i <= num; i++) {
            for(int j = i; j <num; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Square down right
        for(int i = 1; i <= num; i++) {
            for(int k = 1; k < i; k++){
                System.out.print("  ");
            }
            for(int j = num;j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Square down left
        for(int i = 1; i <= num; i++) {
            for(int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsosclesTriangle() {
        int num = 5;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
