package com.wangxl.generics.utils;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeson){

    }

    public static void main(String[] args) {
        f(New.map());
    }
}
