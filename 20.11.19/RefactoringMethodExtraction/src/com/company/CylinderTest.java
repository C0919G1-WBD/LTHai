package com.company;

public class CylinderTest {
    public static void main(String[] args) {
        CylinderTest test = new CylinderTest();
        test.testGetVolume0And0();
        test.testGetVolume1And2();
    }

    void testGetVolume0And0() {
        double radius = 0;
        double height = 0;
        double expected = 0;

        double result = Cylinder.getVolumn(radius, height);
        if (result == expected) {
            System.out.println(result);
        } else {
            System.out.println("Wrong!!");
        }
    }

    void testGetVolume1And2() {
        double radius = 1;
        double height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolumn(radius, height);
        if(result == expected) {
            System.out.println(result);
        } else {
            System.out.println("Wrong!!");
        }
    }
}
