package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        double num;
        do {
            System.out.print("Nhập vào 1 số có 3 chữ số: ");
             num = sc.nextInt();
            read(num);
        } while (num < 999);
    }

    public static String readNum(double n) {
        String result = "";
        switch ((int) n) {
            case 0:
                result = " không"; break;
            case 1:
                result = " một"; break;
            case 2:
                result = " hai"; break;
            case 3:
                result = " ba"; break;
            case 4:
                result = " bốn"; break;
            case 5:
                result = " năm"; break;
            case 6:
                result = " sáu"; break;
            case 7:
                result = " bảy"; break;
            case 8:
                result = " tám"; break;
            case 9:
                result = " chín"; break;
        }
        return result;
    }

    public static void read(double n) {
        String readdv = "";
        String readchuc = "";
        String readtram = "";
        double dv = n % 10;
        n = Math.floor(n/10);
        double chuc = n % 10;
        n = Math.floor(n/10);
        double tram = n % 10;

        if(dv == 0 && chuc == 0 && tram == 0) {
            System.out.print(" không");
        } else {
            if(dv != 0 && dv != 5) {
                readdv = readNum(dv);
            } else if(dv == 5 && chuc != 0) {
                readdv = " lăm";
            } else if(dv == 5 && chuc == 0) {
                readdv = readNum(dv);
            } else {
                readdv = "";
            }

            if(chuc != 0 && chuc != 1) {
                readchuc = readNum(chuc) + " mươi";
            } else if(chuc == 1) {
                readchuc = " mười";
            } else {
                readchuc = " lẻ";
            }

            if(tram != 0) {
                readtram = readNum(tram) + " trăm";
            } else {
                readtram = "";
            }
        }

        System.out.println(readtram + readchuc + readdv);
    }
}
