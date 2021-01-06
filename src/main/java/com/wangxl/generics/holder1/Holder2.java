package com.wangxl.generics.holder1;
/*
* 对于Holder 的扩展，希望持有多个类型的对象，我们可以让这个类持有Object类型的对象。
*
* */
public class Holder2 {
    //持有Object 对象
    private Object object;
    //构造函数
    public Holder2(Object object){
        this.object = object;
    }
    //读写器
    private void set(Object object){
        this.object = object;
    }
    public Object get(){
        return object;
    }

    public static void main(String[] args) {
        //持有Automobile 对象
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile) holder2.get();
        //持有String 对象
        holder2.set("Not an Automobile");
        String string = (String) holder2.get();
        //持有Integer对象
        holder2.set(1);
        Integer integer = (Integer) holder2.get();

    }

}
/*
* Holder2可以存储任何类型的对象。先后三次分别存储了三种不同类型的对象。
* */
