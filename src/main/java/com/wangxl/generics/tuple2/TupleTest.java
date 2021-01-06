package com.wangxl.generics.tuple2;

class Amphibian{}

class Vehicle{}

public class TupleTest {

    static TwoTuple<String,Integer> f(){

        return new TwoTuple<String, Integer>("hi",47);
    }

    static ThreeTuple<Amphibian,String,Integer> g(){

        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(),"hi",47);
    }

    static FourTuple<Vehicle,Amphibian,String,Integer> h(){

        return new FourTuple<Vehicle,Amphibian, String, Integer>(new Vehicle(),new Amphibian(),"hi",47);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> i(){

        return new FiveTuple<Vehicle,Amphibian, String, Integer,Double>(new Vehicle(),new Amphibian(),"hi",47,11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttrj = f();
       // ttrj.first ="there"; 编译错误，final修饰，很好的保护了public 元素。
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
    }
}
