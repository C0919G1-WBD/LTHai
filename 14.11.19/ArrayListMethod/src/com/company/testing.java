package com.company;

import java.util.*;

public class testing {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add(0, "Hải");
        myList.add("Trung");
        myList.add("Trung");
        myList.add("Trung");
        myList.add("Trung");
        myList.add("Trung");
        myList.add("Trung");
        myList.add(1,"Sơn");
        for (String item: myList) {
            System.out.println(item);
        }
        System.out.println(myList.size());
        Object newlist = myList.clone();
        System.out.println(newlist);
    }
}
