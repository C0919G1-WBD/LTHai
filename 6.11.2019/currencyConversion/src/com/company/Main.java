package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double vnd = conversion(input());
        System.out.println("Số tiền việt tương ứng là: " + vnd);
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số USD bạn muốn đổi sang VNĐ: ");
        int usd = sc.nextInt();
        return usd;
    }

    public static double conversion(int usd) {
        int rate = 23000;
        double vnd = usd * rate;
        return vnd;
    }
}
