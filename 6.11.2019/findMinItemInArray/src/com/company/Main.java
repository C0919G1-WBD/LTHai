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
        int[] arr = m.createArray(size);
        m.displayArray(arr);
        System.out.println("\nPhần tử nhỏ nhất mảng là: " + m.findMin(arr));
    }

    public int[] createArray(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public void displayArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
