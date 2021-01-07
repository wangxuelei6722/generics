package com.wangxl.generics.coffee;

import com.wangxl.generics.utils.interfaces.Generator;

import java.util.Iterator;

/*
* 练习题7：使用组合代替继承，适配Fibonacci使其成为Iterable。
*
* */
public class Fibonacci7 implements Generator<Integer>,Iterable<Integer> {

    private int count = 0;
    private int m;

    private int fib(int n){
        if (n<2) return 1;
        return fib(n-2) + fib(n-1);

    }

    @Override
    public Integer next() {
        return null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

}
