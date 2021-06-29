package com.wangxl.generics.utils;

import com.wangxl.generics.utils.interfaces.Generator;

public class BasicGenerstor<T> implements Generator {
   private Class<T> type;
   public BasicGenerstor(Class<T> type){
       this.type = type;

   }
   public T next(){
       try {
           return type.newInstance();
       } catch (Exception e) {
           throw new RuntimeException();
       }
   }
   public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerstor<T>(type);
   }
}
