package com.wangxl.generics.utils;

import com.wangxl.generics.utils.interfaces.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> generator = BasicGenerstor.create(CountedObject.class);
        for (int i=0;i<5;i++){
            System.out.println(generator.next());
        }
    }
}
