package com.wangxl.generics.stack3;

import com.wangxl.generics.utils.Pet;
import com.wangxl.generics.utils.Pets;

import java.util.ArrayList;
import java.util.Random;

/*
* 作为容器的另一个例子，假设我们需要一个持有特定类型对象的列表，每次调用其上的select()方法时，它可以随机地选取一个元素。
* 如果我们希望以此构建一个可以应用于各种类型的对象的工具。就需要用到泛型：
*  练习题6：使用RandomList来处理两种额外的不同类型的元素，要区别于main()中已经用过的类型。
* */
public class RandomList2<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) { storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
        System.out.println();
        RandomList<Integer> ri = new RandomList<Integer>();
        for(int i = 0; i < 11; i++)
            ri.add(i); // autboxing
        for(int i = 0; i < 11; i++)
            System.out.print(ri.select() + " ");
        System.out.println();
        RandomList<Pet> rp = new RandomList<Pet>();
        for(Pet p : Pets.arrayList(10))
            rp.add(p);
        for(int i = 0; i < 11; i++)
            System.out.print(rp.select() + " ");
    }
}
