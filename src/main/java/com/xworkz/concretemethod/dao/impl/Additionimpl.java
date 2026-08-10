package com.xworkz.concretemethod.dao.impl;

import com.xworkz.concretemethod.dao.Addition;

public class Additionimpl implements Addition {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int mul(int a, int b) {
        return a+b;  //overridden method provides its own implementation that is a+b
    }



}
