package com.wangxl.generics.stack3;
/*
* 内部类Node也是一个泛型，它拥有自己的类型参数。
* 这个例子使用了一个末端哨兵（end sentinel）来判断堆栈何时为空。这个末端哨兵是在构造LinkedStack时创建的。
* 然后，每调用一次push()方法，就会创建一个Node<T>对象，并将其连接到前一个Node<T>对象。
* 当你调用pop()方法时，总是返回top.item，然后丢弃当前top所指的Node<T>，并将top转移到下一个Node<T>,除非你已经碰到了末端哨兵，这个时候就不在移动top了，如果已经到了末端，客户端程序
* 还继续调用pop()方法，它只能得到null，说明堆栈已经空了。
* */
public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node() { item = null; next = null; }
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean end() { return item == null && next == null; }
    }
    private Node<T> top = new Node<T>(); // End sentinel 末端哨兵
    public void push(T item) {
        top = new Node<T>(item, top);
    }
    public T pop() {
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }
    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s : "Phasers on stun!".split(" "))
            lss.push(s);
        String s;
        while((s = lss.pop()) != null)
            System.out.println(s);
    }
}
