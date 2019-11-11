package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args){
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        System.out.print("Nhập vào chuỗi ban đầu: ");
        String str = scanner.nextLine();
        System.out.println("Nhập vào kí tự muốn tìm trong chuỗi");
        char c = ' ';
        try {
            c = (char) System.in.read();
        } catch (Exception e) {
            System.out.print("Bạn vừa nhập vào 1 chuỗi");
        }
        System.out.println("Số lần kí tự " + c + " xuất hiện trong chuỗi là: "+m.count(str, c));
    }

    public int count(String str, char c) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
