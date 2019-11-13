package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] arr = m.createArray(size);
        System.out.println("Mảng trước khi xóa: ");
        m.displayArray(arr);
        System.out.print("\nNhập vào phần tử muốn xóa: ");
        int num = scanner.nextInt();
        System.out.println("Mảng sau khi xóa phần tử " + num + " là: ");
        m.displayArray(m.deleteArray(arr, num));
    }

    public int[] createArray(int size) {
        int[] arr = new int[10];
        Random rd = new Random();
        for(int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public void displayArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int[] deleteArray(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                for(int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        return arr;
    }
}
