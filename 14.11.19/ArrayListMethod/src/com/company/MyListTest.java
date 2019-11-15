package com.company;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> ml = new MyList<>();
        ml.add(0, "Trung");
        ml.add(0, "Trung");



        System.out.println(ml.size());
        for(int i = 0; i < ml.size(); i++) {
            System.out.println(ml.get(i));
        }

        Object newlist = (Object) ml.clone();
        System.out.println(newlist);
    }
}
