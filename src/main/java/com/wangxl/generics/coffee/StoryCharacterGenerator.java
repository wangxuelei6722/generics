package com.wangxl.generics.coffee;

import com.wangxl.generics.utils.interfaces.Generator;

import java.util.Iterator;
/*
 * 练习题8：模仿Coffee示例的样子，根据你喜爱的电影人物，创建一个SotryCharacters的类层次结构，
 * 将他们划分为GoodGuys和BadGuys。再按照CoffeeGenerator的形式，编写一个StoryCharacters的生成器。
 *
 * */
public class StoryCharacterGenerator implements Generator<StoryCharacter>,Iterable<StoryCharacter> {

    private int size = 0;
    private Class[] types = {AdaWang.class,Pompeo.class,Trump.class,SnoWhite.class,Schwarzenegger.class};
    //无惨构造函数
    public StoryCharacterGenerator(){}
    public  StoryCharacterGenerator(int sz){
        this.size = sz;
    }
    @Override
    public StoryCharacter next() {
        return null;
    }

    @Override
    public Iterator<StoryCharacter> iterator() {
        return null;
    }
}
