package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();

        System.out.print("Nhập vào kích thước mảng: ");
        int size = scanner.nextInt();
        int[][] arr = m.createArray(size);
        m.display(arr);
        int index = 0;
        do {
            System.out.print("Nhập chỉ số cột muốn cộng tổng: ");
            index = scanner.nextInt();
        } while (index > size);
        System.out.println("Tổng các số ở cột thứ " + index + " là " + m.sum(arr, index));
    }

    public int[][] createArray(int size) {
        int[][] arr = new int[size][size];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rd.nextInt(100);
            }
        }
        return arr;
    }

    public int sum(int[][] arr, int index) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == index) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
