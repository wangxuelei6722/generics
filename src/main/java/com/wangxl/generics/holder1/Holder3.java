package com.wangxl.generics.holder1;
/*
* Holder2可以存储任何类型的对象。先后三次分别存储了三种不同类型的对象。通常而言，我们只会使用容器来存储一种类型的对象，
* 泛型主要目的之一就是用来指定容器要持有什么类型的对象。而由编辑器来保证类型的正确性。
* 与其使用Object,我们更喜欢暂时不指定类型，而是稍后再决定具体使用什么类型，要达到这个目的需要使用类型参数，用尖括号<>扩住，放在类型后面。
*  例如：public class Holder3<T>{}；
* 然后在使用这个类的时候，在用实际的类型替换此类型参数，在下面的例子中，T就是类型参数。
*
* */
public class Holder3<T> {
    //持有Object 对象
    private T t;
    //构造函数
    public Holder3(T t){
        this.t = t;
    }
    //读写器
    private void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }

    public static void main(String[] args) {
        //创建Holder3对象时，必须指明
        Holder3<Automobile> holder3 = new Holder3<Automobile>(new Automobile());
        //
    }

}
