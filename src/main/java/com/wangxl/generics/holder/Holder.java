package com.wangxl.generics.holder;
/*
* 为什么要有泛型：
*       一般的类和方法，只能使用具体的类型，要么是基本类型，要么是自定义的类。如果要编写可以应用于多种类型的代码，
*   这种刻板的限制对代码对的束缚就会很大。
* */
class Automobile{

}
public class Holder {
    private  Automobile a;
    public Holder(Automobile a){
        this.a = a;
    }
    Automobile get(){
        return a;
    }
}
/*
* 这个类可以复用性低，无法持有其他类型的任何对象。
* */