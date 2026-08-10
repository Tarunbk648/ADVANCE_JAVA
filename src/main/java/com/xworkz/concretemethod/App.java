package com.xworkz.concretemethod;


import com.xworkz.concretemethod.dao.Addition;
import com.xworkz.concretemethod.dao.impl.Additionimpl;

public class App
{
    public static void main( String[] args )
    {
       Addition addition = new Additionimpl();
       int result = addition.add(10, 20);
       System.out.println(result);

        System.out.println(addition.mul(10, 30));

        System.out.println(Addition.sub(10, 30));
    }
}
