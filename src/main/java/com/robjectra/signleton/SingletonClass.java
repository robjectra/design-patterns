package com.robjectra.signleton;

import java.io.Serializable;

public class SingletonClass implements Cloneable, Serializable {
    private static volatile SingletonClass instance;

    private SingletonClass(){
        // handling in reflection API
        if (instance != null){
            throw new IllegalArgumentException("this object is private use getInstance Method");
        }
    }

    public static SingletonClass getInstance(){
        if(instance == null){
            // handling in multi threading
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return  instance;
    }

    // handling clone
    @Override
    public SingletonClass clone() {
//        try {
//            Singleton clone = (Singleton) super.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
        return SingletonClass.getInstance();
    }

    // this will call during the deserialization process
    public Object readResolve(){
        return SingletonClass.getInstance();
    }
}
