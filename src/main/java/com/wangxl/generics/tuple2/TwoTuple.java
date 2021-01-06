package com.wangxl.generics.tuple2;
/*
* 元组（tuple）：它将一组对象直接打包存储于其中一个单一对象。这个容器对象允许读取其中元素，但是不允许向其中存储新的对象。
*       也称为数据传输对象或者信使。
*       通常元组可以是任意长度。同时元组中的对象可以是任意不同的类型。不过我们希望能够为每一个对象指明其类型，并且从容器中读取出来时，能够得到正确的类型。
*       要处理不同长度的问题，我们需要创建多个不同的元组。
*
* 下面是一个2维元组，它能持有连个对象。
* */
public class TwoTuple<A,B> {

    public final A first;
    public final B second; //此处不违反java编程的安全性原则。first和second都使用了final修饰。这种格式更加简洁明了。

    public TwoTuple(A a,B b){
        first = a;
        second = b;
    }
    public String toString(){
        return "(" + first + " ," + second + ")";
    }
}
/*
* 构造器捕获了要存储的对象，而toString()是一个便利函数，用来显示列表中的值，注意：元组隐含地保持了其中元素的次序。
*
* 另外一种设计考虑，即使希望允许客户端程序员修改first和second所引用的对象。然而采用以上形式无疑是更安全的做法。这样的话，
* 如果程序员想要使用不同元素的元组，就强制他们另外创建一个新的TwoTuple对象。
*
* 为了使用元组，你只需定义一个长度合适的元组，将其作为方法的返回值，然后在return语句中创建该元组，并返回即可。详见TupleTest.java
*
* */