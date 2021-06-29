package com.wangxl.generics.utils;

import com.wangxl.generics.utils.interfaces.Generator;

/*
* 修改BasicGeneratorDemo.java类，使用显示地构造Generator(也就是不使用create()方法，而是使用显示的构造器)。
* */
public class Exercises14 {
    public static void main(String[] args) {
        Generator<CountedObject> generator = new BasicGenerstor<CountedObject>(CountedObject.class);
        for (int i=0;i<5;i++){
            System.out.println(generator.next());
        }
    }
}
