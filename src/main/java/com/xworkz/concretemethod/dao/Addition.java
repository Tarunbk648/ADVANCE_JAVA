package com.xworkz.concretemethod.dao;

public interface Addition {
    public int add(int a, int b);

    default int mul(int a, int b) {
        return a*b;
    }   //default method can override in the implementation class and give there own implementation or not

    static int sub(int a, int b) {
        return a-b;  //static method cannot override in the impl class accessed in a msin using a class name i.e Addition.sub()
    }

}
