package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        System.out.print("Nhập vào kích thước mảng thứ nhất: ");
        int size1 = scanner.nextInt();
        int[] arr1 = m.createArray(size1);
        System.out.println("Mảng thứ nhất là: ");
        m.displayArray(arr1);
        System.out.print("\nNhập vào kích thước mảng thứ hai: ");
        int size2 = scanner.nextInt();
        int[] arr2 = m.createArray(size2);
        System.out.println("Mảng thứ 2 là: ");
        m.displayArray(arr2);
        System.out.println("\nMảng sau khi gộp 2 mảng thứ nhất và hai là: ");
        m.displayArray(m.mergeArray(arr1, arr2));
    }

    public int[] createArray(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public int[] mergeArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        return arr;
    }

    public void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
