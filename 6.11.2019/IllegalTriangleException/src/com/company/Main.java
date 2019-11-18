package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();
        if(a < 0 || b < 0 || c < 0) {
            throw new Exception("Số đo 3 cạnh ko được nhỏ hơn 0");
        } else if(a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception("Tổng hai cạnh không lớn hơn cạnh còn lại");
        }
    }
}
