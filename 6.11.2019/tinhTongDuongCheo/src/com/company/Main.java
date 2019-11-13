package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();
        int[][] arr = m.createArray(size);
        m.display(arr);
        System.out.println("Tổng các số ở đường chéo trong ma trận là: " + m.sum(arr));
    }

    public int[][] createArray(int size) {
        Random rd = new Random();
        int[][] arr = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                arr[i][j] = rd.nextInt(100);
            }
        }
        return arr;
    }

    public int sum(int[][] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(i == j) {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    public void display(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
